public class Main {
    public static void main(String[] args) {
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("ABC123456XYZ", 15000.00);
        CuentaFiscal cuenta = new CuentaFiscal("ABC123456XYZ", 30000.00);

        System.out.println(" Declaración de impuestos:");
        System.out.println("RFC Contribuyente: " + declaracion.rfcContribuyente());
        System.out.println("Monto declarado: $" + declaracion.montoDeclarado());

        System.out.println("\n Cuenta fiscal:");
        System.out.println("RFC Cuenta: " + cuenta.getRfc());
        System.out.println("Saldo disponible: $" + cuenta.getSaldoDisponible());

        boolean coincide = cuenta.validarRFC(declaracion);
        System.out.println("\n ¿RFCs coinciden?: " + coincide);
    }
}

