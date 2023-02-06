package devices;

import java.util.ArrayList;

public abstract class Devices {
    private double money;
    private String producer;
    private String model;
    private int yearOfProduction;


    public Double value = 0.0;


    public Devices(String producer, String model, int yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;



    }



    public String toString() {
        return "producer: " + producer + " model: " + model + "Rok produkcji:" + yearOfProduction;
    }

    public abstract void TurnOn();





}
