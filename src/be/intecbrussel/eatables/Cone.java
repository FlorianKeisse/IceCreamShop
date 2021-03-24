package be.intecbrussel.eatables;

import java.util.Arrays;

public class Cone implements IEatable {

    public enum Flavor {
        STRAWBERRY,
        BANANA,
        CHOCOLATE,
        VANILLA,
        LEMON,
        STRACIATELLA,
        MOKKA,
        PISTACHE;

    }

    private Flavor[] balls;

    public Cone() {
    }

    public Cone(Flavor[] flavors) {
        this.balls = flavors;
    }

    @Override
    public void eat() {
        System.out.println("You are eating a Cone with: " + Arrays.toString(balls));
    }

}


