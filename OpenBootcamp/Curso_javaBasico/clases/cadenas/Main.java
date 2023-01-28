package cadenas;

public class Main {
    public static void main(String[] args) {
        String mensaje = "Este es MI MENSAJE";

        for (int j=0; j<mensaje.length(); j++){
            System.out.println(mensaje.charAt(j));
        }

        for (int i = mensaje.length()-1; i >= 0 ; i--){
            System.out.println(mensaje.charAt(i));

        }





    }
}
