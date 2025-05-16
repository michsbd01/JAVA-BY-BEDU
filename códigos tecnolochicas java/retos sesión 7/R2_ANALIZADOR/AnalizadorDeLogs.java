import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        String rutaLog = "errores.log";
        int totalLineas = 0;
        int totalErrores = 0;
        int totalWarnings = 0;

        // 📖 Lectura segura con try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader(rutaLog))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                totalLineas++;

                if (linea.contains("ERROR")) {
                    totalErrores++;
                }

                if (linea.contains("WARNING")) {
                    totalWarnings++;
                }
            }

            // 🧾 Mostrar resumen del análisis
            System.out.println("✅ Análisis de Log Finalizado");
            System.out.println("🔢 Total de líneas leídas: " + totalLineas);
            System.out.println("❌ Cantidad de errores: " + totalErrores);
            System.out.println("⚠️ Cantidad de advertencias: " + totalWarnings);

            int totalProblemas = totalErrores + totalWarnings;
            double porcentaje = (totalLineas == 0) ? 0 : (100.0 * totalProblemas / totalLineas);

            System.out.printf("📊 Porcentaje de líneas con errores/advertencias: %.2f%%\n", porcentaje);

        } catch (IOException e) {
            System.err.println("❌ Ocurrió un error al leer el archivo: " + e.getMessage());

            // 📂 Registrar error en archivo de fallos
            try (PrintWriter pw = new PrintWriter(new FileWriter("registro_fallos.txt", true))) {
                pw.println("Fallo al analizar errores.log → " + e.getMessage());
            } catch (IOException ex) {
                System.err.println("⚠️ No se pudo registrar el fallo: " + ex.getMessage());
            }
        }
    }
}
