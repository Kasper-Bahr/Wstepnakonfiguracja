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
    public String toString () {
        return "Model" + this.model + "Producent" + this.producer;
    }
}
