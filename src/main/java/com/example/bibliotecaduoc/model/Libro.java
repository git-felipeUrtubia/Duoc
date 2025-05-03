package com.example.bibliotecaduoc.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {

    private int id_libro;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fecha_publicacion;
    private String autor;

}
