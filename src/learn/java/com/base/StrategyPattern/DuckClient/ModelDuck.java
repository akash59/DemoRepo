package learn.java.com.base.StrategyPattern.DuckClient;

import learn.java.com.base.StrategyPattern.FlyNoWay;
import learn.java.com.base.StrategyPattern.Quack;

public class ModelDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I am Model Duck !!!");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

}
