package View;

import java.io.InputStream;
import java.util.Scanner;

public class vista {
    private Scanner entrada;

    public vista() {
        entrada = new Scanner(System.in);
    }

    public int readInt(String message) {
        System.out.println((message));
        int number = entrada.nextInt();
        return number;
    }

    public String readString(String message) {
        System.out.println((message));
        String text = entrada.nextLine();
        return text;
    }

    public double readDouble(String message) {
        System.out.println(message);
        double number = entrada.nextDouble();
        return number;
    }

}
