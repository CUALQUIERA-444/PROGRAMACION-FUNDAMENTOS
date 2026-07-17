package Ficheros;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OutputPutStream {

    public static void main(String[] args) {
        Path fich = Paths.get("destino.dat");

        OutputStream escribir = null;
        try {
            // Abre el grifo de escritura directa (crea el archivo si no existe)
            escribir = Files.newOutputStream(fich);

            // Escribimos bytes sueltos directamente (números)
            escribir.write(65); // Guarda un byte con valor 65 ('A' en ASCII)
            escribir.write(66); // Guarda un byte con valor 66 ('B' en ASCII)
            escribir.write(67); // Guarda un byte con valor 67 ('C' en ASCII)

            // NO hace falta .flush() porque no hay buffer. Va directo al disco.
            System.out.println("Bytes escritos correctamente en el disco.");

        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        } finally {
            // El cierre sigue siendo obligatorio para liberar el archivo en Linux
            if (escribir != null) {
                try {
                    escribir.close();
                } catch (IOException e) {
                    System.out.println("Error al cerrar");
                }
            }
        }
    }
}
