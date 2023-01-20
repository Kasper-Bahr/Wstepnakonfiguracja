public class Animal {

    String species;
    Double weight;

    Animal(String species, Double weight){
        this.species = species;
        this.weight = weight;
    }

    public void feed() {
        if(weight <= 0) {
            System.out.println("Zwierze nie żyje.");
        }
        else
        {
            weight++;
        }
    }
    public void takeForAWalk(){
    if (weight <= 0) {
        System.out.println("Zwierze nie żyje nie możesz go wyprowadzić na spacer");
    }else
    {
    weight--;
    }
    if(weight == 0){
        System.out.println("Trupa wyprowadzasz?");
    }
    }
    public String toString () {
        return "Rodzaj" + this.species + "Waga:" + this.weight;
    }
}
