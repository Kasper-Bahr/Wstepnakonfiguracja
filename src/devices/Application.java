package devices;
public class Application {
    private String name;
    private String version;
    private double price;


    public Application(String name, String version, double price) {
        this.name = name;
        this.version = version;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public double getPrice() {
        return price;
    }
}
