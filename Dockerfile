FROM amazoncorretto:19-alpine-jdk       // Imagen de la que partimos
MAINTAINER NEMKA201     // Dueño Imagen
COPY target/portfolio-0.0.1-SNAPSHOT.jar nemka201-app.jar    // Copia empaquetado github
ENTRYPOINT ["java","-jar","/nemka201-app.jar"]     // Instruccion que ejecuta primero
