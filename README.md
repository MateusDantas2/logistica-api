# Logística

# Sobre o Projeto:

Logística é uma API REST desenvolvida na qual os clientes podem solicitar um serviço de entrega para um endereço final de um destinatário. Sendo que cada entrega possui ocorrências, sejam elas de tentativa de entrega sem sucesso, com sucesso e/ou não encontrada por não existir entrega para tal endereço. Cada entrega também possui o status da mesma, sendo eles de PENDENTE, FINALIZADA e CANCELADA.

### 👉 Modelo Lógico:

<div align="center">
<img src="https://user-images.githubusercontent.com/86339839/171658045-771dc23f-208f-4003-bfef-1c16d3dda28b.png" width="900px" />
</div>


### 🛠 Tecnologias utilizadas:
- Java
- Spring Boot
- Spring Data JPA
- Spring Security
- Maven
- Jakarta Bean Validation
- Lombok

### 👉 Arquitetura:
- REST

### 👉 Pré-requisitos:

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com), [JDK 11 ou Superior](https://jdk.java.net/18/), [MySQL](https://dev.mysql.com/downloads/mysql/) e o [Lombok](https://projectlombok.org/download). 
Além disto é bom ter um editor para trabalhar com o código como [Spring Tools](https://spring.io/tools) ou [Intellij](jetbrains.com/idea/download/#section=windows).

```bash

# clonar repositório
git clone https://github.com/MateusDantas2/logistica-api

# Alterar no arquivo application.properties as propriedades de usuário e senha passando a senha de seu banco de dados local

# Entre na pasta raiz do projeto:
cd logistica-api

# E para rodar o projeto, você pode executar:
java -jar log-api-0.0.1-SNAPSHOT.jar
```
### 👉 Manual das requisições da API
Pré-requisitos: [Postman](https://www.postman.com/downloads/)

### 👉 Features

- [x] CRUD de cliente
- [x] CRUD de entrega
- [x] Cadastro e Listagem de ocorrências
- [x] Cadastro de Destinatário
- [x] Status PENDENTE
- [x] Status FINALIZADA
- [x] Status CANCELADA 

### Autor
---

<a href="https://github.com/MateusDantas2">
 <img style="border-radius: 50%;" src="https://user-images.githubusercontent.com/86339839/171701355-709f003e-0bbe-4203-912c-70f6cb9eade6.jpeg" width="100px;" alt=""/>
 <br />
 <sub><b>Mateus Dantas</b></sub></a> <a href="https://github.com/MateusDantas2" title="Rocketseat">🚀</a>


Feito com ❤️ por Mateus Dantas 👋🏽 Entre em contato!

[![Twitter Badge](https://img.shields.io/badge/-@MateusDantasMa1-1ca0f1?style=flat-square&labelColor=1ca0f1&logo=twitter&logoColor=white&link=https://twitter.com/MateusDantasMa1)](https://twitter.com/MateusDantasMa1) [![Linkedin Badge](https://img.shields.io/badge/-Mateus-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/mateus-dantas-marques/)](https://www.linkedin.com/in/mateus-dantas-marques/) 
[![Gmail Badge](https://img.shields.io/badge/-mateusdantas.dev@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:mateusdantas.dev@gmail.com)](mailto:mateusdantas.dev@gmail.com)
