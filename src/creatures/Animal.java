package creatures;

import creatures.Human;

public abstract class Animal implements Feedable {

    String species;
    Double weight;
    private String name;
    private Human owner;

    Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }

    /* public void feed() {
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
    }*/
    public void feed() {
        if (weight <= 0) {
            System.out.println("Zwierze nie żyje.");
        } else {
            weight++;
        }

  /*  public String toString () {
        return "Rodzaj" + this.species + "Waga:" + this.weight;
    }*/

    /* @Override
    public void sell(Human seller, Human buyer, double price) {
        if (!seller.equals(owner)){
            System.out.println("sprzedawca nie posiada zwierzęcia");
            return;
        }
        if (buyer.getCash() < price) {
            System.out.println("kupujący nie ma wystraczajaca kasy");
            return;
        }
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        this.owner = buyer;
        System.out.println("udały się zakupy"); + buyer.getName()

    } */
    }
}
