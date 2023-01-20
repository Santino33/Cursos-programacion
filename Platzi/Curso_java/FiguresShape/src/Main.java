import java.util.Scanner;

public class Main {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Programa para hallar areas y perimetros, digite acontinuacion de que forma quiere hallar sus datos");
        execute();

    }

    public static void execute(){

        boolean i = true;
        while (i == true){

            System.out.println("1. Circulo, 2. Rectangulo");
            String k;
            int j = entrada.nextInt();
            while (j<1 || j>2){
                execute();
            }
            if (j == 1){
                int radius;
                System.out.println("Inserte el radio del circulo");
                radius = entrada.nextInt();
                Circle c1 = new Circle(radius);
                System.out.println(c1.getArea());
                c1.toString();
            }
            if (j == 2){
                int side1;
                System.out.println("Inserte el lado 1 del rectangulo");
                side1 = entrada.nextInt();
                System.out.println("Inserte el lado 2 del rectangulo");
                int side2;
                side2 = entrada.nextInt();
                Rectangle rect1 = new Rectangle(side1, side2);
                rect1.toString();
            }

            System.out.println("¿Desea introducir otra figura? s/n");
            k = entrada.next();
            if (k == "N"||k == "n"){
                i = false;
            }
        }

    }

}