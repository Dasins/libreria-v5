import java.util.ArrayList;

/**
 * Crea objetos que simulan la base de datos de una libreria.
 * Los objetos libreria almacenan colecciones de libros y pueden realizar distintas operaciones con ellos.
 *
 * @tiempo: 10min
 * @author d4s1ns
 * @version 2018/02/21
 */
public class Libreria {
    
    // Coleccion de libros.
    ArrayList<Libro> libros;
    // Ultimo identificador unico sin asignar.
    int id;
    
    /* CONSTRUCTORES */
    /**
     * Construye objetos libreria.
     */
    public Libreria() {
        libros = new ArrayList<>();
        id = 0;
    }
    
    /* OPERACIONES CON LA COLECCION */
    /**
     * Anade un libro a la coleccion con el stock por defecto.
     * @param titulo El titulo del libro.
     * @param genero El genero del libro.
     */
    public void anadirLibro(String titulo, String genero) {
        libros.add(new Libro(id, titulo, genero));
        id++;
    }
    
    /**
     * Anade un libro a la coleccion especificando el stock por parametro.
     * @param titulo El titulo del libro.
     * @param genero El genero del libro.
     * @param stock El numero de unidades del ejemplar disponibles.
     */
    public void anadirLibro(String titulo, String genero, int stock) {
        libros.add(new Libro(id, titulo, genero, stock));
        id++;
    }
    
    /**
     * Muestra por terminal de texto todos los datos de los objetos de la coleccion.
     */
    public void mostrarTodos() {
        for(Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
