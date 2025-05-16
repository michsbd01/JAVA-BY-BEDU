public class Principal {
    public static void main(String[] args) {
        Factura facturaConRFC = new Factura(1500.50, "Compra de componentes electrónicos", "XAXX010101000");
        Factura facturaSinRFC = new Factura(780.00, "Compra de libros", null);

        System.out.println(" Factura 1:");
        System.out.println(facturaConRFC.getResumen());

        System.out.println("\n Factura 2:");
        System.out.println(facturaSinRFC.getResumen());
    }
}
