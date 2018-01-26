package com.domexample.client;

import java.io.File;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class Test {
public static void main(String[] args) {
	DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
	{
		try{
			
			DocumentBuilder documentBuilder=builderFactory.newDocumentBuilder();
			File file=new File("E://HyderabadTRANINGPractical/HyderaBadTraing/XSD/employee.xml");
			Document document=documentBuilder.parse(file);
			//dDocument Object Reperesent the xml Element in tree Structure Manner
			//1)Toget Element from document object  
			Element rootElement =document.getDocumentElement();
			//Eelement is a child interface of  Node Interface 
			System.out.println(rootElement.getNodeName());
			//2)Get Chield Element from Above Element 
			if(rootElement.hasChildNodes())
			{
				NodeList nodeList=rootElement.getChildNodes();
				for(int i=0;i<nodeList.getLength();i++ ){
					Node employeeNode=nodeList.item(i);
					System.out.println("Element:"+employeeNode.getNodeName());
					if(employeeNode.hasAttributes()){
						System.out.println(employeeNode.getNodeName()+"Attribute");
						NamedNodeMap attributes=employeeNode.getAttributes();
						for(int k=0;k<attributes.getLength();k++)
						{
							Node attributeNode=attributes.item(k);
							System.out.println(attributeNode.getNodeName()+"="+attributeNode.getNodeValue());
						
						}
					}
					if(employeeNode.hasChildNodes()){
						System.out.println(employeeNode.getNodeName()+"="+"Child Element");
						NodeList childNodeList =employeeNode.getChildNodes();
						for(int j=0;j<childNodeList.getLength();j++){
							Node childNode=childNodeList.item(j);
							if(childNode.getNodeType()==Node.ELEMENT_NODE){
								System.out.println(childNode.getNodeName()+"-->"+childNode.getTextContent());
								
							}
								
							
						}
						System.out.println("................................");		
					}
						
				}
				
				
				
				
				
			}
			
			
			
		}catch(ParserConfigurationException|IOException|SAXException E)
		{
			
		}
	}
}

}
