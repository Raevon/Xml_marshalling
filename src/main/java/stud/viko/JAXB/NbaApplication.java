package stud.viko.JAXB;

import stud.viko.client.Client;
import stud.viko.models.Player;
import stud.viko.server.Server;
import stud.viko.transformation.Transformation;
import stud.viko.transformation.Validation;

/**
Main class that runs unmarshalling and marshalling
@author Dainius
 **/
public class NbaApplication {

	public static void main(String[] args) throws Exception {
		Validation validation = new Validation();
		Transformation transformation= new Transformation();
		Server server = new Server();
		Client client = new Client();
		server.start();
		client.start();
	// in terminal rerun main copy paste
		validation.main();
		Player player =transformation.Unmarshal("player.xml");
		transformation.Marshal("player.xml",player);

	}

}
