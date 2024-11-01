import Modelo.EnvioExpreso;
import Modelo.EnvioInternacional;
import Modelo.EnvioRegular;
import Modelo.Pedido;

public class TiendaApp {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        // Selección de envío regular
        pedido.setEstrategiaEnvio(new EnvioRegular());
        System.out.println("Envío Regular - Costo: $" + pedido.calcularCostoEnvio() +
                           ", Tiempo de entrega: " + pedido.calcularTiempoEntrega() + " días");

        // Selección de envío expreso
        pedido.setEstrategiaEnvio(new EnvioExpreso());
        System.out.println("Envío Expreso - Costo: $" + pedido.calcularCostoEnvio() +
                           ", Tiempo de entrega: " + pedido.calcularTiempoEntrega() + " días");

        // Selección de envío internacional
        pedido.setEstrategiaEnvio(new EnvioInternacional());
        System.out.println("Envío Internacional - Costo: $" + pedido.calcularCostoEnvio() +
                           ", Tiempo de entrega: " + pedido.calcularTiempoEntrega() + " días");
    }
}