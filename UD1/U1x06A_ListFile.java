package UD1;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class U1x06A_ListFile {

    private static void listFiles(){
        Path ruta = Paths.get("UD1");

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(ruta)){
            if(Files.exists(ruta)){
                for (Path fichero : stream) {
                    // Procesar cada fichero del directorio
                    System.out.println("Nombre: "+fichero.getFileName());

                    // Obtener los atributos básicos del fichero
                    BasicFileAttributes atributs = Files.readAttributes(fichero, BasicFileAttributes.class);
                    System.out.println("Tamaño: " + atributs.size() + " bytes");
                    System.out.println("Ultima modificación: " + atributs.lastModifiedTime());
                }

            }else {
                System.out.println("No se encuentra la ruta especificada");
            }
        }catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public static void main(String[] args) {
        listFiles();
    }

}
