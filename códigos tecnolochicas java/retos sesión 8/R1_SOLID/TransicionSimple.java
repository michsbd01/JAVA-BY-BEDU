public class TransicionSimple  {
    @Override
    public void avanzarEscena(String decision) {
        if (decision.equalsIgnoreCase("A")) {
            System.out.println("🌅 Avanzas al bosque encantado...");
        } else {
            System.out.println("🌌 Te internas en las ruinas olvidadas...");
        }
    }
}

