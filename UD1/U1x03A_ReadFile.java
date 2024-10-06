package UD1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class U1x03A_ReadFile {

    static String FILE_PATH = "UD1/text.txt";

    public static void main(String[] args) {
        chooseReader();
    }

    // *********** ARCHIVOS BREVES +++++++++++++++++++
    private static void readTxtFL() {
        Path ruta = Paths.get(FILE_PATH);
        try {
            List<String> fs = Files.readAllLines(ruta);
            for (String f : fs) {
                System.out.println(f);  // Imprimir el contenido real
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    // ********** ARCHIVOS GRANDES ******************
    private static void bfReadTxtFL() {
        Path ruta = Paths.get(FILE_PATH);
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta.toFile()))) {
            String l;
            while ((l = reader.readLine()) != null) {
                System.out.println(l);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    // ********** ELEGIR EL MÉTODO DE LECTURA ******************
    private static void chooseReader() {
        Path rutaFichero = Paths.get(FILE_PATH);
        if (Files.exists(rutaFichero)) {
            try {
                long fileSize = Files.size(rutaFichero);
                if (fileSize < 10_000_000) { // MENOR A 10MB
                    readTxtFL();
                } else {
                    bfReadTxtFL(); // MAYOR A 10MB
                }
            } catch (IOException e) {
                System.out.println("Error al determinar el tamaño del fichero: " + e.getMessage());
            }
        } else {
            System.out.println("No se encuentra el fichero");
        }
    }
}
