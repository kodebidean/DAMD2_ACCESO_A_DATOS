package UD1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class U1x02A_NewFile {

    private static void createFile (){
        Path filePath = Paths.get("UD1/text.txt");
        try {
            if (Files.notExists(filePath)) {
                Files.createFile(filePath);
                System.out.println("Archivo creado con exito!");
            }else{
                System.out.println("El archivo "+filePath+" ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        createFile();
    }

}
