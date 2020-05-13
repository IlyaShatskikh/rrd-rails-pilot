FROM openjdk:11-jdk-slim as build-stage
WORKDIR /pilot-app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN ./mvnw install -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

FROM openjdk:11-jre-slim as production-stage
ARG DEPENDENCY=/pilot-app/target/dependency
COPY --from=build-stage ${DEPENDENCY}/BOOT-INF/lib /pilot-app/lib
COPY --from=build-stage ${DEPENDENCY}/META-INF /pilot-app/META-INF
COPY --from=build-stage ${DEPENDENCY}/BOOT-INF/classes /pilot-app

WORKDIR /pilot-app
EXPOSE 8080
ENTRYPOINT ["java","-cp","./:./lib/*","rzd.rrd.rails.pilot.PilotApplication"]