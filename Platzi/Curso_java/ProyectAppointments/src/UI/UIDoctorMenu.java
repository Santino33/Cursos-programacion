package UI;

import Model.Doctor;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailableAppointment = new ArrayList<>();

    public static void showDoctorMenu() throws ParseException {
        int response = 0;

        do{
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome "+ UIMenu.doctorLogged.getName());
            System.out.println("1. Add Available Appointment");
            System.out.println("2. My schedule appointements");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    showAddAvailaleAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
            }

        }while (response != 0 );
    }

    private static void showAddAvailaleAppointmentsMenu() throws ParseException {
        int response = 0;
        do{
            System.out.println("::Add Available Appointments");
            System.out.println(":: Select a Month");

            for (int i = 0; i<3; i++){
                int j= i + 1;
                System.out.println(j + ". "+UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response <4){
                //1,2,3
                int monthSelected = response;
                System.out.println(monthSelected + " . "+ UIMenu.MONTHS[monthSelected-1]);
                System.out.println("Insert the date available: [dd/mm/yyyy]");
                String date = sc.nextLine();

                System.out.println("Your date is: "+date+"\n1. Correct \n2. Change Date");
                int responseDate = Integer.valueOf(sc.nextLine());
                if(responseDate == 2)continue;

                int responseTime = 0;
                String time = "";
                do{
                    System.out.println("Insert the time Available for date: "+date+" [16:00]");
                    time = sc.nextLine();
                    System.out.println("Are you secure this is your time: "+time);
                    System.out.println("1. Correct, 2. No, i want to change it");
                    responseTime = sc.nextInt();

                }while(responseTime == 2);
                UIMenu.doctorLogged.addAvailableAppointment(date, time);
                checkDoctorAvailableAppointment( UIMenu.doctorLogged);

            }else if(response == 0){
                showDoctorMenu();
            }

        }while ( response != 0);
    }
    private static void checkDoctorAvailableAppointment (Doctor doctor){
        if(doctor.getAvailableAppointment().size() > 0 && !doctorsAvailableAppointment.contains(doctor)){
            doctorsAvailableAppointment.add(doctor);
        }
    }
}
