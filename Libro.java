
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
    
    /* CONSTRUCTORES */
    /**
     * Construye objetos libro, el stock inicial es 1.
     * @param titulo El titulo del libro.
     * @param genero El tema editorial del libro.
     */
    public Libro(String titulo, String genero) {
        this.titulo = titulo.toUpperCase();
        this.genero = genero.toUpperCase();        
        stock = 1;
    }
    
    /**
     * Construye objetos libros con un stock determinado por parametro
     * @param titulo El titulo del libro.
     * @param genero El tema editorial del libro.
     * @param stock El numero de unidades disponibles del libro.
     */
    public Libro(String titulo, String genero, int stock) {
        this.titulo = titulo.toUpperCase();
        this.genero = genero.toUpperCase();        
        this.stock = stock;
    }
    
    /* METODOS GETTER */
    /**
     * Devuelve el titulo del libro.
     * @return Devuelve el titulo del libro.
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Devuelve el tema editorial del libro.
     * @return Devuelve el tema editorial del libro.
     */
    public String getGenero() {
        return genero;
    }
    
    /**
     * Devuelve el numero de unidades disponibles del libro.
     * @return Devuelve el numero de unidades disponibles del libro.
     */
    public int getStock() {
        return stock;
    }
    
    /* METODOS SETTER */
    /**
     * Modifica el titulo del libro.
     * @param titulo El nuevo titulo para el libro.
     */
    public void setTitulo(String titulo) {
        if(titulo != null){
            this.titulo = titulo.toUpperCase();
        }
    }
    
    /**
     *  Modifica el tema editorial del libro.
     *  @param genero El tema editorial del libro.
     */
    public void setGenero(String genero) {
        this.genero = genero.toUpperCase();
    }
    
    /**
     * Modifica el stock actual por el valor introducido por parametro.
     * @param stock El nuevo stock del libro.
     */
    public void setStock(int stock) {
        if(stock >= 0){
            this.stock = stock;
        }
    }
    
    /**
     * Incrementa en una unidad el stock actual.
     */
    public void aumentarStock(){
        stock++;
    }
    
    /**
     * Incrementa el stock actual en la cantidad indicada por parametro
     * @param altas El numero de unidades que se anaden al stock actual.
     */
    public void aumentarStock(int altas) {
        this.stock += altas;
    }
    
    /**
     * Disminuye en una unidad el stock actual, si el stock actual es 0, no hace nada.
     */
    public void disminuirStock() {
        if(stock > 0) {
            stock--;
        }
    }
    
    /**
     * Disminuye el stock actual en la cantidad indicada por parametro, 
     * si la cantidad excede el valor actual, no hace nada.
     * @param bajas
     */
    public void disminuirStock(int bajas) {
        if(bajas <= stock) {
            stock -= bajas;
        }
    }
    
}
