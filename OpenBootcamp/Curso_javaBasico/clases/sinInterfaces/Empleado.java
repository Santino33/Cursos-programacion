package sinInterfaces;


public class Empleado {

    String nombre;
    int edad;
    double salario;
    boolean alta;

    public Empleado(String nombre, int edad, double salario, boolean alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.alta = alta;
    }

    public Empleado() {
    }
}
