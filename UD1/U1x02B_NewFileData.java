package UD1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class U1x02B_NewFileData {

    static String FILE_PATH = "./UD1/text.txt";
    static String DATA = "texto de prueba de inserción de datos C:\\Users\\ima7m\\.jdks\\corretto-17.0.12\\bin\\java.exe \"-javaagent:C:\\Program Files\\JetBrains\\IntelliJ IDEA 2024.2.3\\lib\\idea_rt.jar=64178:C:\\Program Files\\JetBrains\\IntelliJ IDEA 2024.2.3\\bin\" -Dfile.encoding=UTF-8 -classpath C:\\Users\\ima7m\\IdeaProjects\\DAMD\\ADAT\\out\\production\\ADAT UD1.U1x03A_ReadFile\n" +
            "No se encuentra el fichero C:\\Users\\ima7m\\.jdks\\corretto-17.0.12\\bin\\java.exe \"-javaagent:C:\\Program Files\\JetBrains\\IntelliJ IDEA 2024.2.3\\lib\\idea_rt.jar=64178:C:\\Program Files\\JetBrains\\IntelliJ IDEA 2024.2.3\\bin\" -Dfile.encoding=UTF-8 -classpath C:\\Users\\ima7m\\IdeaProjects\\DAMD\\ADAT\\out\\production\\ADAT UD1.U1x03A_ReadFile\n" +
            "No se encuentra el fichero\n C:\\Users\\ima7m\\.jdks\\corretto-17.0.12\\bin\\java.exe \"-javaagent:C:\\Program Files\\JetBrains\\IntelliJ IDEA 2024.2.3\\lib\\idea_rt.jar=64178:C:\\Program Files\\JetBrains\\IntelliJ IDEA 2024.2.3\\bin\" -Dfile.encoding=UTF-8 -classpath C:\\Users\\ima7m\\IdeaProjects\\DAMD\\ADAT\\out\\production\\ADAT UD1.U1x03A_ReadFile\n" +
            "No se encuentra el fichero\n";

    private static void newFileData (){
        Path newFile = Paths.get(FILE_PATH);

        try {
            if (Files.exists(newFile)){
                System.out.println("El archivo " +newFile+ " ya existe");
            }else{
                Files.write(newFile, DATA.getBytes());
                System.out.println("Archivo " + newFile + " creado con exito!");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        newFileData();
    }

}
