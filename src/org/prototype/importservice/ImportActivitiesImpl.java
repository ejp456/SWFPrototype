package org.prototype.importservice;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class ImportActivitiesImpl implements ImportActivities{

	@Override
	public String importFile(String filename) throws SAXException, IOException, ParserConfigurationException{
		System.out.println("String: "+filename+" is being imported");
		 DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
	     docFactory.setValidating(false);
	     docFactory.setNamespaceAware(true);
	     // the "parse" method also validates XML, will throw an exception if misformatted
	    DocumentBuilder builder = docFactory.newDocumentBuilder(); 
		Document document = builder.parse(new InputSource(filename));
		
		return filename;
	}

}
