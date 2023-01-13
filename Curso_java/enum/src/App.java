public class App {

    enum Transport {
        PLANE(900), TRAIN(120), AUTOMOBILE(60);

        int speed;

        Transport(int s) {
            speed = s;
        }
    }

    enum Days {
        MONDAY, THURDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) throws Exception {

        Days d = Days.THURSDAY;

        System.out.println(Transport.AUTOMOBILE.speed);
        System.out.println(Days.FRIDAY);
        System.out.println(d.ordinal());
        int dot = d.ordinal();

        if (dot > 4) {
            System.out.println("Weekend, great");
        }
        if (dot <= 4) {
            System.out.println("Midweek");
        }
    }
}
