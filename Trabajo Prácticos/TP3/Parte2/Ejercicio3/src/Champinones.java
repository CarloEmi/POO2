public class Champinones extends PizzaDecorador {
    public Champinones(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + ", Champinones";
    }

    @Override
    public double getPrecio() {
        return pizza.getPrecio() + 2.00;
    }
}
