#!/bin/bash

curl -d "client_id=admin-cli" -d "username=sd" -d "password=Test1234" -d "grant_type=password" http://keycloak:8080/auth/realms/master/protocol/openid-connect/token | jq -r '.access_token' 
