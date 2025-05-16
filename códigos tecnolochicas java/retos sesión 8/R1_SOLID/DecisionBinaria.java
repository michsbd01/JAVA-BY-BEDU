import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    @Override
    public String obtenerDecision() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué decides hacer?");
        System.out.println("A: Entrar al bosque encantado");
        System.out.println("B: Explorar las ruinas olvidadas");
        System.out.print(">> ");
        return scanner.nextLine();
    }
}

