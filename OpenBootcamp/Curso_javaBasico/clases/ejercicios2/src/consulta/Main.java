package consulta;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main (String []args){
        procedimiento();

    }

    public static void procedimiento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este es un programa para consultar su saldo y agregar nuevos usuarios");
        System.out.println(" 1. Consultar saldo\n 2. Agregar nuevo usuario\n 3. Consultar usuarios \n 4. Salir" );
        int seleccion = scanner.nextInt();
        switch (seleccion){
            case 1: 
                break;
            case 2: agregarUsuario();
                break;
            case 3: consultarUsuario();
                break;
            case 4:
                break;
        }
    }


    public static void llenarBase (){
        try {
            PrintStream basededatos = new PrintStream("basededatos");
            HashMap<String, Integer> datos = new HashMap<>();
            datos.put("Antonio", 50000);
            datos.put("Maria", 3500);
            datos.put("Santiago", 15000);
            datos.put("Paola", 23000);
            datos.put("David", 5000);

            FileOutputStream fos = new FileOutputStream("C:/Users/willi/Programacion/OpenBootcamp/Curso_javaBasico/clases/ejercicios2/src/consulta/basededatos.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(datos);

            /*FileReader fr = new FileReader("C:/Users/willi/Programacion/OpenBootcamp/Curso_javaBasico/clases/ejercicios2/src/consulta/basededatos.txt");
            BufferedReader br = new BufferedReader(fr);
            String lectura;
            while((lectura = br.readLine()) !=null){
                System.out.println(lectura);
            }

             */
        }catch (IOException e){
            System.out.println("Archivo no encontrado" + e.getMessage());
        }
    }

    public static void agregarUsuario(){
        try {
            boolean salida = false;
            Scanner scanner = new Scanner(System.in);
            String nombre;
            int valor;
            char respuesta;
            do {
                recuperarBase();
                System.out.println("¿Desea agregar otro usuario?\n Escriba S/N");
                respuesta = scanner.next().charAt(0);
                switch (respuesta){
                    case 'S': salida = false;
                        break;
                    case 's': salida = false;
                        break;
                    case 'N': salida = true;
                        break;
                    case 'n': salida = true;
                        break;
                }

            }while(salida == false);

        } catch(Exception e){
            System.out.println("Otra excepcion "+ e.getMessage());
        }


    }

    public static void recuperarBase(){
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int valor;
        char respuesta;

        System.out.println("Escriba el nombre del nuevo usuario");
        nombre = scanner.next();
        System.out.println("Escriba el valor del nuevo usuario "+nombre);
        valor = scanner.nextInt();
        try {
            FileInputStream in = new FileInputStream("C:/Users/willi/Programacion/OpenBootcamp/Curso_javaBasico/clases/ejercicios2/src/consulta/basededatos.txt");
            ObjectInputStream ois = new ObjectInputStream(in);
            HashMap baserecuperada = (HashMap) ois.readObject();
            baserecuperada.put(nombre, valor);
            System.out.println("Esta es la nueva base de datos");
            System.out.println(baserecuperada);

        }catch (Exception e){
            System.out.println("Excepcion generada "+e.getMessage());
        }
    }
     public static void consultarUsuario(){

     }

     public static HashMap getBase(){

         return null;
     }
}
