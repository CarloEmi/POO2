import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Clase que representa el sistema de la biblioteca.
 */
public class Biblioteca {
    private List<Libro> libros;
    private Map<String, Usuario> usuarios;

    /**
     * Constructor de la clase Biblioteca.
     */
    public Biblioteca() {
        libros = new ArrayList<>();
        usuarios = new HashMap<>();
    }

    /**
     * Agrega un libro a la biblioteca.
     *
     * @param libro Libro a agregar
     */
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    /**
     * Registra un nuevo usuario en la biblioteca.
     *
     * @param usuario Usuario a registrar
     */
    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    /**
     * Presta un libro a un usuario registrado.
     *
     * @param idUsuario     ID del usuario que solicita el préstamo
     * @param tituloLibro   Título del libro a prestar
     * @param fechaPrestamo Fecha en que se presta el libro
     * @param fechaDevolucion Fecha en que se debe devolver el libro
     */
    public void prestarLibro(String idUsuario, String tituloLibro, Date fechaPrestamo, Date fechaDevolucion) {
        Usuario usuario = usuarios.get(idUsuario);
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(tituloLibro) && !libro.isPrestado()) {
                libro.setPrestado(true);
                usuario.prestarLibro(libro);
                // Aquí podrías registrar la fecha de préstamo y devolución, si es necesario.
                System.out.println("Libro prestado: " + tituloLibro + " a " + usuario.getNombre());
                return;
            }
        }
        System.out.println("Libro no disponible para préstamo.");
    }

    /**
     * Devuelve un libro prestado por un usuario registrado.
     *
     * @param idUsuario  ID del usuario que devuelve el libro
     * @param tituloLibro Título del libro a devolver
     */
    public void devolverLibro(String idUsuario, String tituloLibro) {
        Usuario usuario = usuarios.get(idUsuario);
        for (Libro libro : usuario.getLibrosPrestados()) {
            if (libro.getTitulo().equals(tituloLibro)) {
                libro.setPrestado(false);
                usuario.devolverLibro(libro);
                System.out.println("Libro devuelto: " + tituloLibro + " por " + usuario.getNombre());
                return;
            }
        }
        System.out.println("Libro no encontrado en los préstamos del usuario.");
    }
}
