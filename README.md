# spring-primary-bean-impl
Spring example of defining specific implementation of autowired service at runtime

# Overview
Sometimes it is necessary to have multiple implementations of the same interface and define which specification is implemented at runtime.  This project demonstrates this functionality by using system environment variables to define which bean definition is the primary bean.

# Desciption
This application has a `PillService` which returns a simple `Pill` model.  This model can be accessed at the base URL of the deployed application using a HTTP GET (`http://localhost:8080`).  The default implementation is the `BluePillServiceImpl`.  To override, set environment variable `PILLSERVICE` to: `RedPillServiceImpl` or `BluePillServiceImpl`.

# Example

## Local
1) Set environment variable `PILLSERVICE` to: `RedPillServiceImpl` or `BluePillServiceImpl` **Not Required**
2) From project root, build using `mvn package`
3) Run using `java -jar target/autowire-specified-bean-0.0.1-SNAPSHOT.jar`

## Vagrant

Todo

## Docker

Todo