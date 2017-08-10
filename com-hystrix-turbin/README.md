# Hystrix & Turbine


## Getting Started

hystrix dashboard (to monitor the circuit breakers) and turbine (to manage different streams by name)

### Prerequisites

Java 7 or 8 installed on your machine

maven installed on your machine

### Installing

You just have to build the project using maven command : mvn clean install

In case you want to skip test use : mvn clean install -DskipTests

Then run the jar you got in your target : java -jar jar-name

###Tests

go to http://localhost:8383/hystrix
Enter the URL http://localhost:8080/hystrix.stream, and click Monitor Stream.

go to http://localhost:8383/hystrix
Enter the URL http://localhost:8383/turbine.stream?cluster=WEB OR http://localhost:8383/turbine.stream?cluster=RACES  , and click Monitor Stream.

## Built With

* [Java 8](http://www.oracle.com/technetwork/java/javase/overview/java8-2100321.html) - The java version used
* [Maven](https://maven.apache.org/) - Dependency Management
* [Spring boot](https://projects.spring.io/spring-boot/) - For embedded server and auto configuration
* [Spring cloud netflix](https://cloud.spring.io/spring-cloud-netflix/) - For service discovery

Contact me : karim.abdelmohsen.1992@gmail.com