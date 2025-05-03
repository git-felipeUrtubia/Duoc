package com.example.bibliotecaduoc.repository;


import com.example.bibliotecaduoc.model.Prestamo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PrestamoRepository {

    List<Prestamo> lista_prestamos = new ArrayList<>();

    public List<Prestamo> obtenerPrestamos() {
        return lista_prestamos;
    }

    public String guardarPrestamo(Prestamo prestamo) {
        lista_prestamos.add(prestamo);
        return "Prestamo guardado exitosamente";
    }

    public Prestamo buscarPrestamo(int id_prestamo) {
        for (Prestamo prestamo : lista_prestamos) {
            if (prestamo.getId_prestamo() == id_prestamo) {
                return prestamo;
            }
        }
        return null;
    }

//    public Prestamo editarPrestamo(Prestamo prestamo) {}

    public String eliminarPrestamo(Prestamo prestamo) {
        lista_prestamos.remove(prestamo);
        return "Prestamo eliminado exitosamente";
    }

}
