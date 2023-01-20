package Presenter;

import View.vista;
import Model.model;

public class App {
    private vista view;
    private static String name;
    private String address;
    private double phone;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public App() {

        view = new vista();

    }

    public String getName() {
        return this.name;
    }

    public String setName() {
        name = view.readString("Digite su nombre");
        return name;
    }

    public String getaddress() {
        return this.address;
    }

    public String setaddress() {
        address = view.readString("Digite su direccion");
        return address;
    }

    public String getbirthday() {
        return this.birthday;
    }

    public String setbirthday() {
        name = view.readString("Digite su fecha de nacimiento");
        return birthday;
    }

    public String getblood() {
        return this.blood;
    }

    public String setblood() {
        blood = view.readString("Digite su sangre");
        return blood;
    }

    public double getphone() {
        return phone;
    }

    public double setphone() {
        phone = view.readDouble("Digite su numero celular");
        return phone;
    }

    public double getweight() {
        return weight;
    }

    public double setweight() {
        weight = view.readDouble("Digite su peso");
        return weight;
    }

    public double getheight() {
        return height;
    }

    public double setheight() {
        height = view.readDouble("Digite su estatura");
        return height;
    }

    public void ask() {
        setName();
        setaddress();
        setbirthday();
        setblood();
        setheight();
        setweight();
        setphone();

    }

    public static void main(String[] args) {

        new App().ask();
    }
}
