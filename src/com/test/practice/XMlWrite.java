package com.test.practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMlWrite {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
		
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File("Test.xml"));

		String rootElement = doc.getDocumentElement().getNodeName();
		System.out.println("Root Element is : "+rootElement);

		NodeList ns = doc.getElementsByTagName("student");
		
		for(int i=0;i<ns.getLength();i++) {
			
			
			Node n = ns.item(i);
			
			if(n.getNodeType()==Node.ELEMENT_NODE) {
				
				
				Element e = (Element)n;
				
				if(e.getAttribute("rollno").equals("593")) {
					
					NodeList nn = n.getChildNodes();
					for(int k=0;k<nn.getLength();k++) {
						
						Node aa = nn.item(k);
						
						if(aa.getNodeType()==Node.ELEMENT_NODE) {
							
							if(aa.getNodeName().equals("marks")){
								aa.setTextContent("65");
							}
						}
						
					}
					
					
				}
				
			}
			
			
		}
		
		FileOutputStream output = new FileOutputStream("modified.xml");
		TransformerFactory transformerFactory = TransformerFactory.newInstance();

		Transformer transformer = transformerFactory.newTransformer();
		DOMSource src = new DOMSource(doc);
		StreamResult result = new StreamResult(output);
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		transformer.setOutputProperty(OutputKeys.STANDALONE, "no");
		transformer.transform(src, result);

	}

	
	
	
}
