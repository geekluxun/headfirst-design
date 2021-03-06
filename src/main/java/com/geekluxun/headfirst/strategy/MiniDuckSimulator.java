package com.geekluxun.headfirst.strategy;

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuckie = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();

        ModelDuck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        // 运行时动态的指定不同的飞行实现类
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
