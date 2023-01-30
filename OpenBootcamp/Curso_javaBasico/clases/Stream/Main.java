package Stream;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){
        try{
            InputStream in = new FileInputStream("C:/Users/willi/Pictures/fichero.txt");
            byte []datos = in.readAllBytes();
            PrintStream out = new PrintStream("C:Users/willi/Programacion/OpenBootcamp/Curso_javaBasico/clases/errores/destino.txt");
            out.write(datos);
        }catch (Exception e){
            System.out.println("Excepcion: "+e.getMessage());
        }

    }
}
