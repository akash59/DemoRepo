package learn.java.com.base.StrategyPattern;

public class MuteQuack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack <<Silence>>");
    }
}
