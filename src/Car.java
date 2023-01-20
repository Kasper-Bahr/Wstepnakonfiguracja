public class Car {
   private String model;
   private String producer;


    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }
    public String toString () {
        return "Model" + this.model + "Producent" + this.producer;
    }
}
