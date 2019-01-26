FROM openjdk:11.0-jdk
ADD ./target/config-server-0.0.1-SNAPSHOT.jar /muzix/app/config-server-0.0.1-SNAPSHOT.jar
WORKDIR muzix/app
ENTRYPOINT ["java", "-jar", "config-server-0.0.1-SNAPSHOT.jar"]
EXPOSE 8066