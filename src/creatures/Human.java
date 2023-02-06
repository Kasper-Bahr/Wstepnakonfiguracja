package creatures;

import devices.Car;

import java.util.Arrays;
import java.util.Date;

public class Human  {

    public final static Integer DEFOULT_GARAGE_SIZE = 3;
    public final static Integer DEFOULT_START_SALARY = 0;

    Animal pet;
    String name;
    private double salary;
    private Car car;
    private double cash;
private String carName;
    private Car[] garage;


    public Human(){
        this.garage = new Car[DEFOULT_GARAGE_SIZE];
        salary = DEFOULT_START_SALARY;
    }
    public Human(Integer garageSize) {
        this.garage = new Car[garageSize];
        salary = DEFOULT_START_SALARY;
    }


    public void setCar(Car newCar, Integer parkingLotNumber){

        if (parkingLotNumber >= garage.length){
            System.out.println("sorry za mały garaż");
        } else if (parkingLotNumber < 0){
            System.out.println("nie ma ujemnych miejsc");
        } else {
        this.garage[parkingLotNumber] = newCar;
        }
    }
        public Car getCar(Integer parkingLotNumber) {
        return this.garage[parkingLotNumber];
        }

        public void sortCarsByValue(){
            Arrays.sort(this.garage);
        }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void setSalary(Double salary) {
        if (salary < 0){
            System.out.println("wypłata nie może być ujemna");
        }else {
            System.out.println("nowe dane zostały wysłane do systemu księgowego");
            System.out.println("konieczność odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty nie ma sensu ukrywać wynagrodzenia");
        }
        this.salary = salary;
    }
    public Double getSalary() {
        System.out.println("data dostępu do wynagrodzenia:" + new Date());
        System.out.println("Wyoskosc wynagrodzenia: " + salary);
        return salary;
    }




    public void setCar(Car car) {
        if (salary >= car.getValue()) {
            System.out.println("Brawo udało ci się kupić samochód!");
            this.car = car;
        } else if (salary >= car.getValue() / 12) {
            System.out.println("masz wystarczająco kasy by wziac auto w kredyt no trudno :/");
            this.car = car;
        }else {
            System.out.println("idz na studia albo po podwyżke lol");
        }
    }
    public Car getCar() {
        return car;
    }



    public String toString () {
        return "imie" + this.name;
    }

    public boolean hasACar(Car car) {
        boolean hasACar = false;
        for (int i = 0;i<this.garage.length;i++){
            if(this.garage[i] == car){
                hasACar = true;
            }
        }
        return hasACar;
    }

   /* public boolean canHaveMoreCars() {
        boolean canHaveMoreCars = false;
        for (int i = 0;i<this.garage.length;i++){
            if(this.garage[i] == car){
                canHaveMoreCars = true;
            }
        }
        
        
    }

    public boolean hasLessMoneyThan(Double price) {
        boolean hasLessMoneyThan = false;
        for (int i = 0;i<this.salary;i++){
            if (this.salary[i] == car) {
                hasLessMoneyThan = true;
                break;
            }
        }
    }*/

    public void removeCar(Car car) {
    }

    public void addCar(Car car) {
    }

    public void addMoney(Double price) {
    }

    public void collectMoney(Double price) {
    }

    public boolean canHaveMoreCars() {
        return false;
    }

    public boolean hasLessMoneyThan(Double price) {
        return false;
    }
}
