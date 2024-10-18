import java.util.Date;

/**
 * Clase principal que ejecuta el sistema de la biblioteca.
 */
public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(new Libro("1984", "George Orwell", 328));
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 471));

        // Registrar usuarios
        Usuario usuario1 = new Usuario("1", "Juan Pérez");
        biblioteca.registrarUsuario(usuario1);

        // Prestar libro
        biblioteca.prestarLibro("1", "1984", new Date(), new Date());

        // Devolver libro
        biblioteca.devolverLibro("1", "1984");
    }
}
