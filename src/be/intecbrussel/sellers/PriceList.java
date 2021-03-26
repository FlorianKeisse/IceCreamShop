package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {

    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;


    public PriceList() {
        ballPrice = 1;
        rocketPrice = 1;
        magnumStandardPrice = 1.1;

        // TODO: it is not advised .. 
        System.out.printf("Bol prijs: %s%nRaket prijs:  %s%nMagnum Normal prijs: %s%n%n", ballPrice, rocketPrice, magnumStandardPrice);
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.rocketPrice = rocketPrice;
        this.ballPrice = ballPrice;
        this.magnumStandardPrice = magnumStandardPrice;

        // TODO: it is not advised ..
        System.out.printf("Bol prijs: %s%nRaket prijs:  %s%nMagnum Normal prijs: %s%n%n", ballPrice, rocketPrice, magnumStandardPrice);

    }

    public double getBallPrice() {
        return ballPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType magnumType) {
        if (magnumType == Magnum.MagnumType.ALPINENUTS) {
            magnumStandardPrice *= 1.5;
        }
        return magnumStandardPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    private void printPriceList() {
        System.out.printf("Bol prijs: %s%nRaket prijs:  %s%nMagnum Normal prijs: %s%n%n", ballPrice, rocketPrice, magnumStandardPrice);

        // TODO: MessageFormatter formatter = new MessageFormatter();
        // formatter.format("Bol prijs: {0}", ballPrice);

    }
}
