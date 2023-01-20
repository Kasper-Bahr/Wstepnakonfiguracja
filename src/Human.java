public class Human {
    Animal pet;
    String name;

    public Human(){
        this.name = "kasper";
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
