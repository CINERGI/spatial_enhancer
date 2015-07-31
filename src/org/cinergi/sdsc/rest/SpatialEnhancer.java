
package org.cycore.sdsc.rest;

import java.net.URI;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

import java.util.*;
import java.io.*;
import javax.ws.rs.WebApplicationException;
import javax.servlet.http.HttpServletRequest;
import org.cinergi.sdsc.metadata.enhancer.spatial.*;

@Path("SpatialEnhancer")
public class SpatialEnhancer {

    @Context private UriInfo uriInfo;

    @POST
    @Produces("application/json")
    public SpatialEnhancerResult enhance(String text) {
	try {
	    long time = new Date().getTime();
	    File file = new File("/tmp/"+time+".xml");
	    PrintWriter pw = new PrintWriter(file);
	    pw.println(text);
	    pw.close();
	    SpatialEnhancerResult result = SpatialEnhancerResult.process(file);
	    file.delete();
	    return result;
	} catch (Exception ex) {
	    ex.printStackTrace();
	    return null;
	}
    }



}
