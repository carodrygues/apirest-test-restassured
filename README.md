# Consuming REST API with Spring Boot and Testing with REST Assured

Java Version -  `15.0`

1. Project - Calculator
  - run:
  `mvn spring-boot:run`
  - Send a GET request
  `http://localhost:8080/calculate/:operation/:expression`
  
  Note: `:operation` is the math operation that you want to perform. `:expression` is the url-encoded math expression on which you want to operate.
  
  See accepted math operations -> [Newton Math - API](https://github.com/aunyks/newton-api).

 2. Project - Rest-assured
 - test:
  `mvn test`
