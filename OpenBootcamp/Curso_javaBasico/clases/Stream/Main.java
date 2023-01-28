package Stream;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){


        try {

            boolean ok = false;
            do{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Mete 2 numeros: ");
                scanner.reset();
                try{
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    ok = true;
                }catch(InputMismatchException e){
                    System.out.println("Numeros invalidos");
                }
            }while (!ok);
            InputStream fichero = new FileInputStream("C:/Users/willi/Pictures/fichero.txt");


            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);
            try{
                int dato = ficheroBuffer.read();
                while (dato != -1){
                    System.out.println((char) dato);
                    dato = ficheroBuffer.read();
                }
            }catch(IOException e){
                System.out.println("No puedo leer el fichero "+e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("El programa da error: "+e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
