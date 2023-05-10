FROM amazoncorretto:19-alpine-jdk       
MAINTAINER NEMKA201     
COPY target/portfolio-0.0.1-SNAPSHOT.jar nemka201-app.jar    
ENTRYPOINT ["java","-jar","/nemka201-app.jar"] 
