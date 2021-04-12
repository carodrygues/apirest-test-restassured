# Consuming REST API with Spring Boot and Testing with REST Assured

1. Execute o Projeto Calculator
  - run
  `mvn spring-boot:run`
  - Send a GET request
  `http://localhost:8080/:operation/:expression`
  
  Note: `:operation` is the math operation that you want to perform. `:expression` is the url-encoded math expression on which you want to operate.
  
  See accepted math operations - [Newton - API](https://github.com/aunyks/newton-api). )

 2. Execute o Projeto do Rest Assured
 - test
  `mvn test`
