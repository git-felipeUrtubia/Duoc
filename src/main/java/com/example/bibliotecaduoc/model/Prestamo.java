package com.example.bibliotecaduoc.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo {

    int id_prestamo;
    String run_solicitante;
    String fecha_solicitud;
    String fecha_entrega;
    int cantidad_dias;
    int multas;

}
