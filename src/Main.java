import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {
    Car car = new Car("ford", "Mustnag", 2013);
    Phone phone = new Phone("apple", "Ihpone 14", 2022 );
    car.TurnOn();
    phone.TurnOn();
        System.out.println(car);
        System.out.println(phone);
    }
}
