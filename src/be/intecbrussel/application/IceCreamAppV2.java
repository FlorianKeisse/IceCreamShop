package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IEatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {
    public static void main(String[] args) {

        PriceList priceList = new PriceList();
        Stock stock = new Stock();
        stock.setCones(5);
        stock.setBalls(5);
        stock.setMagni(5);
        stock.setIceRockets(1);
        IceCreamCar iceCreamCar = new IceCreamCar(priceList, stock);
        IceCreamSeller iceCreamSeller = iceCreamCar;

        IceRocket iceRocket = iceCreamCar.orderIceRocket();
        IceRocket iceRocket1 = iceCreamCar.orderIceRocket();

        Cone.Flavor[] flavors1 = {Cone.Flavor.CHOCOLATE, Cone.Flavor.VANILLA, Cone.Flavor.BANANA, Cone.Flavor.STRACIATELLA, Cone.Flavor.LEMON};
        Cone cone = iceCreamCar.orderCone(flavors1);

        Magnum magnum = iceCreamCar.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);

        IEatable[] eatables = {iceRocket, cone, magnum};
        for (int i = 0; i < eatables.length; i++) {
            if (eatables[i] != null) {
                eatables[i].eat();
            }
        }

        System.out.println("Total profit of the IceCream Seller: " + iceCreamSeller.getProfit() + " Euros or whatever");

        //EXTRA EXTRA EXTRA EXTRA EXTRA//

//        Cone.Flavor[] flavors2 = {Cone.Flavor.CHOCOLATE}; //HAAL UIT COMMENT OM EXCEPTION TE KRIJGEN
//        Cone cone2 = iceCreamCar.orderCone(flavors2); // HAAL UIT COMMENT OM EXCEPTION TE KRIJGEN
//
//
//        System.out.println("Stock left on the cones: " + stock.getCones());
//        System.out.println("Stock left on the balls: " + stock.getBalls());


    }
}
