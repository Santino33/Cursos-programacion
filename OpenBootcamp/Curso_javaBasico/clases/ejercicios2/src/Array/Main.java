package Array;

public class Main {
    public static void main(String[] args) {
        array1();
        array2();
    }

    public static void array1(){
        String[] cadenas = new String[]{"Perro", "gato", "loro", "cocodrilo"};
        for (String e : cadenas){
            System.out.println(e);
        }
    }
    public static void array2(){
        int[] x = new int[]{0,0,0,0,0};
        int[] y = new int[]{0,0,0,0,0};

        System.out.print("  1");
        System.out.print("2");
        System.out.print("3");
        System.out.print("4");
        System.out.println("5");
        for (int i=0; x.length-1 > i; i++){
            System.out.print(i+1);
            System.out.print(" ");
            System.out.print(x[i]);
            for (int j=0; y.length-1 > j; j++){
                System.out.print(y[j]);
            }
            System.out.println("");
        }
    }
}