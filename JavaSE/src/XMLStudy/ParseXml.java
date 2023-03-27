package XMLStudy;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class ParseXml {
    public static void main(String[] args) throws DocumentException {
        //
        SAXReader reader = new SAXReader();
        Document doc = reader.read("JavaSE/src/XMLStudy/test.xml");
        Element rootElement = doc.getRootElement();
        List<Element> elements = rootElement.elements();

        for (Element element : elements) {
            List<Element> bookSon = element.elements();
            for (Element bs : bookSon) {
                String text = bs.getText();
                System.out.println(text);
            }
        }
    }
}
