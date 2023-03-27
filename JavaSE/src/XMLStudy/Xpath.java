package XMLStudy;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Xpath {
    public static void main(String[] args) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read("JavaSE/src/XMLStudy/tianqi.xml");
        List<Node> nodes = document.selectNodes("//最高温度[@level='C']");
        for (Node node : nodes) {
            System.out.println(node.getText());
        }
    }
}
