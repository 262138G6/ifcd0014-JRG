package com.curso.controller;

import java.util.List;

// Estas anotaciones y la clase ResponseStatus proceden de Spring MVC, que Maven trae
// con spring-boot-starter-webmvc. HttpStatus enumera los códigos de estado de HTTP.
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Tarea;
import com.curso.repository.TareaRepository;

// RequiredArgsConstructor procede de Lombok, que Maven ha descargado con el pom.xml.
import lombok.RequiredArgsConstructor;

/**
 * S11-1 Demo 1: Controlador REST de tareas con Lombok
 *
 * Objetivo: ofrecer la lista de tareas y el alta de una tarea nueva como API REST,
 * sin escribir el constructor de inyección.
 *
 * Lo que hace este ejemplo:
 *   - GET /api/tareas devuelve todas las tareas en JSON
 *   - POST /api/tareas guarda la tarea recibida y devuelve 201
 *
 * Concepto clave: @RequiredArgsConstructor escribe el constructor que recibe los campos final.
 * Spring lo usa para inyectar el repositorio igual que antes.
 */
@RestController
@RequestMapping("/api/tareas")
// @RequiredArgsConstructor escribe un constructor con un parámetro por cada campo final
// (aquí, tareaRepository). Es el constructor que antes escribíamos a mano.
@RequiredArgsConstructor
public class TareaController {

    // final = el campo se asigna una sola vez, en el constructor que genera Lombok.
    private final TareaRepository tareaRepository;

    /**
     * Devuelve todas las tareas.
     *
     * Ejemplo:
     *   GET /api/tareas  →  [{"titulo":"Preparar la demo de Git", ..., "id":1}, ...]
     */
    @GetMapping
    public List<Tarea> listar() {
        // findAll() devuelve todas las filas de la tabla tarea, sin ningún orden concreto.
        return tareaRepository.findAll();
    }

    /**
     * Guarda una tarea nueva.
     *
     * Ejemplo:
     *   POST /api/tareas  {"titulo": "Comprar café"}  →  201 y la tarea con su id
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tarea crear(@RequestBody Tarea tarea) {
        // Anulamos el id recibido: save() inserta si el id es null y actualiza si existe,
        // y aquí queremos que siempre cree una tarea nueva.
        tarea.setId(null);
        return tareaRepository.save(tarea);
    }
}
