# Web Entry

## Getting Started
A micro service register it self on eureka and act as project entry point contains Zuul (in order not to access each service by specific ip and port and inorder not to expose service ip and port, you only access com-web-entry and you can access other services by name)


### Prerequisites

Java 7 or 8 installed on your machine

maven installed on your machine

### Installing

You just have to build the project using maven command : mvn clean install

In case you want to skip test use : mvn clean install -DskipTests

Then run the jar you got in your target : java -jar jar-name

###Tests

On postman to test races service particpants method : http://localhost:8080/races/participants
On postman to test races service default method : http://localhost:8080/races
On postman to test participants service races method : http://localhost:8080/participants/races/123

**Notice we access different services (particpants and races) which exists on differnet ports and may be different ips with the same ip and the same port (that's zuul)


## Built With

* [Java 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html) - The java version used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring boot](https://projects.spring.io/spring-boot/) - For embedded server and auto configuration
* [Spring cloud netflix](https://cloud.spring.io/spring-cloud-netflix/) - For service discovery
* [postman](https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=en) -For testing the REST Api

Contact me : karim.abdelmohsen.1992@gmail.com