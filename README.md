# springboot-crud-example

Spring Boot CRUD example é uma demonstração de como implementar as simples operações de um CRUD com a entidade `Aluno`.

## O que tem?
Esse projeto é baseado em [Spring Boot](https://start.spring.io/) usando esses packages :
- Maven
- Spring Core
- Spring Data (Hibernate & MySQL)
- Spring MVC (Tomcat)
- [Thymleaf](https://thymeleaf.org)

![demo]()

## Instalação 
O projeto é criado com Maven então é necessario tê-lo na máquina, sendo assim, apenas importe o projeto para sua IDE.

## Configuração do database
Crie um database MySQL com o nome 'cadastros' e adicione as credentials em '/resources/application.properties'.  

Configuração default:

```
server.port = 8090
spring.datasource.url=jdbc:mysql://localhost:3306/cadastros
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
```

## Usage 
De run no projeto através da IDE e vá para [http://localhost:8090](http://localhost:8090)

ou 

Por command line:
```
mvn clean install package
mvn spring-boot:run
```
