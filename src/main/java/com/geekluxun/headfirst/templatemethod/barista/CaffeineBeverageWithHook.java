package com.geekluxun.headfirst.templatemethod.barista;

public abstract class CaffeineBeverageWithHook {

    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        // 钩子
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 钩子方法 子类可以覆盖它来"改变"算法的步骤
     * @return
     */
    boolean customerWantsCondiments() {
        return true;
    }
}
