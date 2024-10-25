package TemplateMethod;

/**
 * Clase abstracta Cake que define el método makeCake() y los pasos abstractos
 * que las subclases deben implementar.
 * La clase Cake define el método makeCake() como un "Template Method".
 * Los métodos bakeCake() y packageCake() se implementan directamente en la
 * clase abstracta, ya que estos pasos no varían entre los tipos de pastel.
 * Los métodos prepareIngredients() y decorateCake() son abstractos, permitiendo
 * que cada subclase los implemente de acuerdo con el tipo de pastel específico
 * Subclases:
 * ChocolateCake y VanillaCake heredan de Cake y proporcionan implementaciones
 * específicas para prepareIngredients() y decorateCake(), personalizando el
 * proceso de fabricación para cada tipo de pastel.
 * Cliente: CakeClient es una clase cliente que crea instancias de ChocolateCake
 * y VanillaCake y utiliza el método makeCake() para ejecutar el proceso
 * completo de fabricación.
 */
abstract class Cake {

    /**
     * Método Template Method que define los pasos para hacer un pastel.
     * Este método no debe ser modificado por las subclases.
     */
    public final void makeCake() {
        prepareIngredients();
        bakeCake();
        decorateCake();
        packageCake();
    }

    /**
     * Paso abstracto para preparar los ingredientes específicos de cada pastel.
     */
    protected abstract void prepareIngredients();

    /**
     * Método para hornear el pastel. Este paso es común a todos los tipos de
     * pasteles.
     */
    private void bakeCake() {
        System.out.println("Horneando el pastel a 180 grados por 30 minutos.");
    }

    /**
     * Paso abstracto para decorar el pastel según el tipo específico.
     */
    protected abstract void decorateCake();

    /**
     * Método para empaquetar el pastel. Este paso es común a todos los tipos de
     * pasteles.
     */
    private void packageCake() {
        System.out.println("Empaquetando el pastel en una caja.");
    }
}

/**
 * Clase ChocolateCake que implementa los pasos específicos para un pastel de
 * chocolate.
 */
class ChocolateCake extends Cake {

    @Override
    protected void prepareIngredients() {
        System.out.println(
                "Preparando ingredientes para el pastel de chocolate: harina, huevos, azúcar, cacao en polvo, mantequilla.");
    }

    @Override
    protected void decorateCake() {
        System.out.println("Decorando el pastel con crema de chocolate y chispas de chocolate.");
    }
}

/**
 * Clase VanillaCake que implementa los pasos específicos para un pastel de
 * vainilla.
 */
class VanillaCake extends Cake {

    @Override
    protected void prepareIngredients() {
        System.out.println(
                "Preparando ingredientes para el pastel de vainilla: harina, huevos, azúcar, esencia de vainilla, mantequilla.");
    }

    @Override
    protected void decorateCake() {
        System.out.println("Decorando el pastel con crema de vainilla y rodajas de fresa.");
    }
}

/**
 * Clase cliente CakeClient para crear diferentes tipos de pasteles y
 * fabricarlos usando el método makeCake().
 */
public class CakeClient {
    public static void main(String[] args) {
        Cake chocolateCake = new ChocolateCake();
        Cake vanillaCake = new VanillaCake();

        System.out.println("Fabricando un pastel de chocolate:");
        chocolateCake.makeCake();

        System.out.println("\nFabricando un pastel de vainilla:");
        vanillaCake.makeCake();
    }
}
