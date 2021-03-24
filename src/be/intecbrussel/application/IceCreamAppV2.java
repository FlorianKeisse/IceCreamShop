package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IEatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {

        PriceList priceList = new PriceList();
        Stock stock = new Stock();
        stock.setCones(5);
        stock.setBalls(5);
        stock.setMagni(5);
        stock.setIceRockets(1);
        IceCreamCar iceCreamCar = new IceCreamCar(priceList,stock);
        IceCreamSeller iceCreamSeller = iceCreamCar;

        IceRocket iceRocket = iceCreamCar.orderIceRocket();

        Cone.Flavor[] flavors1 = {Cone.Flavor.CHOCOLATE, Cone.Flavor.VANILLA,Cone.Flavor.BANANA,Cone.Flavor.STRACIATELLA, Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE};
        Cone.Flavor[] flavors2 = {Cone.Flavor.CHOCOLATE, Cone.Flavor.VANILLA};

        Cone cone = iceCreamCar.orderCone(flavors1);
        Cone cone1 = iceCreamCar.orderCone(flavors2);

        Magnum magnum = iceCreamCar.orderMagnum(Magnum.MagnumType.BLACKCHOCOLATE);

        IEatable[] eatables = {iceRocket, cone, magnum};
        for (int i = 0; i < eatables.length; i++) {
            if (eatables[i]!=null){
                eatables[i].eat();
            }
        }

        System.out.println("Total profit of the IceCream Seller: " + iceCreamSeller.getProfit() + " Euros or whatever");
        System.out.println("Stock left: " + stock.getCones());

    }
}
