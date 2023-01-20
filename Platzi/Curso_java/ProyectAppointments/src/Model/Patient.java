package Model;

public class Patient extends User {
    private String birthday;
    private double weight;
    private double blood;
    private String phoneNumber;

    public Patient(String name, String email) {
        super(name, email);
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBlood() {
        return this.blood;
    }

    public void setBlood(double blood) {
        this.blood = blood;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8) {
            System.out.println("El numero de Telefono debe ser de 8 digitos maximo");
        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }

    }

    @Override
    public void showDataUser(){
        System.out.println("Paciente");
            System.out.println("Historial completo");
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\n Weight: " +getWeight()+"\nBlood"+blood;
    }

}