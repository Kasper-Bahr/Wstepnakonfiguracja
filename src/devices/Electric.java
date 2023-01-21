package devices;

public class Electric extends Car{
private int batterySize;
    public Electric(String producer, String model, int yearOfProduction, int batterySize) {
        super(producer, model, yearOfProduction );
        this.batterySize = batterySize;
    }

    @Override
    public void refuel() {
        System.out.println("bateria sie ładuje");
    }

}
