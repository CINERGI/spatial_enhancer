
package org.cinergi.sdsc.metadata.enhancer.spatial;

import java.io.*;
import java.util.List;

public class SpatialEnhancer {

    static public void main(String[] arga) throws Exception {

	String cmd = " spatialtext/spatialtext.pl -in spatialtext/sample/sample.txt";

	String[] args = new String[] { cmd };
	Process process = Runtime.getRuntime().exec(args[0]);

	BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
	String line = null;
	while ((line = stdInput.readLine()) != null) {
	    System.out.println(line);
	}
	stdInput.close();

    }

}