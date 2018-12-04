[![DepShield Badge](https://depshield.sonatype.org/badges/mkez00/spring-primary-bean-impl/depshield.svg)](https://depshield.github.io)

# Overview
Sometimes it is necessary to have multiple implementations of the same interface and define which specific implementation is used at runtime.  This project demonstrates this functionality by using environment variables to define which bean definition is the primary bean.

# Desciption
This application has a `PillService` which returns a simple `Pill` model.  This model can be accessed at the base URL of the deployed application using a HTTP GET (`http://localhost:8080`).  The default implementation is the `BluePillServiceImpl`.  To override, set environment variable `pillService` to: `RedPillServiceImpl` or `BluePillServiceImpl`.

# Example
All examples listed below will override the default implementation and use the `RedPillServiceImpl` to demonstrate functionality.  To use the default (`BluePillServiceImpl`), either remove the setting of the environment/system variable (since `BluePillServiceImpl` is the default implementation), or explicitly set the `pillService` variable to `BluePillServiceImpl`.

## Local
1) From project root, build using `mvn package`
2) Run using `java -DpillService=RedPillServiceImpl -jar target/autowire-specified-bean-0.0.1-SNAPSHOT.jar`
3) Go to `http://localhost:8080`

## Vagrant
1) From project root, `vagrant up`
2) Go to `http://192.168.56.145:8080`

## Docker

### Build Image
1) From project root, build using `mvn package`
2) Build Docker image `docker build . -t mkez00/spring-primary-bean-impl`
3) Push Docker image to Docker Hub `docker push mkez00/spring-primary-bean-impl`

### Run Container
1) Run `docker run -d -e PILL_SERVICE=RedPillServiceImpl -p 127.0.0.1:8888:8080 mkez00/spring-primary-bean-impl`
2) Go to `http://localhost:8888`

### Docker Hub
1) Docker image available on Docker Hub: <a href="https://hub.docker.com/r/mkez00/spring-primary-bean-impl/">mkez00/spring-primary-bean-impl</a>
