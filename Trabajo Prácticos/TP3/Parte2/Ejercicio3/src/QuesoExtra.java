public class QuesoExtra extends PizzaDecorador {
    public QuesoExtra(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion() + ", Queso Extra";
    }

    @Override
    public double getPrecio() {
        return pizza.getPrecio() + 1.50;
    }
}
