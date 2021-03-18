package stud.viko.transformation;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class Validation {
    public final static String xmlPath = "player.xml";
    public final static String xsdPath = "player.xsd";

    public void main() {

        boolean isValid = validateXMLSchema(xsdPath, xmlPath);

        if (isValid) {
            System.out.println(xmlPath + " is valid against " + xsdPath);
        } else {
            System.out.println(xmlPath + " is not valid against " + xsdPath);
        }
    }


    public static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        } catch (SAXException e1) {
            System.out.println("SAX Exception: " + e1.getMessage());
            return false;
        }

        return true;

    }
}
