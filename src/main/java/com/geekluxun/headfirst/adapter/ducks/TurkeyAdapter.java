package com.geekluxun.headfirst.adapter.ducks;

/**
 * 适配器和被适配者使用组合
 */
public class TurkeyAdapter implements Duck {
    /**
     * 被适配的火鸡
     */
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
