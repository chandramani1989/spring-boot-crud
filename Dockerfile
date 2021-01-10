FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/spring-boot-crud.jar spring-boot-crud.jar.jar
ENTRYPOINT ["java","-jar","spring-boot-crud.jar.jar"]
