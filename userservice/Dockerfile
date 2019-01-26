FROM openjdk:11.0-jdk
ADD ./target/userservice-0.0.1-SNAPSHOT.jar /muzix/app/userservice-0.0.1-SNAPSHOT.jar
WORKDIR muzix/app
ENTRYPOINT ["java", "-jar", "userservice-0.0.1-SNAPSHOT.jar"]
EXPOSE 8089