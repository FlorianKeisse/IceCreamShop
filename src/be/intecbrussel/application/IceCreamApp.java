package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IEatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {

        PriceList priceList = new PriceList();
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);
        IceCreamSeller iceCreamSeller = iceCreamSalon;

        // TODO: 
        // iceCreamSeller seller = new IceCreamSalon(priceList);

        IceRocket iceRocket = iceCreamSalon.orderIceRocket();

        Cone.Flavor[] flavors1 = {Cone.Flavor.CHOCOLATE, Cone.Flavor.VANILLA};
        Cone cone = iceCreamSalon.orderCone(flavors1);

        Magnum magnum = iceCreamSalon.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);

        IEatable[] eatables = {iceRocket, cone, magnum};
        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();
        }

        // TODO: message formatter :)

        System.out.println("Total profit of the IceCream Seller: " + iceCreamSeller.getProfit() + " Euros or whatever");

    }
}
