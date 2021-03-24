package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.icexception.NoMoreIceCreamException;

public class IceCreamCar implements IceCreamSeller {

    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public double getProfit() {
        return profit;
    }

    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        int stockBalls = stock.getBalls();
        int stockCones = stock.getCones();
        try {
            if (stockBalls < flavors.length || stockCones < 1) {
                throw new NoMoreIceCreamException("You're out of stock on the cones mate or balls whatever.");
            } else {
                profit += priceList.getBallPrice() * flavors.length;
                stock.setCones(stock.getCones() - 1);
                stock.setBalls(stock.getBalls() - flavors.length);
                return prepareCone(flavors);
            }
        } catch (NoMoreIceCreamException noMoreIceCreamException) {
            noMoreIceCreamException.printStackTrace();
        }
        return null;

    }

    private Cone prepareCone(Cone.Flavor[] flavors) {
        return new Cone(flavors);
    }

    @Override
    public IceRocket orderIceRocket() {
        profit += priceList.getRocketPrice();
        IceRocket iceRocket = new IceRocket();

        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        Magnum magnum = new Magnum(magnumType);
        profit += priceList.getMagnumPrice(magnumType);
        return magnum;
    }
}
