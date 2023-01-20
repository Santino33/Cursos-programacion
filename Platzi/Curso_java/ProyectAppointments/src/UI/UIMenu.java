package UI;
import Model.Doctor;
import Model.Patient;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final String[] MONTHS =
            {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
               "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
            };
    public static Doctor doctorLogged;
    public static Patient patientLoged;

    public static void showMenu() throws ParseException {
        System.out.println("Welcome to my Appointments");
        System.out.println("Seleccione la opcion deseada");

        int response = 0;
        do{
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");
            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();

            switch(response){
                case 1:
                    System.out.println("Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank for your visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    static void showPatientMenu() throws ParseException {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i +". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

    private static void authUser (int userType) throws ParseException {
        //UserType = 1 Doctor
        //UserType = 2 Patient

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Fernando Florez", "alejo@gmail.com"));
        doctors.add(new Doctor("Victor Nuñez", "vic@gmail.com"));
        doctors.add(new Doctor("Karen Sosa", "karen@gmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Roberto Rodriguez", "rodri@gmail.com"));
        patients.add(new Patient("Charles Leclerc", "lec16@gmail.com"));
        patients.add(new Patient("Zharick Hernandez", "zhary@gmail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: a@a.com");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1){
                for (Doctor d: doctors){
                    if(d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener datos del usuario logeado
                        doctorLogged = d;
                        UIDoctorMenu.showDoctorMenu();
                        //showDoctorMenu
                    }
                }
            }
            if (userType == 2){
                for(Patient p: patients){
                    if(p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLoged = p;
                    }
                }
            }
        }while (!emailCorrect);
    }
}
