package excepcion;

import java.io.IOException;

public class Main {
    public static void main (String [] args){
        try {
            divideporcero(5, 0);
        }catch(ArithmeticException e){
            System.out.println("Esto no se puede hacer");
        } finally{
            System.out.println("Demo de codigo");
        }
    }

    public static void divideporcero (int a, int b) throws ArithmeticException{
        try{
            int resultado = a/b;
        }catch (ArithmeticException e){
            throw new ArithmeticException();
        }

    }
}
