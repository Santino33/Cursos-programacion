import Model.Doctor;
import Model.Patient;

import java.util.Date;

public class Main{
    public static void main(String [] args){
        Doctor myDoctor = new Doctor ("Fernando Gomez", "fer@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);
        /*
        for (Model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointment()){
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        Patient patient2 = new Patient("Anahi", "anahi@mail.com");

        System.out.println(patient);

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());

    }
}