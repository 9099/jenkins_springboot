FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER cmazxiaoma
VOLUME /tmp
ARG JAR_FILE
RUN sh -c 'echo  ${JAR_FILE}'
COPY ${JAR_FILE} app.jar
# todo add files
RUN sh -c 'touch /app.jar'
EXPOSE 7078
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
#FROM java
#MAINTAINER docker_maven docker_maven@email.com
#WORKDIR /ROOT
#CMD ["java", "-version"]
#ENTRYPOINT ["java", "-jar", "${project.build.finalName}.jar"]