package org.prototype.qualifyservice;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class QualifyActivitiesImpl implements QualifyActivities{

	@Override
	public Boolean qualifyFile(String filename) throws SAXException, IOException, ParserConfigurationException{
		// TODO Auto-generated method stub
		return containsPalindrome(filename);
		
	}
	public Boolean containsPalindrome(String filename)throws SAXException, IOException, ParserConfigurationException{
		Boolean containsPalindrome = false;
		if(filename!=null){
			File fXmlFile = new File(filename);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName("word");
			for(int i=0;i<nList.getLength();i++){
				 if(isPalindrome(nList.item(i).getTextContent())){
					 containsPalindrome=true;
					 System.out.println("Contains a palindrome");
					 break;
				 }
			 }
		}
	
		return containsPalindrome;
		
	}
	public Boolean isPalindrome(String word){
		Boolean isPal = true;
		int j = word.length()-1;
		char[] wordArray = word.toCharArray();
		for(int i=0;i<word.length()/2;i++){
			if(wordArray[i]!=wordArray[j]){
				isPal=false;
				break;
			}
		}
		return isPal;
	}

}
