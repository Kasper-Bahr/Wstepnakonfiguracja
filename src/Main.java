import devices.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("mustang", "ford");
        Car car2 = new Car("mustangg", "ford");
        System.out.println(car1);
        System.out.println(car2);
        if (car1.equals(car2)){
            System.out.println("car 1 jest równy car2");
        }else {
            System.out.println("car 1 nie jest równy car2");
        }

        }
    }
