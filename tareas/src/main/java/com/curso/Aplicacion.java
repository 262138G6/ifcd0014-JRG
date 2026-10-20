package com.curso;

// SpringApplication y @SpringBootApplication proceden de Spring Boot. Maven las ha
// descargado con los starters declarados en el pom.xml: no hay que buscarlas a mano.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * S11-1 Demo 1: Clase principal del proyecto tareas
 *
 * Objetivo: arrancar la aplicación de tareas.
 *
 * Lo que hace este ejemplo:
 *   - Es la clase que genera el asistente de Spring Boot, con el nombre Aplicacion
 *   - Arranca el contenedor de Spring, el servidor Tomcat embebido y la conexión a PostgreSQL
 *
 * Concepto clave: el arranque es el mismo de las sesiones anteriores. Lo que aprendemos
 * en esta parte no cambia la aplicación, sino cómo guardamos y compartimos su historia con Git.
 */
// @SpringBootApplication marca la clase de arranque: Spring escanea su paquete (com.curso)
// y los subpaquetes (model, repository, controller) y crea los beans que encuentra.
@SpringBootApplication
public class Aplicacion {

    // main() es el punto de entrada del programa. SpringApplication.run() crea el contenedor,
    // lo arranca y deja el servidor esperando peticiones.
    public static void main(String[] args) {
        SpringApplication.run(Aplicacion.class, args);
    }

}
