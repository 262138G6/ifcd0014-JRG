package com.curso.repository;

import java.util.List;

// MongoRepository procede de Spring Data MongoDB, que Maven trae con spring-boot-starter-data-mongodb.
import org.springframework.data.mongodb.repository.MongoRepository;

// Importamos el documento que gestiona este repositorio.
import com.curso.model.Tarea;

/**
 * S12-1 Demo 3: Repositorio de tareas con búsqueda por etiqueta
 *
 * Objetivo: disponer de las operaciones de guardar, buscar y borrar tareas en MongoDB y de una
 * búsqueda por etiqueta, sin escribir ninguna consulta.
 *
 * Lo que hace este ejemplo:
 *   - Declara una interfaz que extiende MongoRepository
 *   - Hereda save(), findAll(), findById(), existsById() y deleteById()
 *   - Declara findByEtiquetas(), un método derivado del nombre como los de JPA
 *
 * Concepto clave: los métodos derivados funcionan igual que con JPA. Spring Data lee el nombre
 * del método y construye la consulta de MongoDB; sobre un campo lista, busca los documentos
 * cuya lista contiene el valor.
 */
// MongoRepository<Tarea, String> = documento que gestiona (Tarea) y tipo de su id (String).
public interface TareaRepository extends MongoRepository<Tarea, String> {

    // El nombre se lee como "buscar por etiquetas": el campo es la lista etiquetas y,
    // al pasarle un solo texto, devuelve las tareas cuya lista incluye ese texto.
    // Ejemplo: findByEtiquetas("curso")  →  las tareas con "curso" entre sus etiquetas
    List<Tarea> findByEtiquetas(String etiqueta);
}