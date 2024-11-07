public class PizzaBasica implements Pizza {
    @Override
    public String getDescripcion() {
        return "Pizza básica";
    }

    @Override
    public double getPrecio() {
        return 5.00;
    }
}
