package UI;

import java.text.ParseException;
import java.util.Map;
import java.util.Scanner;

public class UIPatientMenu {
    public static void showPatientMenu() throws ParseException {
        int response = 0;
        System.out.println("Welcome patient "+UIMenu.patientLoged);
        System.out.println("¿What service do you want?");
        System.out.println("1. Book an appointment");
        System.out.println("2. My appointments");
        System.out.println("0. Logout");
        Scanner sc = new Scanner(System.in);
        response = Integer.valueOf(sc.nextLine());

        switch (response){
            case 1:
                break;
            case 2:
                break;
            case 0: UIMenu.showMenu();
                break;
        }

    }

    private static void showBookAppointmentmenu(){
        int response = 0;
        do {
            System.out.println("::Book an appointment");
            System.out.println("::Select a date: ");

            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for(int i = 0; i<UIDoctorMenu.doctorsAvailableAppointment.size(); j++){
                ArrayList<Doctor.AvailableAppointments> availableAppointments
                = UIDoctorMenu.doctorsAvailableAppointment.get(i).getAvailableAppointment();

            Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

            for (int j = 0; j < availableAppointments.size();j++){
                k++;
                System.out.println(k + ". "+availableAppointments.get(j));
            }
            }

        }while(response != 0);
    }
}
