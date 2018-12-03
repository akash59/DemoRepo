package learn.java.com.base.StrategyPattern;

public class Squeak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
