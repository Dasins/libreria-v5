import java.util.ArrayList;

/**
 * Crea objetos que simulan la base de datos de una libreria.
 * Los objetos Libreria almacenan colecciones de libros y pueden realizar distintas operaciones con ellos. El objeto se encarga
 * de que no existan duplicados en la lista.
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
     * Anade un libro a la coleccion con el stock por defecto. Si el libro existe en la coleccion, anade 1 unidad a su stock.
     * @param titulo El titulo del libro.
     * @param genero El genero del libro.
     */
    public void anadirLibro(String titulo, String autor, String genero) {
        Libro libro = new Libro(id, titulo, autor, genero);
        int index = indexOf(libro); 
        if(index != -1){
            libros.get(index).aumentarStock();
        }
        else{
            libros.add(libro);
            id++;
        }      
    }
    
    /**
     * Anade un libro a la coleccion especificando el stock por parametro. Si el libro ya existe en la coleccion, 
     * suma el stock indicado por parametro a su stock actual.
     * @param titulo El titulo del libro.
     * @param genero El genero del libro.
     * @param stock El numero de unidades del ejemplar disponibles.
     */
    public void anadirLibro(String titulo, String genero, String autor, int stock) {
        Libro libro = new Libro(id, titulo, genero, autor, stock);
        int index = indexOf(libro); 
        if(index != -1){
            libros.get(index).aumentarStock(stock);
        }
        else{
            libros.add(libro);
            id++; 
        }
    }
    
    /* MOSTRAR POR TERMINAL */
    /**
     * Muestra por terminal de texto todos los datos de los objetos de la coleccion.
     */
    public void mostrarTodos() {
        for(Libro libro : libros) {
            System.out.println(libro);
        }
    }
    
    /* METODOS COMUNES */
    /** 
     * Devuelve el indice de la coleccion de la primera coinciencia con el libro buscado. Si no hay coincidencias, devuelve -1.
     * @param libro El libro buscado dentro de la coleccion.
     */
    public int indexOf(Libro libro) {
        int index = -1, i = 0;
        while (index == -1 && i < libros.size()) {
            if(libro.equals(libros.get(i))) {
                index = i;
            }
            else {
                i++;
            }
        }
        return index;
    }
}
