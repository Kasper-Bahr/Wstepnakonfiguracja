import creatures.Human;
import devices.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        Car tesla =new Electric("tesla", "T", 2020, 100);
        Car ford =new Diesel("ford", "focus", 2015, 100);
        Car fiat =new LPG("fiat", "bravo", 2005, 100);

        tesla.value = 167000.0;
        ford.value = 12000.0;
        fiat.value = 7000.0;
        Human me = new Human();
        me.setCar(tesla, 0);
        me.setCar(ford, 1);

        me.sortCarsByValue();
        for (int i = 0; i < Human.DEFOULT_GARAGE_SIZE; i++){
            System.out.println(me.getCar(i));
        }

    }
}

