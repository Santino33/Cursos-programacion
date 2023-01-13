package Model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {


    private String speciality;


    public Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del doctor asiganado es: " + name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    //Creo una coleccion que sea un array para guardar alli las citas disponibles
    ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointment.add(new AvailableAppointment(date, time));
    }
    //Devuelve el array que contiene las citas
    public ArrayList<AvailableAppointment> getAvailableAppointment(){
        return availableAppointment;
    }

    @Override
    public String toString(){
        return super.toString()+"\nSpeciality: "+speciality+"\nAvailable: "+availableAppointment.toString();
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

        public void setDate(Date date) {
            this.date = date;
        }

        public void setTime(String time) {
            this.time = time;
        }

        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }
            @Override
            public String toString() {
                return "Available Appointments \nDate: " +date+ "\nTime: " + time;
            }

    }
}
