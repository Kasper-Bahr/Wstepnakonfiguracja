package devices;

public class Car {
   private String model;
   private String producer;
   public double value;

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue(){
    return value;
}

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }


    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model.equals(car.model) && producer.equals(car.producer);
    }

    public String toString () {
        return "Model" + this.model + "Producent" + this.producer;
    }
}
