# Projeto web services com Spring Boot e JPA

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/luquinhas29/webService/blob/main/LICENSE)
## Sobre o Projeto
```
Projeto web service, objetivo do projeto é implementar as principais tecnologias usando o framework spring boot
implementação de modelo de dominio, estrutura de camadas, configuracao do banco de teste H2, CRUD
e tratamento de Exceções.
``` 

## Objetivos 
- Criar projeto Spring Boot Java 
- Implementar modelo de domínio 
- Estruturar camadas lógicas: resource, service, repository 
- Configurar banco de dados de teste (H2) 
- Povoar o banco de dados 
- CRUD - Create, Retrieve, Update, Delete 
- Tratamento de exceções

## Modelo Conceitual Web Service
![web1](https://github.com/luquinhas29/webService/assets/108932706/ba7d1511-7d84-47b4-b94a-d27035bcbeec)
![web2](https://github.com/luquinhas29/webService/assets/108932706/b51c1d7d-6a51-47af-ab5c-ed44ea76f7fa)
![web3](https://github.com/luquinhas29/webService/assets/108932706/a811bde5-3c5d-45ea-99b0-a0797ffa949e)

## Project created 
- Checklist: 
## Spring Initializr 
- Maven 
- Java 17 
- Packing JAR 
- Dependencies: Spring Web 
- User entity and resource
  
## Basic entity checklist: 
- Basic attributes
- Associations (instantiate collections)
- Constructors
- Getters & Setters (collections: only get)
- hashCode & equals
- Serializable
## H2 database, test profile, JPA 
- Checklist: 
- JPA & H2 dependencies 
- application.properties 
- application-test.properties 
- Entity: JPA mapping 

## Dependencies: 
```
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
<groupId>com.h2database</groupId>
<artifactId>h2</artifactId>
<scope>runtime</scope>
</dependency>
```

## application.properties: 
```
spring.profiles.active=test
spring.jpa.open-in-view=true
application-test.properties: 
```
## DATASOURCE
```
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password= 
```
## H2 CLIENT 
```
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```
## JPA, SQL 
```
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
JPA repository, dependency injection, database seeding 
```
## Checklist: 
- UserRepository extends JPARepository<User, Long> 
- Configuration class for "test" profile 
- @Autowired UserRepository 
- Instantiate objects in memory 
- Persist objects 
