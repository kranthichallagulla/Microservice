FROM openjdk:11.0-jdk
ADD ./target/eureka-server-0.0.1-SNAPSHOT.jar /muzix/app/eureka-server-0.0.1-SNAPSHOT.jar
WORKDIR muzix/app
ENTRYPOINT ["java", "-jar", "eureka-server-0.0.1-SNAPSHOT.jar"]

EXPOSE 9091