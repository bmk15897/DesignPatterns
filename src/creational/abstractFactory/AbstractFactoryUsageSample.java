package creational.abstractFactory;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class AbstractFactoryUsageSample {

	public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
		DocumentBuilderFactory abstractFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder factory = abstractFactory.newDocumentBuilder();
		File f = new File("src\\creational\\abstractFactory\\sample.txt");
		Document doc = factory.parse(f);
        Element element = doc.getDocumentElement();
        NodeList nodes = element.getChildNodes();
        for (int i = 0; i < nodes.getLength(); i++) {
           System.out.print("" + nodes.item(i).getTextContent());
        }
	}
}
