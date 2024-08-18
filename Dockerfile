# Use uma imagem base que tenha Java 22 instalado
FROM openjdk:22

# Adicione o arquivo JAR ao diretório de trabalho
ADD ./docker-spring-boot.jar docker-spring-boot.jar

# Defina o comando para executar o JAR
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]