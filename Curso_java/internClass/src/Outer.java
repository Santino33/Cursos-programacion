public class Outer {
    public class Inner {

    }

}

    public static void main(String[] args) throws Exception {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
