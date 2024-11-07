public abstract class PizzaDecorador implements Pizza {
    protected Pizza pizza;

    public PizzaDecorador(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescripcion() {
        return pizza.getDescripcion();
    }

    @Override
    public double getPrecio() {
        return pizza.getPrecio();
    }
}
