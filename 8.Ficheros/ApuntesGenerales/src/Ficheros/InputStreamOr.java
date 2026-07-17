package Ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.InputStream;

public class InputStreamOr {

    public static void main(String[] args) {
        Path fich = Paths.get("origen.dat");

        // Tus comprobaciones de seguridad de siempre
        if (!Files.exists(fich) || Files.isDirectory(fich)) {
            System.out.println("No se puede leer el archivo.");
            return;
        }

        InputStream leer = null;
        try {
            // Se abre el grifo directo al archivo
            leer = Files.newInputStream(fich);
            
            int byt;
            long totalBytes = 0;

            // Bucle directo: Lee un byte del disco y comprueba si llegó al final (-1)
            while ((byt = leer.read()) != -1) {
                // Aquí dentro la variable 'byt' tiene el número binario (0 a 255)
                totalBytes++; 
            }

            System.out.println("Fichero leído. Total bytes: " + totalBytes);

        } catch (IOException e) {
            System.out.println("Error de entrada/salida: " + e.getMessage());
        } finally {
            // El cierre obligatorio en el finally
            if (leer != null) {
                try {
                    leer.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }
}