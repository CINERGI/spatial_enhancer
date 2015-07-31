
package org.cinergi.sdsc.metadata;

import java.io.File;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.List;
import java.util.Set;
import java.util.Date;
import java.util.ArrayList;
import java.math.BigDecimal;
import javax.xml.bind.UnmarshalException;
import org.isotc211.iso19139.d_2007_04_17.gmd.EXGeographicBoundingBoxType;
import org.cinergi.sdsc.metadata.enhancer.spatial.ClavinLocationFinder;
import org.cinergi.sdsc.metadata.enhancer.spatial.SpatialTextLocationFinder;
import org.cinergi.sdsc.metadata.enhancer.spatial.StanfordNEDLocationFinder;
import org.cinergi.sdsc.metadata.enhancer.spatial.GoogleGeocoder;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.google.code.geocoder.model.LatLngBounds;
import com.google.code.geocoder.model.LatLng;

public class MetadataLoader {

    private static Logger log = LogManager.getLogger(MetadataLoader.class);

    private static void showBounds(Set<String> locations) throws Exception{

	if (locations.isEmpty()) {
	    log.info("Found no location from the text. ");
	} else {
	    for (String location : locations) {
		log.info("Found a location: "+location);
		//log.info("     Calling google geocoder to get the bounds ...");
		List<LatLngBounds> bounds = GoogleGeocoder.getBounds(location);
		if (bounds.size() == 1) {
		    for (LatLngBounds bound : bounds) {
			LatLng northeast = bound.getNortheast();
			LatLng southwest = bound.getSouthwest();
			log.info("     Bounding box: northeast=("+northeast.getLat()+","+northeast.getLng()+"),  southwest=("+southwest.getLat()+", "+southwest.getLng()+")");
		    }
		} else if (bounds.size() > 1) {
		    log.info("     Found mulitiple bounding boxes. Ignore it."); 
		}
	    }
	}

    }

    public static void main(String[] args) throws Exception {

	//File dir = new File("/Users/kailin/Desktop/metadata/samples/National_Climatic_Data_Center");
	File dir = new File("/Users/kailin/Desktop/metadata/samples/NCDC_GIS");
	String[] filenames = dir.list();
	for (String filename : filenames) {
	    log.info("=============================================================");
	    log.info("Processing the file: "+filename);
	    File file = new File(dir, filename);
	    try {
		List<EXGeographicBoundingBoxType> boxes = ISO19139Metadata.getBoundingBox(file);
		log.info("Metadata Format: ISO19139");
		for (EXGeographicBoundingBoxType box : boxes) {
		    BigDecimal east = box.getEastBoundLongitude().getDecimal();
		    BigDecimal west = box.getWestBoundLongitude().getDecimal();
		    BigDecimal north = box.getNorthBoundLatitude().getDecimal();
		    BigDecimal south = box.getSouthBoundLatitude().getDecimal();
		    log.info("Found bounding box: east="+east+",  south="+south+", west="+west+", north="+north);
		}

		String absText = ISO19139Metadata.getTextDescription(file);
		log.info("-----------------------------------");
		log.info("Extracting text from metadata ...");
		log.info(absText.trim());

		// use UIUC spatialtext to find locations
		log.info("-----------------------------------");
		log.info("Using spatialtext to extract locations ...");
		Set<String> locations = SpatialTextLocationFinder.getLocationsFromText(absText);
		showBounds(locations);
		
		// use Clavin to find locations
		log.info("-----------------------------------");
		log.info("Using Clavin to extract locations ...");
                locations = ClavinLocationFinder.getLocationsFromText(absText);
		showBounds(locations);

		// use Stanford NED to find locations
		/*
		log.info("-----------------------------------");
		log.info("Using Stanford NED to extract locations ...");
                locations = StanfordNEDLocationFinder.getLocationsFromText(absText);
		showBounds(locations);
		*/

	    } catch (UnmarshalException exception) {
		try {
		    org.cinergi.alternative.metadata.Metadata.Idinfo.Spdom.Bounding box = AlternativeMetadata.getBoundingBox(file);
		    log.info("Metadata Format: unknown but parsed");
		    float east = box.getEastbc();
		    float west = box.getWestbc();
		    float north = box.getNorthbc();
		    float south = box.getSouthbc();
		    log.info("Found bounding box: east="+east+",  south="+south+", west="+west+", north="+north);

		    String absText = AlternativeMetadata.getTextDescription(file);
		    log.info("-----------------------------------");
		    log.info("Extracting text from metadata ...");
		    log.info(absText.trim());

		    // use UIUC spatialtext to find locations
		    log.info("-----------------------------------");
		    log.info("Using spatialtext to extract locations ...");
		    Set<String> locations = SpatialTextLocationFinder.getLocationsFromText(absText);
		    showBounds(locations);

		    // use Clavin to find locations
		    log.info("-----------------------------------");
		    log.info("Using Clavin to extract locations ...");
		    locations = ClavinLocationFinder.getLocationsFromText(absText);
		    showBounds(locations);

		    // use Stanford NED to find locations
		    /*
		    log.info("-----------------------------------");
		    log.info("Using Stanford NED to extract locations ...");
		    locations = StanfordNEDLocationFinder.getLocationsFromText(absText);
		    showBounds(locations);
		    */

		} catch (UnmarshalException exception1) {
		    System.out.println("the file doesn't include metaddata for the given schema");
		}
	    }
	}

    }

}