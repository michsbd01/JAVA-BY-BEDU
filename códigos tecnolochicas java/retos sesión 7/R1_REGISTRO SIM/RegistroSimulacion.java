import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {

    public static void main(String[] args) {
        // 📁 Definir la ruta de la carpeta y archivo
        Path carpetaConfig = Paths.get("config");
        Path archivoParametros = carpetaConfig.resolve("parametros.txt");

        // 🧪 Parámetros de entrada para la simulación
        String contenido = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

        try {
            // 🛠️ Crear carpeta si no existe
            if (!Files.exists(carpetaConfig)) {
                Files.createDirectory(carpetaConfig);
                System.out.println("✅ Carpeta 'config/' creada.");
            }

            // 📝 Escribir contenido en el archivo
            Files.write(archivoParametros, contenido.getBytes());
            System.out.println("✅ Archivo 'parametros.txt' creado y configurado.");

            // 🔍 Verificar si el archivo existe
            if (Files.exists(archivoParametros)) {
                System.out.println("📂 El archivo fue encontrado correctamente.");

                // 📖 Leer y mostrar el contenido del archivo
                String datosLeidos = Files.readString(archivoParametros);
                System.out.println("\n📋 Contenido del archivo de configuración:");
                System.out.println(datosLeidos);
            } else {
                System.out.println("❌ El archivo no fue encontrado.");
            }

        } catch (IOException e) {
            System.err.println("⚠️ Error al gestionar el archivo: " + e.getMessage());
        }
    }
}
