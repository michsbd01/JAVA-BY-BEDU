import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var saldo = 1000.0;  // inferido automáticamente por Java
        int opcion;

        do {
            System.out.println("\n Bienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(" Saldo actual: $" + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    if (deposito <= 0) {
                        System.out.println(" Monto inválido. Intente de nuevo.");
                        continue;
                    }
                    saldo += deposito;
                    System.out.println("✅ Depósito exitoso. Nuevo saldo: $" + saldo);
                    break;

                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro <= 0) {
                        System.out.println(" Monto inválido. Intente de nuevo.");
                        continue;
                    }
                    if (retiro > saldo) {
                        System.out.println(" Fondos insuficientes. Su saldo es de $" + saldo);
                        continue;
                    }
                    saldo -= retiro;
                    System.out.println(" Retiro exitoso. Nuevo saldo: $" + saldo);
                    break;

                case 4:
                    System.out.println(" Gracias por usar el cajero. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}
