# Dockerfile-back

# Usa la imagen de OpenJDK 17 (o la versión que prefieras)
FROM openjdk:21

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el archivo Maven Wrapper al directorio de trabajo
COPY mvnw .
COPY .mvn .mvn

# Copia el archivo pom.xml para descargar las dependencias
COPY pom.xml .

# Copia el código fuente
COPY src src

# Establece permisos de ejecución para Maven Wrapper
RUN chmod +x mvnw

# Empaqueta la aplicación utilizando Maven Wrapper
RUN ./mvnw package -DskipTests


# Expone el puerto 8001 en el contenedor
EXPOSE 8001

# Comando para ejecutar la aplicación Spring Boot al iniciar el contenedor
# Comando para ejecutar la aplicación Spring Boot al iniciar el contenedor
CMD ["java", "-jar", "target/alCine-0.0.1-SNAPSHOT.jar"]