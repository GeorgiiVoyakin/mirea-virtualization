FROM gradle AS build
COPY . /home/gradle/project
WORKDIR /home/gradle/project
ADD https://www.mirea.ru/upload/medialibrary/80f/MIREA_Gerb_Colour.png ./src/main/resources/static
RUN gradle bootJar --no-daemon
ONBUILD RUN echo 'Сборка и запуск произведены. Автор:Воякин Георгий Сергеевич'

FROM openjdk:17
ENV ARTIFACT_NAME=demo-0.0.1-SNAPSHOT.jar
ENV APP_HOME=/home/gradle/project
WORKDIR $APP_HOME
COPY --from=build $APP_HOME/build/libs/$ARTIFACT_NAME .
EXPOSE 8080
ENV PORT="5432"
LABEL author="Voyakin Georgii Sergeevich"
LABEL group="IKBO-13-19"
ENTRYPOINT exec java -jar $ARTIFACT_NAME
