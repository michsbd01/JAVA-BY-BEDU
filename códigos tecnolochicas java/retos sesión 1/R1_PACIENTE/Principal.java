
import java.util.Scanner;

public class Principal {

    // Método main donde se solicita la información al usuario
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto de tipo Paciente
        Paciente paciente1 = new Paciente();

        // Solicitar y asignar los datos ingresados por el usuario
        System.out.print("Ingresanombre del paciente: ");
        paciente1.nombre = scanner.nextLine();

        System.out.print(" Ingresa la edad: ");
        paciente1.edad = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print(" Ingresa el número de expediente: ");
        paciente1.numeroExpediente = scanner.nextLine();

        // Mostrar los datos ingresados
        paciente1.mostrarInformacion();

        // Cerrar el scanner
        scanner.close();
    }

}
