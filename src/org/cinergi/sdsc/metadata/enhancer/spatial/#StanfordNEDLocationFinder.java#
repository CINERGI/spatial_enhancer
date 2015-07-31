
package org.cinergi.sdsc.metadata.enhancer.spatial;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
import edu.stanford.nlp.ie.AbstractSequenceClassifier;
import edu.stanford.nlp.ie.crf.*;
import edu.stanford.nlp.io.IOUtils;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.ling.CoreAnnotations;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class StanfordNEDLocationFinder {

    private static Logger log = LogManager.getLogger(StanfordNEDLocationFinder.class);
    private static String serializedClassifier = "/scratch/slocal/cycore/tomcat6-beta/webapps/cinergi/WEB-INF/metadata/classifiers/english.all.3class.distsim.crf.ser.gz";

    static public Set<String>  getLocationsFromText(String text) throws Exception {

	Set<String> locations = new HashSet<String>();

        AbstractSequenceClassifier<CoreLabel> classifier = CRFClassifier.getClassifier(serializedClassifier);
	String[] example = new String[1];
	example[0] = text;


	String xml = classifier.classifyWithInlineXML(text);
	String start = "<LOCATION>";
        String end = "</LOCATION>";

	int p = xml.indexOf(start);
	int q = xml.indexOf(end);

	while (p != -1 && q != -1) {

	    //System.out.println("------------------------------------");
	    //System.out.println(xml);
	    String loc = xml.substring(p+10, q);
	    //System.out.println("loc = "+loc);
	    locations.add(loc);

	    xml = xml.substring(q + 11);
	    p =xml.indexOf(start);
	    q =xml.indexOf(end);
	}
	

	/*
	for (String str : example) {
	    for (List<CoreLabel> lcl : classifier.classify(str)) {
		for (CoreLabel cl : lcl) {
		    for (Class clazz : cl.keySet()) {
			if (clazz.getSimpleName().equals("AnswerAnnotation") && cl.get(clazz).equals("LOCATION")) {
			    locations.add(cl.value());
			}
		    }

		}
	    }
	}
	*/

	return locations;

    }


    private static String parseLocation(String line) {
	return line.split(",")[0];
    }

}