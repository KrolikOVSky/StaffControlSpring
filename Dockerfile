FROM openjdk:14
ADD /target/staff-controll.jar staff-controll.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "staff-controll.jar"]