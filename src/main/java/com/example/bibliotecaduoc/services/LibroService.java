package com.example.bibliotecaduoc.services;


import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libro_repository;

    public int getTotalLibros() {
        return libro_repository.totalLibros();
    }

    public List<Libro> getLibros() {
        return libro_repository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro) {
        return libro_repository.guardar(libro);
    }

    public Libro getLibroId(int id) {
        return libro_repository.buscarPorId(id);
    }

    public Libro updateLibro(Libro libro) {
        return libro_repository.actualizar(libro);
    }

    public Libro getLibroByIsbn(String isbn) {
        return libro_repository.buscarPorIsbn(isbn);
    }

    public String deleteLibro(int id) {
        libro_repository.eliminar(id);
        return "producto eliminado";
    }

    public String deleteAllLibros() {
        libro_repository.eliminarTodo();
        return "productos eliminados";
    }

    public List<Libro> cantLibrosEnAnio(int anio) {
        return libro_repository.cantLibrosPorAnio(anio);
    }

    public List<Libro> getLibrosPorAutor(String autor) {
        return libro_repository.LibrosPorAutor(autor);
    }

    public Libro getLibroMasAntiguo() {
        return libro_repository.libroMasAntiguo();
    }

    public Libro getLibroMasNuevo() {
        return libro_repository.libroMasNuevo();
    }
}
