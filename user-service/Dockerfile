#Dockerfile to build Micro Service Reference docker image
FROM openjdk:8
VOLUME /tmp
COPY target/user-service-0.0.1-SNAPSHOT.jar /tmp/user-service-0.0.1-SNAPSHOT.jar
#ENV PORT 8080
EXPOSE 80
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-jar", "/tmp/user-service-0.0.1-SNAPSHOT.jar"]
