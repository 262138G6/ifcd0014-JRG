package com.curso.model;

// Importamos las anotaciones de JPA (Jakarta Persistence), el estándar de Java para
// guardar objetos en bases de datos. Maven las ha descargado al declarar
// spring-boot-starter-data-jpa en el pom.xml: no hay que buscarlas ni instalarlas a mano.
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Importamos las anotaciones de Lombok. Maven ha descargado la librería al declarar
// org.projectlombok:lombok en el pom.xml. Lombok las lee al compilar y escribe por nosotros
// el código repetitivo, que queda dentro del .class pero no aparece en el .java.
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * S11-1 Demo 1: Entidad Tarea con Lombok
 *
 * Objetivo: quitar de la entidad el código repetitivo (constructor vacío, getters y setters)
 * y dejar solo lo que dice qué es una tarea.
 *
 * Lo que hace este ejemplo:
 *   - Declara la entidad Tarea sobre la tabla tarea de PostgreSQL
 *   - Pide a Lombok el constructor vacío, los getters y los setters con tres anotaciones
 *
 * Concepto clave: Lombok genera ese código al compilar. El comportamiento no cambia,
 * pero la clase se lee de un vistazo y Git muestra los cambios reales de cada commit.
 */
@Entity
// @Getter escribe un getter por cada campo: getId(), getTitulo(), getDescripcion()
// y isCompletada() (en un boolean, Java usa el prefijo is).
@Getter
// @Setter escribe un setter por cada campo: setId(), setTitulo(), setDescripcion()
// y setCompletada().
@Setter
// @NoArgsConstructor escribe el constructor sin argumentos que Hibernate necesita.
@NoArgsConstructor
public class Tarea {

    // @Id marca la clave primaria; @GeneratedValue con IDENTITY hace que la genere
    // la base de datos (columna autoincremental). Es Long y no long porque una tarea
    // nueva todavía no tiene id y vale null hasta que se guarda.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Sin más anotaciones, cada campo se corresponde con la columna del mismo nombre.
    private String titulo;
    private String descripcion;
    private boolean completada;

    // Este constructor sí lo escribimos nosotros: Lombok no sabe qué campos queremos recibir.
    // @AllArgsConstructor incluiría también el id y completada, que no debemos indicar al crear una tarea.
    public Tarea(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    // toString() devuelve el texto con el que se imprime la tarea;
    // @Override avisa al compilador de que reescribimos el método heredado de Object.
    // Lombok tiene @ToString, pero lo escribimos nosotros para decidir qué campos se imprimen.
    @Override
    public String toString() {
        return "Tarea{id=" + id + ", titulo='" + titulo + "', completada=" + completada + "}";
    }
}
