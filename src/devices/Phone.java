package devices;


import java.awt.*;
import java.util.List;

public class Phone extends Devices{

public static final String DEFAULT_SERVER_ADDRESS = "https://aplikacje.pl.apps";

    public static final String DEFAULT_VERSION = "1.0";


    public Phone(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void TurnOn() {

    }

    public void installAnnApp(String appName){
    this.installAnnApp(appName, DEFAULT_VERSION);
    }
    public void installAnnApp(String appName, String appVersion){
        this.installAnnApp(appName, appVersion, DEFAULT_SERVER_ADDRESS);
    }
    public void installAnnApp(String appName, String appVersion, String serverAddress){
        System.out.println("próba instalacji aplikacji" + appName);
        System.out.println("z serwera " + serverAddress);
        System.out.println("sprwadzam miejsce w pamieci");
        System.out.println("kontrola rodzicielska");
        System.out.println("pobieranie aplikacji");
        System.out.println("instalowanie aplikacji");
    }
    public void installAnnApp(List<String> appNames) {
        for (String appName : appNames){
            this.installAnnApp(appName);
        }

    }






}
