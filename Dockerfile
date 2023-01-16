FROM amazoncorretto:11-alpine-jdk
MAINTAINER antonio
COPY target/
ENTRYPOINT ["java","-jar",""]
