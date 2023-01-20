public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
        Car car = new Car("Mustang", "Ford");
        System.out.println(car);
        human.setCar(car);



    }
}