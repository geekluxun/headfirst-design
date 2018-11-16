package com.geekluxun.headfirst.strategy;

/**
 *  鸭子类不负责具体的飞行和叫的行为，委托给接口实现完成，
 *  使用了设计原则：针对接口编程而不是针对实现编程（准确的说叫针对超类型编程）
 *  这是策略模式的一个典型示例（一组算法族可以相互替换）
 *  鸭子的行为不是通过"继承"而是通过"组合"而来的
 */
public abstract class Duck {
    /**
     * 飞行行为 一组可以在运行时动态互相替换的"算法"
     */
    FlyBehavior flyBehavior;
    /**
     * 叫行为 一一组可以在运行时动态互相替换的"算法"
     */
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
