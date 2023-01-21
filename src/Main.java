import devices.Car;
import devices.LPG;
import devices.Phone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LPG lpgCar = new LPG("Opel", "Astra", 2013, 60);
        lpgCar.refuel();
    }
}

