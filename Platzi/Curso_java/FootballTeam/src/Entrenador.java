public class Entrenador extends Persona{
    public String strategy;

    public Entrenador(String nombre, String apellido, String edad, String strategy) {
        super(nombre, apellido, edad);
        this.strategy = strategy;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    @Override
    public String toString(){
    return "Rol: entrenador"+"\nNombre: "+nombre+" "+Apellido + "\nEstrategia: "+strategy;
    }
}
