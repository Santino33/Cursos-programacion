package errores;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main (String[]args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 2 numeros");
        int numeroA = scanner.nextInt();
        int numeroB = scanner.nextInt();

        try{
            int resultado = numeroA/numeroB;
            System.out.println("el resultado es: "+resultado);
        }catch (ArithmeticException e){
            System.out.println("BooM, excepecion es: "+ e.getClass());
        }
        catch (Exception e){
            System.out.println("Esta es una excepcion que no es aritmetica");
        }
        //El finally sirve para resetear variables, aunque algunos lo consideran mala practica
        finally{
            System.out.println("finally");
        }


        try {
            divide(4,0);
        }catch(Exception e) {
            System.out.println("AAA");

        }




    }
    public static void divide(int A, int B) throws ArithmeticException, IOException{

        try{
            int res = A/B;
            System.out.println("La division es: "+res);
        } catch (ArithmeticException e){
            System.out.println("Esto esta mal");
            throw new IOException();
        }

    }
}
