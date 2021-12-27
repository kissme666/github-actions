FROM openjdk:8u312-jre-bullseye
LABEL org.opencontainers.image.authors = 'air'


COPY ./app.jar /root
EXPOSE 8080
VOLUME /data
CMD ["java", "-jar", "/root/app.jar"]

