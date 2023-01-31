package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
    }

    public static void ejercicio1 (){
        ArrayList<String> names = new ArrayList();
        LinkedList<String> newNames = new LinkedList();
        names.add("Juan");
        names.add("Santiago");
        names.add("Freddy");
        names.add("Julian");

        newNames.addAll(names);
        System.out.println(newNames);
        newNames.forEach(System.out::println);
    }

    public static void ejercicio2 (){

        ArrayList<Integer> miArray = new ArrayList();
        for (int i = 0; i<10; i++){
            miArray.add(i);
            miArray.ensureCapacity(15);

        }
        ArrayList<Integer> elementosEliminar = new ArrayList();

        for (int i = 0; miArray.size()-1>=i; i++){
            if ((miArray.get(i) % 1)==0) {
                elementosEliminar.ensureCapacity(20);
                    elementosEliminar.add(i);
                    System.out.println("a");
              }

        }
        for(int elemento : elementosEliminar) {
            System.out.println("oo");
            miArray.remove(elemento);
            System.out.println(miArray);
        }

        System.out.println("dd");
    }
}