FROM amazoncorretto:17-alpine-jdk
MAINTAINER guillekopacek
COPY target/gk-0.0.1-SNAPSHOT.jar gkBack.jar
ENTRYPOINT ["java","-jar","/gkBack.jar"]