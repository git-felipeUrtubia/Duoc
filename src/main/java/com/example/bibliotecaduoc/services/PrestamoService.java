package com.example.bibliotecaduoc.services;


import com.example.bibliotecaduoc.model.Prestamo;
import com.example.bibliotecaduoc.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoService {
    @Autowired
    private PrestamoRepository prestamo_repository;

    public List<Prestamo> getAllPrestamos() {
        return prestamo_repository.obtenerPrestamos();
    }

    public Prestamo getPrestamoById(int id) {
        return prestamo_repository.buscarPrestamo(id);
    }

    public void save(Prestamo prestamo) {
        prestamo_repository.guardarPrestamo(prestamo);
    }


}
