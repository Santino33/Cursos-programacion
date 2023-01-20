package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {


    private String speciality;


    public Doctor(String name, String email){
        super(name, email);
    }



    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    //Creo una coleccion que sea un array para guardar alli las citas disponibles
    ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
    public void addAvailableAppointment(String date, String time) throws ParseException {
        availableAppointment.add(new Doctor.AvailableAppointment(date, time));
    }
    //Devuelve el array que contiene las citas
    public ArrayList<AvailableAppointment> getAvailableAppointment(){
        return availableAppointment;
    }

    @Override
    public String toString(){
        return super.toString()+"\nSpeciality: "+speciality+"\nAvailable: "+availableAppointment.toString();
    }
    @Override
    public void showDataUser(){
        System.out.println("Hospital: San rafael");
        System.out.println("Departamento: Ortopedia");
    }

    public static class AvailableAppointment {
        private int id;
        private Date date;

        public String getTime() {
            return time;
        }

        public Date getDate() {
            return date;
        }

        public String getDate (String DATE){
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setTime(String time) {
            this.time = time;
        }

        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");

        public AvailableAppointment(String date, String time) throws ParseException {
            this.date = format.parse(date);
            this.time = time;
        }
            @Override
            public String toString() {
                return "Available Appointments \nDate: " +date+ "\nTime: " + time;
            }

    }
}
