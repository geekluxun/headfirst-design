package com.geekluxun.headfirst.factory.pizzaaf;

/**
 * 工厂方法
 */
public abstract class PizzaStore {

    /**
     * 创建Pizza对象推迟到子类中，由子类创建
     * @param item
     * @return
     */
    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        // 把变化的部分"生产披萨"和不变的部分"下单披萨"隔离开来
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
