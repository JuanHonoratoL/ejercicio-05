# Etapa 1: Compilación con Maven y OpenJDK 26
FROM maven:3.9-eclipse-temurin-26 AS build
WORKDIR /app

# Descargar dependencias para aprovechar la caché de Docker
COPY pom.xml .
RUN mvn dependency:go-offline

# Copiar el código fuente y empaquetar el JAR
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Imagen de ejecución para Java 26
FROM eclipse-temurin:26-jre
WORKDIR /app

# Copiar el JAR generado en la etapa anterior
COPY --from=build /app/target/*.jar app.jar

# Render asigna dinámicamente el puerto
EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java -Dserver.port=${PORT:-8080} -jar app.jar"]
