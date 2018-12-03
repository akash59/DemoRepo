package learn.java.com.base.StrategyPattern;

public class Quack implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack Quack !!!");
    }
}
