package devices;

public abstract class Car extends Devices {
   private String model;
   private String producer;
   public double value;

    public Car(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue(){
    return value;
}

public abstract void refuel();


  /*  public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model.equals(car.model) && producer.equals(car.producer);
    }*/


    @Override
    public void TurnOn() {

    }
}
