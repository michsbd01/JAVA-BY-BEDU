import java.util.Optional;

public class Factura {
    private double monto;
    private String descripcion;
    private Optional<String> rfc;

    public Factura(double monto, String descripcion, String rfc) {
        this.monto = monto;
        this.descripcion = descripcion;
        this.rfc = (rfc == null || rfc.isBlank()) ? Optional.empty() : Optional.of(rfc);
    }

    public String getResumen() {
        String resumen = " Monto: $" + monto +
                         "\n Descripción: " + descripcion +
                         "\n RFC: " + rfc.orElse("[No proporcionado]");
        return resumen;
    }

    // Opcionalmente, podrías tener getters si los necesitas
    public double getMonto() { return monto; }
    public String getDescripcion() { return descripcion; }
    public Optional<String> getRfc() { return rfc; }
}

