[Presentation](https://docs.google.com/presentation/d/1w0_JtuYWLCRMRbAeKfEjNg0T99PUhgCCa6q9lQOwbZ4/edit?usp=sharing)

# Start keycloak (new terminal) 
* cd keycloak
* docker-compose up
* login to keycloak http://localhost:8080 and take a look around
# Start client (new terminal)
* cd samlclient
* docker-compose up
* view and download metadata http://localhost/saml/metadata
* Login in to echo service http://localhost/ (correct behavior: an error from keycloak)
# Configure keycloak
* login to keycloak http://localhost:8080
* create user in “test” realm and set password
* create client in keycloak based on metadata
# Login in to echo service 
* Login to the echo service http://localhost/
# Investigate what happens in the browser
* Make the login http://localhost/ and follow the request in the browser debug window
# Configure the SAML token
* Add a attribute to a user
* Map the attribute to the SAML token

