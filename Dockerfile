FROM azul/zulu-openjdk-alpine:13
MAINTAINER Pankaj Pardasani
VOLUME /var/jobfinder
EXPOSE 8080
COPY target/*.jar jobfinder.jar
HEALTHCHECK --interval=5m --timeout=3s --retries=3 CMD curl -f http://localhost:8080/swagger-ui.html || exit 1
CMD java -jar jobfinder.jar