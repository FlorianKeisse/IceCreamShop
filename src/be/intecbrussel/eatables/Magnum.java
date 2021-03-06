package be.intecbrussel.eatables;

public class Magnum implements IEatable {

    public enum MagnumType {
        MILKCHOCOLATE, // x1
        WHITECHOCOLATE, // x1
        BLACKCHOCOLATE, // x1
        ALPINENUTS, // x1.5
        ROMANTICSTRAWBERRIES; // x1
    }

    private MagnumType type;

    public Magnum() {
    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println("You are eating a yummy magnum with: " + (getMagnumType()) + " Flavor");
    }

    public MagnumType getMagnumType() {
        return type;
    }
}
