import java.util.Objects;

public class Factura {
    private String folio;
    private String cliente;
    private double total;

    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    @Override
    public String toString() {
        return "🧾 Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Factura)) return false;
        Factura otra = (Factura) obj;
        return Objects.equals(this.folio, otra.folio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(folio);
    }

    // Getters si los necesitas
    public String getFolio() { return folio; }
    public String getCliente() { return cliente; }
    public double getTotal() { return total; }
}
