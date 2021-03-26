package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.icexception.NoMoreIceCreamException;
public interface IceCreamSeller extends IProfitable {

    //TODO: renamte I - I - I - I :)

    Cone orderCone(Cone.Flavor[] flavors);

    IceRocket orderIceRocket();

    Magnum orderMagnum(Magnum.MagnumType magnumType);

}
