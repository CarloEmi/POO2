package composite;

/**
 * La clase de componente de sistema de archivos.
 */

public abstract class FileSystemComponent {
    /**
     * Atributo de nombre.
     */
    protected String name;

    /**
     * Instancia un nuevo componente de sistema de archivos.
     *
     * @param name El nombre del componente
     */
    public FileSystemComponent(String name) {
        this.name = name;
    }

    /**
     * Muestra los detalles.
     */
    public abstract void showDetails();
}
