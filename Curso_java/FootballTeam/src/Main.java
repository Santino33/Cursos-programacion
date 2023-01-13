import java.util.ArrayList;

public class Main {
    static ArrayList<Persona> persona = new ArrayList<Persona>();
    public static void main(String[] args) {
        Persona tecnico = new Entrenador("Zinedine", "Zidane" ,"43", "4-3-3");
        persona.add(tecnico);
        Persona medico = new Doctor("Alberto", "Campos", "50", "Fisioterapeuta", 12);
        persona.add(medico);
        Persona jugador1 = new Jugador("Cristiano", "Ronaldo", "38", 7, "Del");
        persona.add(jugador1);
        Persona jugador2 = new Jugador("Lucas", "Paqueta", "26", 14, "Med");
        persona.add(jugador2);
        Persona jugador3 = new Jugador("Manuel", "Neuer", "37", 1, "Po");
        persona.add(jugador3);
        Persona jugador4 = new Jugador("Enzo", "Fernandez", "22", 18, "Med");
        persona.add(jugador4);
        Persona jugador5 = new Jugador("Presnel", "Kimpembe", "29", 5, "Def");
        persona.add(jugador5);

        mostrarEqipo();
    }

    public void generarMenu(){


    }
    public static void mostrarEqipo(){
        for (Persona equipo: persona){
            System.out.println(equipo.toString());
        }
    }
}