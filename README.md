# Spring-Boot-Microservices
Spring Boot Application developed based on Microservice Architecture

Microservices Implemented
- DATA-SERVICE: It is responsible for fetching the data from the database
- QUERY-SERVICE: It is user facing service responsible to implicitely call DATA-SERVICE to get the necessary data.

Application also contains a API-GATEWAY developed using Spring Cloud Gateway which is responsible to route the requests to the appropiate microservice.
