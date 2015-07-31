
package org.cinergi.sdsc.metadata.enhancer.spatial;

import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import com.bericotech.clavin.GeoParser;
import com.bericotech.clavin.GeoParserFactory;
import com.bericotech.clavin.resolver.ResolvedLocation;
import com.bericotech.clavin.util.TextUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class ClavinLocationFinder {

    private static Logger log = LogManager.getLogger(ClavinLocationFinder.class);

    static public Set<String> getLocationsFromText(String inputString) throws Exception {

	GeoParser parser = GeoParserFactory.getDefault("/Users/kailin/Desktop/clavin-2.0.0rc1/IndexDirectory/");
	Set<String> locations = new HashSet<String>();
	List<ResolvedLocation> resolvedLocations = parser.parse(inputString);
	for (ResolvedLocation resolvedLocation : resolvedLocations) {
	    String location = parseLocation(resolvedLocation.toString());
            locations.add(location);
	}
	return locations;
    }


    private static String parseLocation(String line) {
	
	// Resolved "United States" as: "United States" {
	String result = null;
	int pos1 = line.indexOf("\" as: \"");
	int pos2 = line.indexOf("\" {");
	if (pos1 != -1 && pos2 != -1) {
	    result = line.substring(pos1+7, pos2);
	}
	return result;
    }

}