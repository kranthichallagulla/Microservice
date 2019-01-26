FROM openjdk:11.0-jdk
ADD ./target/Zuul-0.0.1-SNAPSHOT.jar /muzix/app/Zuul-0.0.1-SNAPSHOT.jar
WORKDIR muzix/app
ENTRYPOINT ["java", "-jar", "Zuul-0.0.1-SNAPSHOT.jar"]
EXPOSE 8087