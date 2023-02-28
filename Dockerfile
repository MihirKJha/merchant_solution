# Start with a base image containing Java runtime
FROM openjdk:17-ea-3-jdk

# Add Maintainer Info
LABEL maintainer="mihir.iiest@gmail.com"

COPY ./target/merchant_solution-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch merchant_solution-0.0.1-SNAPSHOT.jar'

EXPOSE 8081

ENTRYPOINT ["java","-jar","merchant_solution-0.0.1-SNAPSHOT.jar"]