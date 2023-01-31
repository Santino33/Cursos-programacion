package Vector;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {

      Vector<Integer> vector = new Vector();
      vector.add(1);
      vector.add(2);
      vector.add(3);
      vector.add(4);
      vector.add(5);

      vector.remove(1);
      vector.remove(2);

        System.out.println(vector);

      Vector<Integer> vector2 = new Vector();
      for (int i = 0; vector2.size()<1000 ;i++){
        vector2.add(i);
      }
      System.out.println("El tamaño del vector 2 es: "+vector2.size() + " Y tiene capacidad: "+vector2.capacity());
    }
    /*
    Si tuviesemos la capacidad por defecto (10) y le agregaramos 1000 elementos al vector, entonces no cabrian tantos elementos
    asi que automaticamente el vector se redimensiona a razon de el doble de su maximo de capacidad anterior
    En este caso la ultima vez que se sobrepaso su limite fue a la capacidad de 640 asi que se duplico quedando una nueva capacidad
    de 1280
     */


}