package devices;

import java.util.ArrayList;

public abstract class Devices {
    private double money;
    private String producer;
    private String model;
    private int yearOfProduction;

    private ArrayList<Application> apps;
    public Double value = 0.0;


    public Devices(String producer, String model, int yearOfProduction, double money, ArrayList<Application> apps) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.money = money;

        this.apps = new ArrayList<Application>();
    }



    public String toString() {
        return "producer: " + producer + " model: " + model + "Rok produkcji:" + yearOfProduction;
    }

    public abstract void TurnOn();





}
