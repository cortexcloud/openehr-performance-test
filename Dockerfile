FROM openjdk:11.0.15-jre

#RUN apk update && \
#    apk add wget

ARG JMETER_VERSION=5.4.3
ENV JMETER_HOME /opt/apache-jmeter-${JMETER_VERSION}

RUN wget https://archive.apache.org/dist/jmeter/binaries/apache-jmeter-${JMETER_VERSION}.tgz && \
    tar -xzf /apache-jmeter-${JMETER_VERSION}.tgz -C /opt && \
    rm apache-jmeter-${JMETER_VERSION}.tgz

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

COPY test-plans/*.jmx /opt/webtester/test-plans/

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]