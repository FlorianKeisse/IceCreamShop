package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller {

    private PriceList priceList;
    private double totalProfit = 0;

    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        Cone cone = new Cone(flavors);
        if (flavors != null) {
            for (int i = 0; i < flavors.length; i++) {
                totalProfit += priceList.getBallPrice();
            }
        }
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit += priceList.getRocketPrice();

        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        totalProfit += priceList.getMagnumPrice(magnumType);
        return new Magnum(magnumType);
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }


    @Override
    public double getProfit() {
        return totalProfit;
    }
}
