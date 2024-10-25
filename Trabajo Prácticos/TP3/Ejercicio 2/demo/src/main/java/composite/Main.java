package composite;

/**
 * La clase principal
 */
public class Main {
    /**
     * Punto de entrada del programa.
     *
     * @param args El argumento de entrada
     */
    public static void main(String[] args) {

        // Crear archivos
        File file1 = new File("File1.txt", 100);
        File file2 = new File("File2.txt", 200);
        File file3 = new File("File3.txt", 300);

        // Crear directorios
        Directory Directory1 = new Directory("Root");
        Directory Directory2 = new Directory("SubDir1");
        Directory Directory3 = new Directory("SubDir2");

        // Agregar archivos y directorios a la estructura
        Directory1.addComponent(file1);
        Directory1.addComponent(Directory2);
        Directory2.addComponent(file2);
        Directory2.addComponent(Directory3);
        Directory3.addComponent(file3);

        // Mostrar detalles de la estructura completa
        Directory1.showDetails();
    }
}