import java.util.Date;

public class Human {
    Animal pet;
    String name;
    private Double salary;

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



    private Car car;
    public void setCar(Car car) {
        this.car = car;
    }
    public Car getCar() {
        return car;
    }



    public String toString () {
        return "imie" + this.name;
    }
}
