package testjavaclient;

import java.util.List;

import org.keycloak.admin.client.Keycloak;
import org.keycloak.representations.idm.UserRepresentation;

public class TestApplication {

	public static void main(String[] args) {

		Keycloak keycloak = Keycloak.getInstance(
				"http://localhost:8080/auth",
				"master",
				"sd",
				"Test1234",
				"admin-cli");
		
		List<UserRepresentation> users = keycloak.realm("test").users().list();
		
		if (users != null) {
			for (UserRepresentation user : users) {
				System.out.println("Found user: "+user.getUsername());
			}			
		}
	}
}
