package learn.java.com.base.StrategyPattern;

public class FlyWithWings implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I am flying with wings...");
    }
}
