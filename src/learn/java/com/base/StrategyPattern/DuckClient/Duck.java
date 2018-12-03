package learn.java.com.base.StrategyPattern.DuckClient;

import learn.java.com.base.StrategyPattern.IFlyBehavior;
import learn.java.com.base.StrategyPattern.IQuackBehavior;

public abstract class Duck {


    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;


    public abstract void display();

    public void swim() {
        System.out.println("All ducks swim.....");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(IFlyBehavior fb) {
        flyBehavior = fb;
    }


    public void setQuackBehavior(IQuackBehavior qb) {
        quackBehavior = qb;
    }

}
