package com.test.practice;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLRead {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File("Test.xml"));

		String rootElement = doc.getDocumentElement().getNodeName();
		System.out.println("Root Element is : "+rootElement);


		NodeList ns = doc.getElementsByTagName("student");
		System.out.println(ns.getLength());
		
		for(int i=0;i<ns.getLength();i++) {
			
			Node n = ns.item(i);
			
			if(n.getNodeType()==Node.ELEMENT_NODE) {
				
				Element e = (Element)n;
				if(e.getAttribute("rollno").equals("493")) {
				
					System.out.println(e.getAttribute("rollno"));
					NodeList nn = e.getChildNodes();
					
					 for(int k=0;k<nn.getLength();k++) {
						 
						 Node ss = nn.item(k);
						 
						 if(ss.getNodeType()==Node.ELEMENT_NODE) {
							 
							 Element ee = (Element)ss;
							 
							 System.out.println(ee.getTextContent());
							 
						 }
					 }
				}
				
					
					
				
			}
			
		}


	}

}
