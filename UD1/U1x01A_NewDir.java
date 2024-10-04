package UD1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class U1x01A_NewDir {


    private static void createNewDir (String dirPath){


        Path path = Paths.get(dirPath);
        try {
            if(Files.notExists(path)){
                Files.createDirectory(path);
                System.out.println("Directorio creado correctamente");
            }else{
                System.out.println("No se pudo Completar! El directorio "+path+" ya existe");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) {

        createNewDir("UD1/Components");
    }
}

