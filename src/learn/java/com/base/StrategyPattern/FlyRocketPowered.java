package learn.java.com.base.StrategyPattern;

public class FlyRocketPowered implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am flying rocket powered !!!!");
    }
}
