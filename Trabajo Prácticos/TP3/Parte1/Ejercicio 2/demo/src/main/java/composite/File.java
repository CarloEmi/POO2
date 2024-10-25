package composite;

/**
 * El tipo de archivo
 */
public class File extends FileSystemComponent {
    private int size;

    /**
     * Instancia un nuevo archivo.
     *
     * @param name El nombre del archivo
     * @param size El tamaño del archivo
     */
    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("File: " + name + " (" + size + " bytes)");
    }
}
