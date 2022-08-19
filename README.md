
#Spring Boot
#Cassandra
######## Create Account ############

POST /account HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 134

{
"name":"Rüzgar",
"surname":"Gürgen",
"username":"ruzgar",
"email":"ruzgar@gmail.com",
"password":"12345"
}

#########  GetAll  #####

GET /account HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 134

{
"name":"Rüzgar",
"surname":"Gürgen",
"username":"ruzgar",
"email":"ruzgar@gmail.com",
"password":"12345"
}

######  Update  #####

PUT /account/a2a028cb-a324-42bf-ae71-336aa5629b7c HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 138

{
"name":"Rüzgar",
"surname":"Test",
"username":"ruzgargur",
"email":"ruzgargur@gmail.com",
"password":"12345"
}

##### Delete ####

DELETE /account/a2a028cb-a324-42bf-ae71-336aa5629b7c HTTP/1.1
Host: localhost:8080

