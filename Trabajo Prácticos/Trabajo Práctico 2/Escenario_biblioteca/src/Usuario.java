import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un usuario registrado en la biblioteca.
 */
public class Usuario {
    private String id;
    private String nombre;
    private List<Libro> librosPrestados;

    /**
     * Constructor de la clase Usuario.
     *
     * @param id     ID único del usuario
     * @param nombre Nombre del usuario
     */
    public Usuario(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        librosPrestados = new ArrayList<>();
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    /**
     * Presta un libro al usuario.
     *
     * @param libro Libro a prestar
     */
    public void prestarLibro(Libro libro) {
        librosPrestados.add(libro);
    }

    /**
     * Devuelve un libro prestado por el usuario.
     *
     * @param libro Libro a devolver
     */
    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
    }
}
