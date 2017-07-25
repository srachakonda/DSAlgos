package XML;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;


/**
 * Created by sampathr on 18/5/17.
 */
public class CreateXmlFileDemo {

    public static void main(String argv[]) {

        try {

            String testString = "UNI$TEST$1~*";

            System.out.println(testString.replaceAll("\\$","__"));
            System.out.println(testString.replaceAll("\\*"," "));
            System.out.println(testString.replaceAll("\\/"," "));

            DocumentBuilderFactory dbFactory =
                    DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder =
                    dbFactory.newDocumentBuilder();
            Document doc = dBuilder.newDocument();
            // root element
            Element rootElement = doc.createElement("employees");
            doc.appendChild(rootElement);

            //  supercars element
            Element supercar = doc.createElement("employee_-test~");
            rootElement.appendChild(supercar);

            // setting attribute to element
            Attr attr = doc.createAttribute("company");
            attr.setValue("Pramati");
            supercar.setAttributeNode(attr);

            // carname elementla ka
            Element carname = doc.createElement("empName");
            Attr attrType = doc.createAttribute("tag");
            attrType.setValue("UNI$TAG");
            carname.setAttributeNode(attrType);
            carname.appendChild(
                    doc.createTextNode("Sampath R"));
            supercar.appendChild(carname);

            Element carname1 = doc.createElement("empName");
            Attr attrType1 = doc.createAttribute("tag");
            attrType1.setValue("UNI$TAG1");
            carname1.setAttributeNode(attrType1);
            carname1.appendChild(
                    doc.createTextNode("Krishna"));
            supercar.appendChild(carname1);

            // write the content into xml file
            TransformerFactory transformerFactory =
                    TransformerFactory.newInstance();
            Transformer transformer =
                    transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result =
                    new StreamResult(new File("/home/sampathr/Desktop/opendope/xmltest/employees.xml"));
            transformer.transform(source, result);
            // Output to console for testing
            StreamResult consoleResult =
                    new StreamResult(System.out);
            transformer.transform(source, consoleResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}