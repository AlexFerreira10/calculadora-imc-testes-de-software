FROM jenkins/jenkins:lts

LABEL authors="kali"

# Muda para o usuário root para instalar pacotes
USER root

# Atualiza os repositórios e instala o Docker
RUN apt-get update && apt-get install -y docker.io

# Retorna para o usuário Jenkins
USER jenkins
