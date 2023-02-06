package devices;




import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.List;

public class Phone extends Devices{


public static final String DEFAULT_SERVER_ADDRESS = "https://aplikacje.pl.apps";



    public static final String DEFAULT_VERSION = "1.0";

private List<Application> applications;
private double money;
    public Phone(String producer, String model, int yearOfProduction, double money) {
        super(producer, model, yearOfProduction);
        this.money = money;
        applications = new ArrayList<>();
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
public void installApplication(Application app){
        if (money >= app.getPrice()){
            applications.add(app);
            money -= app.getPrice();
            System.out.println("Aplikacja " + app.getName() + "została zainstalowana");
        } else{
            System.out.println("nie masz kasy na apke" + app.getName());
        }
}
public List<Application> getApplications(){
        return applications;
}
public double getMoney(){
        return money;
}
public boolean isAppInstalled(Application app){
        return applications.contains(app);
}
public boolean isAppinstalled(String appName){
        for (Application app : applications){
            if (app.getName().equals(appName)){
                return true;
            }
        }
        return false;
}

public void printFreeApps() {
        for(Application app : applications){
            if(app.getPrice()==0.0){
                System.out.println("aplikacja bezplatna" + app.getName());
            }
        }
}
public double getTotalValueOfInstalledApps(){
        double totalValue = 0.0;
        for(Application app : applications){
            totalValue += app.getPrice();
        }
        return totalValue;
}
public void printAppsInAlphabeticalOrder() {
        applications.sort((app1, app2) -> app1.getName().compareTo(app2.getName()));
        for (Application app :applications){
            System.out.println("aplikacja:" + app.getName());
        }
}
public void printAppsByPrice(){
        applications.sort((app1, app2) -> Double.compare(app1.getPrice(), app2.getPrice()));
        for (Application app: applications){
            System.out.println("aplikacja" + app.getName()+ "cena"+app.getPrice());
        }
}
}
