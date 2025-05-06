package com.example.bibliotecaduoc.controller;


import com.example.bibliotecaduoc.model.Prestamo;
import com.example.bibliotecaduoc.services.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RestController
@RequestMapping("/api/v1/prestamo")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamo_service;

    @GetMapping
    public List<Prestamo> listarPrestamos() {
        return prestamo_service.getAllPrestamos();
    }

    @PostMapping
    public String guardarPrestamo(Prestamo prestamo) {
        prestamo_service.save(prestamo);
        return "Prestamo guardado exitosamente";
    }

    @GetMapping("/{id}")
    public Prestamo buscarPrestamoPorId(@PathVariable int id) {
        return prestamo_service.getPrestamoById(id);
    }

    @PutMapping
    public Prestamo actualizarPrestamo(Prestamo prestamo) {
        return prestamo_service.updatePrestamo(prestamo);
    }

    @DeleteMapping("{id}")
    public String eliminarPrestamo(@PathVariable int id) {
        prestamo_service.deletePrestamo(id);
        return "Prestamo eliminado con exito!";
    }

}
