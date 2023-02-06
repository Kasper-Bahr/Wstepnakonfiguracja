import creatures.Human;
import devices.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

Phone phone = new Phone("apple", "Iphone 14", 2022, 1000.0);
Application app1 = new Application("Messenger", "41", 0);
        Application app2 = new Application("youtbue", "4.5", 56.0);
        Application app3 = new Application("netflix", "6.7", 24);

        phone.installApplication(app1);

        phone.installApplication(app3);

        System.out.println("lista zainstalowanych aplikacji");
        for (Application app: phone.getApplications()){
            System.out.println(app.getName());
        }

        System.out.println("aplikacja messenger jest zainstalowana" + phone.isAppInstalled(app1));
        System.out.println("aplikacja youtube jest zainstalowana" + phone.isAppInstalled(app2));

        System.out.println("darmowe aplikacje");
        phone.printFreeApps();

        System.out.println("posortowane alfabetycznie");
phone.printAppsInAlphabeticalOrder();

        System.out.println("posortowane według cany");
        phone.printAppsByPrice();

        System.out.println("laczna ilosc apek" + phone.getTotalValueOfInstalledApps());
    }
}

