package UD1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class U1x05A_UpdateFile {
    static String FILE_PATH = "UD1/text.txt";
    static String NEW_DATA = "\nFichero ACTUALIZADO";

    private static void updateFile(){
        Path ruta = Paths.get(FILE_PATH);
        try {
            if (Files.exists(ruta)){
                Files.write(ruta,NEW_DATA.getBytes(), StandardOpenOption.APPEND);
                System.out.println("Fichero de texto actualizado correctamente.");
            }else{
                System.out.println("El fichero "+ruta+" no se encuentra");
            }

        } catch (IOException e) {
            System.out.println("Error al actualizar el fichero: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        updateFile();
    }
}
