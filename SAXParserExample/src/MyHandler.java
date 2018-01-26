import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler{
	public void startDocument()
	{
		System.out.println("Document Started");
		
	}
	public void endDocument()
	{
		
	System.out.println("Document Ended");
			

}
	public void ststElement(String uri,String localNmae,String qName, Attributes attributes)throws SAXException
	{
		System.out.println("StartElment Name"+qName);
		
		if(attributes.getLength()>0){
			System.out.println("Attributes");
			for(int i=0;i<attributes.getLength();i++){
				String attrName=attributes.getQName(i);
				String attValue=attributes.getValue(i);
				System.out.println(attrName+"="+attValue);
			}
				
		}
	}
	public void ststElement(String uri,String localNmae,String qName)
	{
		System.out.println("End Element Name--->"+qName);
	}
	public void characters(char ch[], int start, int length)throws SAXException
	{
		String s=new String(ch ,start, length);
		if(s.trim().length()>0){
			System.out.println(s);
		}
	
	}
	public void error(SAXException e)throws SAXException{
		throw new SAXException(e);
	}
}
