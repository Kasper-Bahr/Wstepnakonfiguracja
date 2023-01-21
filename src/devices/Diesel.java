package devices;

public class Diesel extends Car{
    private int fuelEconomy;

    public Diesel(String producer, String model, int yearOfProduction, int fuelEconomy) {
        super(producer, model, yearOfProduction);
        this.fuelEconomy = fuelEconomy;
    }


    @Override
    public void refuel() {
        System.out.println("bak jest zapełniany: ");
    }
}
