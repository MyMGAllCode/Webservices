import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Test {
	public static void main(String[] args)throws ParserConfigurationException ,IOException {
		
		SAXParserFactory factory =SAXParserFactory.newInstance();
		
		factory.setValidating(true);
		try{
			SAXParser SaxParser=factory.newSAXParser();
			
			MyHandler myHandler=new MyHandler();
			SaxParser.parse(new File("E:/HyderabadTRANINGPractical/HyderaBadTraing/XSD/employee.xml"),myHandler);
		System.out.println("Document Valid");	
		}catch(SAXException e){
			System.out.println("Document is invalid");
			System.out.println(e);
		}
	}

}
