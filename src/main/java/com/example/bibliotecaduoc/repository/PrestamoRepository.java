package com.example.bibliotecaduoc.repository;


import com.example.bibliotecaduoc.model.Prestamo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PrestamoRepository {

    List<Prestamo> lista_prestamos = new ArrayList();

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

    public Prestamo actualizarPrestamo(Prestamo prestamo) {
        Prestamo nuevoPrestamo = new Prestamo();
        for (Prestamo i : lista_prestamos) {
            if (i.getId_prestamo() == prestamo.getId_prestamo()) {

                nuevoPrestamo.setId_prestamo(prestamo.getId_prestamo());
                nuevoPrestamo.setRun_solicitante(prestamo.getRun_solicitante());
                nuevoPrestamo.setLibro(prestamo.getLibro());
                nuevoPrestamo.setFecha_solicitud(prestamo.getFecha_solicitud());
                nuevoPrestamo.setFecha_entrega(prestamo.getFecha_entrega());
                nuevoPrestamo.setCantidad_dias(prestamo.getCantidad_dias());
                nuevoPrestamo.setMultas(prestamo.getMultas());
            }
        }
        return nuevoPrestamo;
    }

    public void eliminarPrestamo(int id_prestamo) {
        for (Prestamo i : lista_prestamos) {
            if (i.getId_prestamo() == id_prestamo) {
                lista_prestamos.remove(i);
            }
        }
    }

}
