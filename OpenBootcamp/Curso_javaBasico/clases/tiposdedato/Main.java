package tiposdedato;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //VECTORES
        /*
        Aumenta su capacidad:

       CapacidadVector = CapacidadVector * 2
       Dobla su capacidad actual
         */
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println("Capacidad: " + vector.capacity() + " Tamaño: " + vector.size());
        vector.trimToSize();
        System.out.println("Capacidad: " + vector.capacity() + " Tamaño: " + vector.size());

        //ARRAYLIST
        /*
        Aumenta su capacidad:

       CapacidadArrayList = CapacidadArraylist + (CapacidadArraylist * 0.5)
       Aumenta su capacidad actual en un 50%
         */
        ArrayList<String> lista = new ArrayList<>();
        lista.add("elemento a");
        lista.add("elemento b");
        lista.add("elemento c");

        //Convertir un arraylist en un array
        String array[] = new String[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }

        for (String elemento : array) {
            System.out.println("Elemento es: " + elemento);
        }

        //LINKEDLIST
        //Es mas rapida a la hora de modificar datos que el arraylist
        LinkedList<String> listaEnlazada = new LinkedList<String>();

        //BIGDECIMAL
        //Util para trabajar con datos financieros por su alta presicion

        BigDecimal valorA = new BigDecimal(0.1f);
        BigDecimal valorB = new BigDecimal(4f);

        //Suma el BigDecimal "valorB" a "valorA"
        BigDecimal resultado = valorA.add(valorB);

        //imprime la suma
        System.out.println(resultado.toString());

        //MAPAS
         HashMap<String, Integer> mapa = new HashMap<>();
         mapa.put("Clave 1", 10);
        mapa.put("Clave 2", 20);
        mapa.put("Clave 3", 30);

        System.out.println(mapa);

        System.out.println(mapa.get("Clave 1"));
        //Reemplaza algun valor
        mapa.replace("Clave 3", 90);
        //Eliminar algun valor
        mapa.remove("Clave 2");
        System.out.println(mapa);

        for (Map.Entry elemento : mapa.entrySet()){
            System.out.println("Elemento clave es: "+ elemento.getKey());
            System.out.println("Elemento valor es: "+elemento.getValue());
        }

    }
}
