package com.example.bibliotecaduoc.controller;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libro_service;

    @GetMapping("/total")
    public int allLibros(){
        return libro_service.getTotalLibros();
    }

    @GetMapping("/isbn/{isbn}")
    public Libro getLibroPorIsbn(@PathVariable String isbn){
        return libro_service.getLibroByIsbn(isbn);
    }

    @GetMapping
    public List<Libro> listarLibros() {
        return libro_service.getLibros();
    }

    @PostMapping
    public Libro agregarLibro(@RequestBody Libro libro) {
        return libro_service.saveLibro(libro);
    }

    @GetMapping("{id}")
    public Libro buscarLibro(@PathVariable int id) {
        return libro_service.getLibroId(id);
    }

    @PutMapping("{id}")
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro) {
        return libro_service.updateLibro(libro);
    }

    @DeleteMapping("{id}")
    public String eliminarLibro(@PathVariable int id) {
        return libro_service.deleteLibro(id);
    }

    @DeleteMapping
    public String eliminarTodo() {
        return libro_service.deleteAllLibros();
    }

    @GetMapping("/año/{anio}")
    public List<Libro> listarLibrosPorAnio(@PathVariable int anio) {
        return libro_service.cantLibrosEnAnio(anio);
    }

    @GetMapping("/autor/{autor}")
    public List<Libro> buscarLibrosPorAutor(@PathVariable String autor) {
        return libro_service.getLibrosPorAutor(autor);
    }

    @GetMapping("/mas-antiguo")
    public Libro obtenerLibroMasAntiguo() {
        return libro_service.getLibroMasAntiguo();
    }

    @GetMapping("/mas-nuevo")
    public Libro obtenerLibroMasNuevo() {
        return libro_service.getLibroMasNuevo();
    }

}
