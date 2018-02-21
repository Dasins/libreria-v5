
/**
 * Crea objetos Libro, capaces de almacenar informacion relativa al titulo del ejemplar, el tema editorial
 * y el numero de unidades disponibles.
 * 
 * @tiempo 4min
 * @author d4s1ns
 * @version 2018/02/20
 */
public class Libro {    
    
    // Titulo del libro.
    String titulo;
    // Tema editorial.
    String genero;
    // Numero de ejemplares disponibles.
    int stock;
    
    /**
     * Construye objetos libro, 
     * los nuevos libros se crean con un stock de 1.
     * 
     * @param titulo El titulo del libro.
     * @param genero El tema editorial del libro.
     */
    public Libro(String titulo, String genero) {
        this.titulo = titulo.toUpperCase();
        this.genero = genero.toUpperCase();        
        stock = 1;
    }

}
