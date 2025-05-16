public class Vuelo {
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado;

    public Vuelo(String codigoVuelo, String destino, String horaSalida) {
        this.codigoVuelo = codigoVuelo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        }
        return false;
    }

    public boolean reservarAsiento(String nombre, String pasaporte) {
        return reservarAsiento(new Pasajero(nombre, pasaporte));
    }

    public void cancelarReserva() {
        asientoReservado = null;
    }

    public String obtenerItinerario() {
        String pasajeroInfo = (asientoReservado != null)
                ? asientoReservado.getNombre()
                : "[Sin reserva]";

        return "\n Itinerario del vuelo:" +
               "\nCódigo: " + codigoVuelo +
               "\nDestino: " + destino +
               "\nSalida: " + horaSalida +
               "\nPasajero: " + pasajeroInfo;
    }
}

