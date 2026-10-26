package com.curso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// S14-2 Demo 1: comentario inocuo para comprobar success
/**
 * S11-1 Práctica 1: Clase principal del proyecto contactos
 *
 * Es la clase que genera el asistente de Spring Boot. En estas prácticas
 * no la usamos: trabajamos solo con la clase Contacto y sus tests.
 */
@SpringBootApplication
public class Aplicacion {

    public static void main(String[] args) {
        SpringApplication.run(Aplicacion.class, args);
    }

}
