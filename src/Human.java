import java.util.Date;

public class Human {
    Animal pet;
    String name;
    private double salary;
    private Car car;

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
}
