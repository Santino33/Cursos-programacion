import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

    llenarPoligono();
    }

    public static void llenarPoligono(){
        int opcion = 0;
        String j;
        boolean c = true;

        while (c){

            System.out.println("Inserte el poligono que desea");
            System.out.println("1. Rectangulo");
            System.out.println("2. Triangulo");
            opcion = entrada.nextInt();

            while (opcion < 1 || opcion > 2){
                llenarPoligono();
            }
            switch (opcion){
                case 1: llenarRectangulo();

                    break;
                case 2: llenarTriangulo();

                    break;
            }
            System.out.println("¿Desea agregar otro poligono? s/n");
            j = entrada.next();
            if(Objects.equals(j, "S") || Objects.equals(j, "s")){
                c = true;
            }
            if(Objects.equals(j, "N") || Objects.equals(j, "n")){
                c = false;
            }

        }
        System.out.println("");
        mostrarResultados();


    }

    public static void llenarTriangulo(){
        double lado1, lado2, lado3;
        System.out.println("Digite el lado 1: ");
        lado1 = entrada.nextDouble();
        System.out.println("Digite el lado 2: ");
        lado2 = entrada.nextDouble();
        System.out.println("Digite el lado 3: ");
        lado3 = entrada.nextDouble();

        Poligono triangulo1 = new Triangulo(lado1, lado2, lado3);
        poligono.add(triangulo1);
    }

    public static void llenarRectangulo(){
        double lado1, lado2;
        System.out.println("Digite el lado 1: ");
        lado1 = entrada.nextDouble();
        System.out.println("Digite el lado 2: ");
        lado2 = entrada.nextDouble();

        Poligono rectangulo1 = new Rectangulo(lado1, lado2);
        poligono.add(rectangulo1);

    }
    public static void mostrarResultados(){
        for (Poligono poli: poligono){
            System.out.println(poli.toString());
        }
    }
}