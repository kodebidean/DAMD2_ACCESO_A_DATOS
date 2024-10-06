package UD1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class U1x04A_DeleteFile {

    static String ruta = "UD1/text.txt";

    private static void deleteFile (){
        Path delRuta = Paths.get(ruta);
        try {
            if(Files.exists(delRuta)){
                Files.delete(delRuta);
                System.out.println("Archivo eliminado con exito!");
            }else{
                System.out.println("El archivo "+delRuta+" no se encuentra!");
            }
        } catch (IOException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        deleteFile();
    }
}
