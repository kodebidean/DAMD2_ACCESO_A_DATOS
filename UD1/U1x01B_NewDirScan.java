package UD1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class U1x01B_NewDirScan {
    private static void createNewDir(String dirPath) {
        Path path = Paths.get(dirPath);

        try {
            if (!Files.exists(path)) {
                Files.createDirectory(path);
                System.out.println("Directorio creado correctamente");
            } else {
                System.out.println("No se pudo Completar! El directorio " + path + " ya existe");
            }
        } catch (IOException e) {
            System.out.println("Error al intentar crear el directorio: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar la ruta del nuevo directorio
        System.out.print("Por favor, ingrese la ruta del directorio que desea crear: ");
        String dirPath = scanner.nextLine();

        // Llamar al método para crear el directorio con la ruta ingresada por el usuario
        createNewDir(dirPath);

        // Cerrar el Scanner para liberar recursos
        scanner.close();
    }

}
