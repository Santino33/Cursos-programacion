public class Doctor extends Persona{
    private String titulo;
    private int añosExp;

    public Doctor(String nombre, String apellido, String edad, String titulo, int añosExp) {
        super(nombre, apellido, edad);
        this.titulo = titulo;
        this.añosExp = añosExp;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñosExp() {
        return añosExp;
    }

    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }

    @Override
    public String toString(){
    return "\nRol: Doctor "+ "\nNombre: "+nombre+Apellido+"\nTitulo: "+titulo+" experiencia: "+añosExp;
    }
}
