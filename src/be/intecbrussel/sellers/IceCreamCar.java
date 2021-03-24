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

        Cone preparedCone = null;
        try {
            preparedCone = prepareCone(flavors);
        } catch (NoMoreIceCreamException noMoreIceCreamException) {
            noMoreIceCreamException.printStackTrace();
        }

        return preparedCone;

    }

    private Cone prepareCone(Cone.Flavor[] flavors) throws NoMoreIceCreamException {

        if (stock.getBalls() < flavors.length || stock.getCones() < 1) {
            throw new NoMoreIceCreamException("You're out of stock on the cones mate or balls whatever.");
        } else {
            profit += priceList.getBallPrice() * flavors.length;
            stock.setCones(stock.getCones() - 1);
            stock.setBalls(stock.getBalls() - flavors.length);
            return new Cone(flavors);
        }
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket preparedIceRockets = null;
        try {
            preparedIceRockets = prepareIceRocket();
        } catch (NoMoreIceCreamException noMoreIceCreamException) {
            noMoreIceCreamException.printStackTrace();
        }
        return preparedIceRockets;
    }

    private IceRocket prepareIceRocket() throws NoMoreIceCreamException {
        if (stock.getIceRockets() < 1) {
            throw new NoMoreIceCreamException("You're out of IceRockets, surely you jest");
        } else {
            profit += priceList.getRocketPrice();
            stock.setIceRockets(stock.getIceRockets() - 1);
            return new IceRocket();
        }
    }

    private Magnum prepareMagnum(Magnum.MagnumType magnumType) throws NoMoreIceCreamException {
        if (stock.getMagni() < 1) {
            throw new NoMoreIceCreamException("You're all out of Mangi oh noo, you jester D:<");
        } else {
            profit += priceList.getMagnumPrice(magnumType);
            stock.setMagni(stock.getMagni() - 1);
            return new Magnum();
        }
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        Magnum preparedMagnum = null;
        try {
            preparedMagnum = prepareMagnum(magnumType);
        } catch (NoMoreIceCreamException noMoreIceCreamException) {
            noMoreIceCreamException.printStackTrace();
        }
        return preparedMagnum;
    }
}
