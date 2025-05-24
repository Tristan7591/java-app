# Spring Boot Hello World Demo

Une application Spring Boot simple qui expose un endpoint "Hello World".

## Prérequis

- Java 17
- Maven 3.6+

## Comment exécuter

1. Cloner le repository
2. Exécuter l'application :
```bash
mvn spring-boot:run
```
3. Accéder à l'application : http://localhost:8080

## Tests

Pour exécuter les tests :
```bash
mvn test
```

## Endpoints

- GET `/` : Retourne "Hello, World!" 