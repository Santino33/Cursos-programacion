package printsprint;

import java.io.*;

public class Main {
    public static void main (String []args) {
        InputStream salida = null;
        PrintStream llegada = null;
        try {
            llegada = new PrintStream("llegada.txt");
            salida = new FileInputStream("C:/Users/willi/Programacion/OpenBootcamp/Curso_javaBasico/clases/Salida.txt");

        } catch (IOException e) {
            System.out.println("Archivo no encontrado");
        }
        copiaFichero(llegada, salida);

    }

    public static void copiaFichero(PrintStream llegada, InputStream salida) {
        try {
            byte[] datos = salida.readAllBytes();
            llegada.write(datos);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
