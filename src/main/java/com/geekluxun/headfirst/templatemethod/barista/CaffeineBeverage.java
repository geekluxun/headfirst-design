package com.geekluxun.headfirst.templatemethod.barista;

public abstract class CaffeineBeverage {

    /**
     * 模板方法定义了算法的一系列步骤
     * 部分步骤由子类实现
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 由子类实现
     */
    abstract void brew();
    /**
     * 由子类实现
     */
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
