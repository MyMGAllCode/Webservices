import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Test {
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
				for(int i=0;i<nodeList.getLength();i++){
					Node node=nodeList.item(i);
if(node.getNodeType()==Node.ELEMENT_NODE)
	{
	System.out.println(node.getNodeName()+"-->"+node.getTextContent());
	}
	}

	
	}}
		catch(ParserConfigurationException|IOException|SAXException E)
		{
			E.printStackTrace();
		}
	}
}

