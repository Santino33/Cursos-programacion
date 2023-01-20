public class Jugador extends Persona{
    private int Dorsal;
    private String Posicion;

    public Jugador(String nombre, String apellido, String edad, int dorsal, String posicion) {
        super(nombre, apellido, edad);
        Dorsal = dorsal;
        Posicion = posicion;
    }

    public int getDorsal() {
        return Dorsal;
    }

    public void setDorsal(int dorsal) {
        Dorsal = dorsal;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String posicion) {
        Posicion = posicion;
    }

    @Override
    public String toString(){
        return "\nRol: Jugador "+ "\nNombre: "+nombre+" "+Apellido+" edad: "+Edad+"\nDorsal: "+Dorsal+" posicion: "+Posicion;
    }
}
