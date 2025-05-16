import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class RegistroMuestras {

    public static void main(String[] args) {

        // 📥 ArrayList para registrar el orden de llegada (pueden repetirse)
        ArrayList<String> ordenMuestras = new ArrayList<>();
        ordenMuestras.add("Homo sapiens");
        ordenMuestras.add("Mus musculus");
        ordenMuestras.add("Arabidopsis thaliana");
        ordenMuestras.add("Homo sapiens");

        // 🧬 HashSet para especies únicas (elimina duplicados)
        HashSet<String> especiesUnicas = new HashSet<>(ordenMuestras);

        // 🧑‍🔬 HashMap para asociar ID de muestra con investigador responsable
        HashMap<String, String> muestraInvestigador = new HashMap<>();
        muestraInvestigador.put("M-001", "Dra. López");
        muestraInvestigador.put("M-002", "Dr. Hernández");
        muestraInvestigador.put("M-003", "Dr. Pérez");

        // Mostrar la lista completa y ordenada de muestras
        System.out.println("📥 Orden de llegada de las muestras:");
        for (String especie : ordenMuestras) {
            System.out.println("- " + especie);
        }
        System.out.println();

        // Mostrar las especies únicas procesadas
        System.out.println("🧬 Especies únicas procesadas:");
        for (String especieUnica : especiesUnicas) {
            System.out.println("- " + especieUnica);
        }
        System.out.println();

        // Mostrar la relación ID muestra → investigador
        System.out.println("🧑‍🔬 Relación ID muestra → investigador:");
        for (String idMuestra : muestraInvestigador.keySet()) {
            System.out.println("- " + idMuestra + " → " + muestraInvestigador.get(idMuestra));
        }
        System.out.println();

        // Búsqueda por ID de muestra
        String idBusqueda = "M-002";
        System.out.println("🔍 Búsqueda por ID de muestra: " + idBusqueda);
        if (muestraInvestigador.containsKey(idBusqueda)) {
            System.out.println("El investigador responsable es: " + muestraInvestigador.get(idBusqueda));
        } else {
            System.out.println("No se encontró el ID de muestra: " + idBusqueda);
        }
    }
}
