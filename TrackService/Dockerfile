FROM openjdk:11.0-jdk
ADD ./target/trackservice-0.0.1-SNAPSHOT.jar /muzix/app/trackservice-0.0.1-SNAPSHOT.jar
WORKDIR muzix/app
ENTRYPOINT ["java", "-jar", "trackservice-0.0.1-SNAPSHOT.jar"]
EXPOSE 8088