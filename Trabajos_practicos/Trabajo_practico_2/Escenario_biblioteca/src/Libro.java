/**
 * Clase que representa un libro en la biblioteca.
 */
public class Libro {
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private boolean prestado;

    /**
     * Constructor de la clase Libro.
     *
     * @param titulo       Título del libro
     * @param autor        Autor del libro
     * @param numeroPaginas Número de páginas del libro
     */
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.prestado = false;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getNumeroPaginas() { return numeroPaginas; }
    public boolean isPrestado() { return prestado; }
    public void setPrestado(boolean prestado) { this.prestado = prestado; }
}
