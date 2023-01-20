package devices;

public abstract class Devices {
    private String producer;
    private String model;
    private int yearOfProduction;

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
