FROM openjdk:8-jdk-alpine
MAINTAINER Muhammad_Syifaul_Ikrom_Almasyriqi <1941720057@student.polinema.ac.id>
RUN mkdir -p /java
WORKDIR /java

COPY Nilai.java /java

#compile file java
RUN javac Nilai.java

#running java
ENTRYPOINT java Nilai