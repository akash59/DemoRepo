package learn.java.com.base.StrategyPattern.DuckClient;

import learn.java.com.base.StrategyPattern.FlyWithWings;
import learn.java.com.base.StrategyPattern.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }


    @Override
    public void display() {
        System.out.println("I am a real Mallard Duck !!!");
    }
}
