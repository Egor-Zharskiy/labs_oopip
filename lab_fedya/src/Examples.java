import TOYS.*;

import java.util.ArrayList;

public class Examples {
    private ArrayList<Toys> toys = new ArrayList<>();

    public ArrayList initial() {
        toys.add(new Balls());
        toys.add(new BigCar());
        toys.add(new Cubes());
        toys.add(new Doll());
        toys.add(new MediumCar());
        toys.add(new SmallCar());
        int k = 1;
        for(Toys toys1 : toys){
            System.out.println(k + " - " + toys1.toString());
            k++;
        }
        System.out.println("7 - Вернуться назад");

        return toys;
    }
}