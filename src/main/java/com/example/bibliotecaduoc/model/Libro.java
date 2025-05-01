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

//    public int getId_libro() {
//        return id_libro;
//    }
//
//    public void setId_libro(int id_libro) {
//        this.id_libro = id_libro;
//    }
//
//    public String getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
//
//    public String getTitulo() {
//        return titulo;
//    }
//
//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }
//
//    public String getEditorial() {
//        return editorial;
//    }
//
//    public void setEditorial(String editorial) {
//        this.editorial = editorial;
//    }
//
//    public String getFecha_publicacion() {
//        return fecha_publicacion;
//    }
//
//    public void setFecha_publicacion(String fecha_publicacion) {
//        this.fecha_publicacion = fecha_publicacion;
//    }
//
//    public String getAutor() {
//        return autor;
//    }
//
//    public void setAutor(String autor) {
//        this.autor = autor;
//    }
//
//    @Override
//    public String toString() {
//        return "Libro{" +
//                "id_libro=" + id_libro +
//                ", isbn='" + isbn + '\'' +
//                ", titulo='" + titulo + '\'' +
//                ", editorial='" + editorial + '\'' +
//                ", fecha_publicacion='" + fecha_publicacion + '\'' +
//                ", autor='" + autor + '\'' +
//                '}';
//    }
}
