import java.lang.*;
import java.io.*;

public class MainApp {

    public static void main(String[] args) {

        if (args.length == 0){
            System.out.println("Falta el nobre del archivo");
            System.exit(1);
        }

        FileReader fileReader = null;

        String filename = args[0];
        try {
             fileReader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String  textline = null;
        int contador = 0;

        while (true){
            try{
                if ((textline = bufferedReader.readLine()) == null) break;
            } catch (IOException e){
                System.out.println("Error al leer el archivo de entrada");
                System.exit(1);
            }
            contador++;
        }

        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("El archivo " + filename + " tiene " + contador + " lineas");
    }
}
