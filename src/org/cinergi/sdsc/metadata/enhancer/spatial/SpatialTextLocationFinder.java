
package org.cinergi.sdsc.metadata.enhancer.spatial;

import java.io.File;
import java.util.Date;
import java.util.Set;
import java.util.HashSet;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class SpatialTextLocationFinder {

    private static Logger log = LogManager.getLogger(SpatialTextLocationFinder.class);

    static public Set<String>  getLocationsFromText(String text) throws Exception {

	// save the text into a file
	File tmpFile = new File("/tmp/"+new Date().getTime());
	PrintWriter pw = new PrintWriter(tmpFile);
	pw.println(text);
	pw.close();

	String cmd = "../webapps/cinergi/WEB-INF/metadata/spatialtext/spatialtext.pl -in "+tmpFile.getAbsolutePath();

	System.out.println("-------------------");
	System.out.println(cmd);


	String[] args = new String[] { cmd };
	Process process = Runtime.getRuntime().exec(args[0]);

	Set<String> locations = new HashSet<String>();
	BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
	String line = stdInput.readLine();
	while ((line = stdInput.readLine()) != null) {
	    System.out.println(line);
	    locations.add(parseLocation(line));
	}
	stdInput.close();
	//tmpFile.delete();

	return locations;

    }


    private static String parseLocation(String line) {
	return line.split(",")[0];
    }

}