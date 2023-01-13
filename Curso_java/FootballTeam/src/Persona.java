public class Persona {
    public String nombre;
    public String Apellido;
    public String Edad;


    public Persona(String nombre, String apellido, String edad) {
        this.nombre = nombre;
        Apellido = apellido;
        Edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }


}
