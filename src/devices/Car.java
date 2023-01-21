package devices;

import creatures.Human;

public abstract class Car extends Devices implements Comparable<Car> {
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
public void sell(Human seller, Human buyer, Double price)throws Exception {
       if(!seller.hasACar(this)){
           throw new Exception("sprzedawca nie ma samochodu");
       }  if (!buyer.canHaveMoreCars()) {
           throw new Exception("kupujący nie ma dość mniejsca w garażu");

       } if (buyer.hasLessMoneyThan(price)){
           throw new Exception("kupujący nie ma dość pieniedzy");
       }
        // logika która chce wykonać
        seller.removeCar(this);
       buyer.addCar(this);
       seller.addMoney(price);
       buyer.collectMoney(price);
    System.out.println("Transakcja powiodła sie");



}
public abstract void refuel();


  /*  public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model.equals(car.model) && producer.equals(car.producer);
    }*/

public int compereTo (Car otherCar){
    return this.model.compareTo(otherCar.model);
}
    @Override
    public void TurnOn() {

    }
}
