FROM java:8-jre

MAINTAINER Tony Lopez <tony.lopez1013@gmail.com>

COPY ./target/config-0.0.1-SNAPSHOT.jar /app/config.jar

CMD ["java", "-jar", "/app/config.jar"]

HEALTHCHECK --interval=10s --timeout=3s CMD curl -f http://localhost:8888/health || exit 1