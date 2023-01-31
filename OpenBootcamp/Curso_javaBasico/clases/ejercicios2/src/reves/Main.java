package reves;

public class Main {
    public static void main(String[] args) {
        String texto = "Hola mundo";

        System.out.println(reverse(texto));
    }
    public static String reverse(String texto) {

        char[] charArray = texto.toCharArray();
        String reverso = "";
        for (int i = charArray.length -1; i >= 0; i--) {
            reverso += charArray[i];
        }
        return reverso;

    }
}