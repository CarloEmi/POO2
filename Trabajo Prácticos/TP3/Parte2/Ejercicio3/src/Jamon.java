public class Jamon extends PizzaDecorador {
    public Jamon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + ", Jamon";
    }

    @Override
    public double getPrecio() {
        return pizza.getPrecio() + 3.50;
    }
}
