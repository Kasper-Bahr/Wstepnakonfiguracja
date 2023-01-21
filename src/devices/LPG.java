package devices;

public class LPG extends Car {
    private  int tankSize;

    public LPG(String producer, String model, int yearOfProduction, int tankSize) {
        super(producer, model, yearOfProduction);
        this.tankSize = tankSize;
    }


    @Override
    public void refuel() {
        System.out.println("bak jest zapełniany");
    }
}
