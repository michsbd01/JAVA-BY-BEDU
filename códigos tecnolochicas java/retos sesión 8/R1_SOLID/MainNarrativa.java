public class MainNarrativa {

    public static void main(String[] args) {
        // Inyección de dependencias (DIP)
        GestorDialogo dialogo = new DialogoTexto();
        LogicaDecision decision = new DecisionBinaria();
       
        // Flujo de escena narrativa
        dialogo.mostrarDialogo("Te encuentras en una encrucijada ancestral.");
        String respuesta = decision.obtenerDecision();
              dialogo.mostrarDialogo("Tu historia apenas comienza...");
    }
}
