public class FlightBooking {
    private String asiento;
    private int equipaje;
    private String comida;
    private boolean serviciosPremium;

    /**
     * Constructor privado para FlightBooking.
     * Utilizado por el Builder para crear una instancia de FlightBooking.
     *
     * @param builder El objeto Builder con las configuraciones de la reserva de vuelo.
     */
    private FlightBooking(Builder builder) {
        this.asiento = builder.asiento;
        this.equipaje = builder.equipaje;
        this.comida = builder.comida;
        this.serviciosPremium = builder.serviciosPremium;
    }

    /**
     * La clase Builder se utiliza para construir una instancia de FlightBooking.
     */
    public static class Builder {
        private String asiento;
        private int equipaje;
        private String comida;
        private boolean serviciosPremium;

        /**
         * Establece el asiento seleccionado para la reserva de vuelo.
         *
         * @param asiento El asiento seleccionado.
         * @return El objeto Builder con el asiento establecido.
         */
        public Builder setAsiento(String asiento) {
            this.asiento = asiento;
            return this;
        }

        /**
         * Establece la cantidad de equipaje para la reserva de vuelo.
         *
         * @param equipaje La cantidad de equipaje.
         * @return El objeto Builder con la cantidad de equipaje establecida.
         */
        public Builder setEquipaje(int equipaje) {
            this.equipaje = equipaje;
            return this;
        }

        /**
         * Establece el tipo de comida para la reserva de vuelo.
         *
         * @param comida El tipo de comida.
         * @return El objeto Builder con el tipo de comida establecido.
         */
        public Builder setComida(String comida) {
            this.comida = comida;
            return this;
        }

        /**
         * Establece si se incluyen servicios premium en la reserva de vuelo.
         *
         * @param serviciosPremium Verdadero si se incluyen servicios premium, falso en caso contrario.
         * @return El objeto Builder con los servicios premium establecidos.
         */
        public Builder setServiciosPremium(boolean serviciosPremium) {
            this.serviciosPremium = serviciosPremium;
            return this;
        }

        /**
         * Construye y devuelve una nueva instancia de FlightBooking con las configuraciones establecidas.
         *
         * @return Una nueva instancia de FlightBooking.
         */
        public FlightBooking build() {
            return new FlightBooking(this);
        }
    }

    /**
     * Retorna una representación en cadena de la reserva de vuelo.
     *
     * @return Una cadena que representa la reserva de vuelo.
     */
    @Override
    public String toString() {
        return "FlightBooking{" +
                "asiento='" + asiento + '\'' +
                ", equipaje=" + equipaje +
                ", comida='" + comida + '\'' +
                ", serviciosPremium=" + serviciosPremium +
                '}';
    }
}

