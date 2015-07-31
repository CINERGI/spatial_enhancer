
package org.cinergi.sdsc.metadata.enhancer.spatial;

import java.util.List;
import java.util.ArrayList;
import com.google.code.geocoder.Geocoder;
import com.google.code.geocoder.GeocoderRequestBuilder;
import com.google.code.geocoder.model.GeocoderRequest;
import com.google.code.geocoder.model.GeocodeResponse;
import com.google.code.geocoder.model.GeocoderResult;
import com.google.code.geocoder.model.GeocoderStatus;
import com.google.code.geocoder.model.LatLngBounds;
import com.google.code.geocoder.model.LatLng;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class GoogleGeocoder {

    // logger
    private static Logger log = LogManager.getLogger(GoogleGeocoder.class);

    static public List<LatLngBounds> getBounds(String location) throws Exception {

	final Geocoder geocoder = new Geocoder();
	List<LatLngBounds> result = new ArrayList<LatLngBounds>();
	GeocoderRequest geocoderRequest = new GeocoderRequestBuilder().setAddress(location).setLanguage("en").getGeocoderRequest();
	GeocodeResponse geocoderResponse = geocoder.geocode(geocoderRequest);
	GeocoderStatus status = geocoderResponse.getStatus();

	if (status == GeocoderStatus.ERROR) {
	    log.info("Google Geocoder Response: ERROR");
	} else if (status == GeocoderStatus.INVALID_REQUEST) {
	    log.info("Google Geocoder Response: INVALID_REQUEST");
	} else if (status == GeocoderStatus.OK) {

	} else if (status == GeocoderStatus.OVER_QUERY_LIMIT) {
	    log.info("Google Geocoder Response: OVER_QUERY_LIMIT");
	} else if (status == GeocoderStatus.REQUEST_DENIED) {
	    log.info("Google Geocoder Response: REQUEST_DENIED");
	} else if (status == GeocoderStatus.UNKNOWN_ERROR) {
	    log.info("Google Geocoder Response: UNKNOWN_ERROR");
	} else if (status == GeocoderStatus.ZERO_RESULTS) {
	    log.info("Google Geocoder Response: ZERO_RESULTS");
	} 

	for (GeocoderResult geocoderResult : geocoderResponse.getResults()) {
	    LatLngBounds bounds = geocoderResult.getGeometry().getViewport();
	    result.add(bounds);
	}
	return result;

    }

}