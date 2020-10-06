# Start keycloak (new terminal) 
* cd keycloak
* docker-compose up
* login to keycloak http://localhost:8080 and take a look around
# Start client (new terminal)
* cd samlclient
* docker-compose up
* view and download metadata http://localhost/saml/metadata
* Login in to echo service http://localhost/test (correct behavior: an error from keycloak)
# Configure keycloak
* login to keycloak http://localhost:8080
* create user in “test” realm and set password
* create client in keycloak based on metadata
# Login in to echo service http://localhost/test
# Investigate what happens in the browser

