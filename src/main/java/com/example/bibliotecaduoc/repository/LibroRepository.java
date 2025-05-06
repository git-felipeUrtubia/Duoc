package com.example.bibliotecaduoc.repository;


import com.example.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    private List<Libro> lista_libros = new ArrayList();


    public LibroRepository() {
        lista_libros.add(new Libro(1, "9789569646638", "Fuego y Sangre", "Penguin Random House Grupo Editorial", 2018, "George R. R. Martin"));
        lista_libros.add(new Libro(2, "9789563494150", "Quique Hache: El Mall Embrujado y Otras Historias", "Sm Ediciones", 2014, "Sergio Gomez"));
        lista_libros.add(new Libro(3, "9781484256251", "Spring Boot Persistence Best Practices", "Apress", 2020, "Anghel Leonard"));
        lista_libros.add(new Libro(4, "9789566075752", "Harry Potter y la piedra filosofal", "Salamandra", 2024, "J. K. Rowling"));
        lista_libros.add(new Libro(5, "9780439139601", "Harry Potter y el prisionero de Azkaban", "Scholastic", 1999, "J. K. Rowling"));
        lista_libros.add(new Libro(6, "9780439136365", "Harry Potter y el cáliz de fuego", "Scholastic", 2000, "J. K. Rowling"));
        lista_libros.add(new Libro(7, "9780321127426", "Effective Java", "Addison- Wesley", 2008, "Joshua Bloch"));
        lista_libros.add(new Libro(8, "9780134685991", "Clean Architecture", "Prentice Hall", 2017, "Robert C. Martin"));
        lista_libros.add(new Libro(9, "9780201633610", "Design Patterns", "Addison- Wesley", 1994, "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides"));
        lista_libros.add(new Libro(10, "9780132350884", "Clean Code", "Prentice Hall", 2008, "Robert C. Martin"));
    }

    public int totalLibros() {
        return lista_libros.size();
    }


    public List<Libro> obtenerLibros(){
        return lista_libros;
    }

    public Libro buscarPorId(int id_libro){

        for (Libro libro : lista_libros) {
            if (libro.getId_libro() == id_libro) {
                return libro;
            }
        }
        return null;
    }

    public Libro buscarPorIsbn(String isbn_libro){

        for (Libro libro : lista_libros) {
            if (libro.getIsbn().equals(isbn_libro)) {
                return libro;
            }
        }
        return null;
    }

    public Libro guardar(Libro libro){
        lista_libros.add(libro);
        return libro;
    }

    public Libro actualizar(Libro libro){
        int id = 0;
        int id_posicion = 0;

        for (int i = 0; i < lista_libros.size(); i++) {
            if (lista_libros.get(i).getId_libro() == libro.getId_libro() ) {
                id = libro.getId_libro();
                id_posicion = i;
            }
        }

        Libro libro1 = new Libro();
        libro1.setId_libro(id);
        libro1.setTitulo(libro.getTitulo());
        libro1.setAutor(libro.getAutor());
        libro1.setFecha_publicacion(libro.getFecha_publicacion());
        libro1.setEditorial(libro.getEditorial());
        libro1.setIsbn(libro.getIsbn());

        lista_libros.set(id_posicion, libro1);
        return libro1;
    }

    public void eliminar(int id_libro){

        Libro libro = buscarPorId(id_libro);

        if (libro != null) {
            lista_libros.remove(libro);
        }
    }

    public void eliminarTodo() {
        lista_libros.clear();
    }

    public List<Libro> cantLibrosPorAnio(int anio) {

        List<Libro> lista_libros_anio = new ArrayList();

        for (Libro libro : lista_libros) {
            if (libro.getFecha_publicacion() == anio) {
                lista_libros_anio.add(libro);
            }
        }
        return lista_libros_anio;
    }

    public List<Libro> LibrosPorAutor(String autor) {
        List<Libro> lista_libros_autor = new ArrayList();

        for (Libro libro : lista_libros) {
            if (libro.getAutor().equals(autor)) {
                lista_libros_autor.add(libro);
            }
        }
        return lista_libros_autor;
    }

    public Libro libroMasAntiguo() {

        Libro masAntiguo = lista_libros.get(0);
        for (Libro libro : lista_libros) {
            if (libro.getFecha_publicacion() < masAntiguo.getFecha_publicacion()) {
                masAntiguo = libro;
            }
        }
        return masAntiguo;
    }

    public Libro libroMasNuevo() {
        Libro masNuevo = lista_libros.get(0);

        for (Libro libro : lista_libros) {
            if (libro.getFecha_publicacion() > masNuevo.getFecha_publicacion()) {
                masNuevo = libro;
            }
        }
        return masNuevo;
    }

}
