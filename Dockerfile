FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/autowire-specified-bean-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENV PILL_SERVICE="BluePillServiceImpl"
ENTRYPOINT exec java -DpillService=$PILL_SERVICE -Djava.security.egd=file:/dev/./urandom -jar /app.jar
