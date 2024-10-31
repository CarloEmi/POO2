public class main {

    public static void main(String[] args) {
        Pizza pizza = new PizzaBasica();
        pizza = new Champinones(pizza);
        pizza = new Jamon(pizza);
        pizza = new QuesoExtra(pizza);
        System.out.println("Descripcion: " + pizza.getDescripcion());
        System.out.println("Precio: " + pizza.getPrecio());
    }

}