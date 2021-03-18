package stud.viko.transformation;

import stud.viko.models.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that performs Object marshalling and unmarshalling
 */
public class Transformation {
    /**
     *
     * Creating JAXB Instance for marshalling and unmarshalling
     *
     *
     */
    JAXBContext jaxbContext;

    {
        try {
            jaxbContext = JAXBContext.newInstance(Player.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * Unmarshalling Object by providing it and entering file name
     * @param path file to read
     * @throws JAXBException  exceptions to catch JAXB errors
     * @throws IOException  exception for file reading
     * @return returns unmarshalled object
     */
    public Player Unmarshal(String path)throws JAXBException, IOException {

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Path filename = Path.of(path);

        String xml = Files.readString(filename);
        System.out.println(xml);

        StringReader reader = new StringReader(xml);

        return  (Player) unmarshaller.unmarshal(reader);

    }

    /**
     * Marshalling object by providing certain parameters
     * @param filepath file to output
     * @param player object to marshal
     * @throws JAXBException exceptions to catch JAXB errors
     * @throws FileNotFoundException exception for file reading
     */
    public void Marshal(String filepath,Player player) throws JAXBException, FileNotFoundException {
        System.out.println(player);
        Marshaller marshaller = jaxbContext.createMarshaller();

        // enable pretty-print XML output
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(player, new FileOutputStream("player.xml"));
        System.out.println("File was marshalled");

    }
}
