package Stream;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        try {
            PrintStream ejemplo;
            InputStream in = new FileInputStream("/Users/willi/Pictures/ejemplo.txt");
            byte []datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream("destino.txt");
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Exepcion: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
