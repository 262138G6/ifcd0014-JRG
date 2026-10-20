package com.curso.repository;

// JpaRepository procede de Spring Data JPA, que Maven trae con spring-boot-starter-data-jpa.
import org.springframework.data.jpa.repository.JpaRepository;

// Importamos la entidad que gestiona este repositorio.
import com.curso.model.Tarea;

/**
 * S11-1 Demo 1: Repositorio de tareas
 *
 * Objetivo: disponer de las operaciones de guardar, buscar y borrar tareas sin escribirlas.
 *
 * Lo que hace este ejemplo:
 *   - Declara una interfaz vacía que extiende JpaRepository
 *   - Hereda save(), findAll(), findById(), count() y deleteById()
 *
 * Concepto clave: el repositorio se declara, no se escribe. Spring Data genera
 * en memoria la clase que implementa la interfaz al arrancar la aplicación.
 */
// JpaRepository<Tarea, Long> = entidad que gestiona (Tarea) y tipo de su clave primaria (Long).
public interface TareaRepository extends JpaRepository<Tarea, Long> {
}
