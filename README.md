# IFCD0014 - Prácticas de Desarrollo Java

Repositorio de prácticas realizadas durante el curso IFCD0014, centradas en el desarrollo de aplicaciones Java con Spring Boot, bases de datos relacionales y NoSQL, y servicios API REST.

## Tecnologías utilizadas

- Java 21
- Spring Boot
- Maven
- Spring Data JPA y Hibernate
- PostgreSQL
- MongoDB y Spring Data MongoDB
- Lombok
- Swagger / OpenAPI
- Postman
- Git y GitHub
- IntelliJ IDEA

## Estructura del repositorio

### 📁 tareas

Proyecto de prácticas con Spring Boot y API REST.

Incluye ejercicios de desarrollo de controladores, gestión de entidades y operaciones HTTP para trabajar con los datos de una aplicación.

### 📁 tareas-mongo

Proyecto de gestión de tareas mediante una API REST conectada a MongoDB.

**Funcionalidades:**

- Crear tareas.
- Consultar tareas.
- Modificar tareas existentes.
- Eliminar tareas.
- Asignar etiquetas a las tareas.
- Filtrar tareas por etiqueta.
- Actualizar etiquetas mediante consultas MongoDB.

**Tecnologías principales:** Java, Spring Boot, Spring Data MongoDB, Lombok y Swagger.

## Ejecución de los proyectos

Cada carpeta contiene su propio proyecto Maven y puede abrirse independientemente en IntelliJ IDEA.

Para ejecutar `tareas-mongo`:

1. Tener Java 21 y MongoDB instalados.
2. Comprobar la conexión a MongoDB en `application.properties`.
3. Abrir el proyecto en IntelliJ IDEA.
4. Ejecutar la clase principal `Aplicacion`.
5. Acceder a Swagger UI:

   `http://localhost:8080/swagger-ui.html`

La configuración local utilizada para MongoDB es:

`mongodb://localhost:27017/tareas`

## Organización del trabajo

Los proyectos están organizados por prácticas y sesiones del curso. Se utiliza Git para el control de versiones y GitHub para mantener una copia remota del código y su evolución.

---

**Curso:** IFCD0014  
**Grupo:** 262138G6  
**Repositorio:** ifcd0014-JRG
