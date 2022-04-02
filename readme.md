# Gestión Alumnos - Profesores - Cursos

Desarrollado basado en la Arquitectura Hexagonal que nos permite aislar la lógica de negocio de los elementos externos como motores de base de datos, interfaz grafica o mensajería.

### Funcionalidades
- Gestión de alumnos
- Gestión de profesores
- Gestión de cursos
- Buscar alumnos segun profesor.
- Registrar matrícula de alumnos selecionando curso y profesor.

## Tecnologías
- Java 11
- Spring Framework
- Spring Boot
- Spring Data
- Maven
- JUnit 5
- Mockito
- Swagger
- Lombok
- MapStruct
- H2
- Docker

## Swagger
Puerto y ruta del swagger
```sh
http://localhost:8500/gestion-backend/swagger-ui.html#/
```
## Estructura de carpetas
La estructura de carpetas esta dividida en application, domain e infraestructure.

    └───gestionbackend
        ├───application
        │   ├───response
        │   └───rest
        ├───domain
        │   ├───mapper
        │   ├───repository
        │   ├───request
        │   └───service
        │       └───impl
        └───infraestructure
            ├───config
            ├───entity
            ├───mapper
            └───repository
                └───h2
                    └───jpa
