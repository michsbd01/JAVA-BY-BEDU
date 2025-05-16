public class Principal {
    public static void main(String[] args) {
        // Crear pasajero y vuelo
        Pasajero say = new Pasajero ("SAYRI BADILLO", "S29M09");
        Vuelo vuelo = new Vuelo("SB2007", "corea", "11:30");

        // Reservar asiento
        if (vuelo.reservarAsiento(say)) {
            System.out.println(" Reserva realizada con éxito.");
        }

        // Mostrar itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reserva
        System.out.println("\n Cancelando reserva...");
        vuelo.cancelarReserva();

        // Mostrar itinerario después de cancelar
        System.out.println(vuelo.obtenerItinerario());

        // Reservar asiento con datos directos
        vuelo.reservarAsiento("Mich sbd", "m0927b");

        // Mostrar itinerario final
        System.out.println(vuelo.obtenerItinerario());
    }
}
