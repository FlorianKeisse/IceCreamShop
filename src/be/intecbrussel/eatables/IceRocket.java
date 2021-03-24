package be.intecbrussel.eatables;

public class IceRocket implements IEatable{

    public IceRocket(){
    }

    @Override
    public void eat() {
        System.out.println("You're eating an IceRocket!!");
    }
}
