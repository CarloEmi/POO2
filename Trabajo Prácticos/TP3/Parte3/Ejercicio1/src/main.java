/**
 * Clase principal para demostrar el uso del patrón Builder en la creación de reservas de vuelo.
 */
public class main {
    public static void main(String[] args) {
        /**
         * Crear una reserva de vuelo utilizando el patrón Builder.
         */
        FlightBooking booking = new FlightBooking.Builder()
                .setAsiento("12A")
                .setEquipaje(2)
                .setComida("Vegetariana")
                .setServiciosPremium(true)
                .build();

        /**
         * Imprimir la reserva de vuelo.
         */
        System.out.println(booking);
    }
}
