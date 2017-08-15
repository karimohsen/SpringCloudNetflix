# Spring Cloud Netflix demos

Each demo project act as micro service. All these micro services communicate together using spring cloud netflix stack

## Getting Started

This repository contain demos for using Spring Cloud Netflix Stack

com-eureka : contains spring eureka for services auto discovery where each service register it self by name.

com-hystrix-turbin : hystrix (to monitor the circuit breakers) and turbine (to manage different streams by name)

com-participants : a micro service register it self on eureka and contain two rest methods

com-race : a micro service register it self on eureka , contains the circuit breaker (to return default response in case a service failed) and feign client as  a declarative web service client

com-web-entry :  a micro service register it self on eureka and act as project entry point contains Zuul (in order not to access each service by specific ip and pot , you only access com-web-entry and you can access other services by name)


### Prerequisites

Java 7 or 8 installed on your machine

maven installed on your machine

### Installing

You just have to build the project using maven command : mvn clean install

In case you want to skip test use : mvn clean install -DskipTests

Then run the jar you got in your target : java -jar jar-name


## Built With

* [Java 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html) - The java version used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring boot](https://projects.spring.io/spring-boot/) - For embedded server and auto configuration
* [Spring cloud netflix](https://cloud.spring.io/spring-cloud-netflix/) - For service discovery
* [postman](https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=en) -For testing the REST Api

Contact me : karim.abdelmohsen.1992@gmail.com