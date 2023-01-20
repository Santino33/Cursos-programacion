public class Casting {
    public static void main(String[] args){
        //En un año ubicamos 30 perros
        //¿Cuantos perros fueron al mes?

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //ESTIMACION
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //EXATITUD
        int a = 30;
        int b = 12;

        System.out.println((double)a/b);

        double c = (double)a/b;
        System.out.println(c);

        char n = '1';
        int nI = n;

        System.out.println(nI);

        short nS = (short) n;
        System.out.println(nS);
    }
}
