public class Main {
    public static void main(String[] args) {
        Factura f1 = new Factura("A123", "Cliente A", 1000.00);
        Factura f2 = new Factura("A123", "Cliente B", 2000.00);

        // Mostrar las facturas
        System.out.println(f1);
        System.out.println(f2);

        // Comparar igualdad
        System.out.println("\n¿Las facturas son iguales? " + f1.equals(f2));
    }
}


