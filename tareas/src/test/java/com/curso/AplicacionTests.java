package com.curso;

// @Test es de JUnit y @SpringBootTest es de Spring Boot. Maven las ha descargado con el
// starter de pruebas que declara el pom.xml.
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * S11-1 Demo 1: Test generado del proyecto tareas
 *
 * Objetivo: comprobar que la aplicación arranca.
 *
 * Lo que hace este ejemplo:
 *   - Es el test que genera el asistente de Spring Boot, con el nombre AplicacionTests
 *   - Arranca la aplicación completa, conexión a PostgreSQL incluida
 *
 * Concepto clave: como arranca la aplicación entera, este test necesita la base de datos
 * tareas y la variable de entorno POSTGRES_PASSWORD, igual que la propia aplicación.
 */
// @SpringBootTest arranca la aplicación de Spring Boot dentro del test.
@SpringBootTest
class AplicacionTests {

    // El test está vacío: pasa si el contexto de Spring arranca sin errores
    // y falla si Spring no puede crear algún bean (por ejemplo, si no hay conexión a la base de datos).
    @Test
    void contextLoads() {
    }

}
