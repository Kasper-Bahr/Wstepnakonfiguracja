import devices.Car;
import devices.Phone;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Phone iphone = new Phone("iphone", "Ihpone 14", 2022);

        List<String> appNames = new ArrayList<>();
        appNames.add("fb");
        appNames.add("messenger");
        appNames.add("Instagram");

        iphone.installAnnApp(appNames);
        iphone.installAnnApp("snake");
        iphone.installAnnApp("tweeter", "4.17");
        iphone.installAnnApp("santander", "1.11", "https://santander.com");
    }

}
