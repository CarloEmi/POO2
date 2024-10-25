package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * El tipo de directorio
 */
public class Directory extends FileSystemComponent {
    private List<FileSystemComponent> components = new ArrayList<>();

    /**
     * Instancia un nuevo directorio.
     *
     * @param name the name
     */
    public Directory(String name) {
        super(name);
    }

    /**
     * Añade un componente.
     *
     * @param component El componente
     */
    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    /**
     * Elimina un componente.
     *
     * @param component El componente
     */
    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directorio: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
    }
}
