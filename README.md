# MSDockApp

**Microservice Docker Application**

This is a proof-of-concept application using Spring Boot, Spring Cloud and Docker.

**Running the Application**

Before running the application, be sure to have the following installed:  
* Maven
* Docker Toolbox

Open a terminal at the project's root directory and issue the following commands:  

```bash
mvn clean install
docker-compose up
```

Fire up a web browser and hit your docker machine IP on port 80 to hit the gateway.

| URL       					  | Description          				   |
| ------------------------------- |:---------------------------------------|
| http://192.168.99.100 		  | The Gateway application (Netflix Zuul) |
| http://192.168.99.100:8761      | The Registry dashboard (Eureka) 	   |