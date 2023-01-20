public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setSalary(55000.0);
        Car car = new Car("mustang", "ford");
        car.setValue(15000.0);
        human.setCar(car);
        System.out.println(car);
    }
}