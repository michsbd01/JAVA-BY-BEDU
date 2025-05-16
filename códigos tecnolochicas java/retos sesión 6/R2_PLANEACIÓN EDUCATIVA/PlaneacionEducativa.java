import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

// Clase Tema con Comparable para orden natural (por título)
class Tema implements Comparable<Tema> {
    private String titulo;
    private int prioridad; // 1 = urgente, 2 = importante, 3 = opcional

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrioridad() {
        return prioridad;
    }

    // Orden natural: por título alfabético
    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo);
    }

    @Override
    public String toString() {
        return titulo + " (Prioridad: " + prioridad + ")";
    }
}

// Clase principal
public class PlaneacionEducativa {

    public static void main(String[] args) {

        // ✅ Lista concurrente de temas activos
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();
        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));
        temas.add(new Tema("Filosofía para jóvenes", 2));

        // 📚 Repositorio compartido de recursos
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medioambiente");
        recursos.put("Filosofía para jóvenes", "https://recursos.edu/filosofia");

        // 🔠 Mostrar orden natural (por título alfabético)
        System.out.println("📘 Temas ordenados por título:");
        Collections.sort(temas); // Usa Comparable
        for (Tema t : temas) {
            System.out.println("- " + t);
        }

        System.out.println();

        //  Ordenar por prioridad (1 → 3) usando Comparator
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        System.out.println(" Temas ordenados por prioridad:");
        for (Tema t : temas) {
            System.out.println("- " + t);
        }

        System.out.println();

        // 🌐 Mostrar recursos compartidos (ConcurrentHashMap)
        System.out.println(" Repositorio de recursos por tema:");
        for (String titulo : recursos.keySet()) {
            System.out.println("- " + titulo + " → " + recursos.get(titulo));
        }

        System.out.println();

        // 🔍 Búsqueda de recurso por tema
        String busqueda = "Matemáticas básicas";
        System.out.println(" Buscando recurso para: " + busqueda);
        if (recursos.containsKey(busqueda)) {
            System.out.println(" Recurso encontrado: " + recursos.get(busqueda));
        } else {
            System.out.println(" No se encontró recurso para el tema.");
        }
    }
}
