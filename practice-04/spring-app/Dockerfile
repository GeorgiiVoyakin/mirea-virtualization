FROM gradle AS build
COPY . /home/gradle/project
WORKDIR /home/gradle/project
RUN gradle bootJar --no-daemon

FROM openjdk:17
ENV ARTIFACT_NAME=demo-0.0.1-SNAPSHOT.jar
ENV APP_HOME=/home/gradle/project
WORKDIR $APP_HOME
COPY --from=build $APP_HOME/build/libs/$ARTIFACT_NAME .
EXPOSE 8080
ENV PORT="5432"
ENTRYPOINT exec java -jar $ARTIFACT_NAME
