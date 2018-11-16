package com.geekluxun.headfirst.factory.pizzafm;

public abstract class PizzaStore {
    /**
     * 工厂方法是抽象的
     * @param item
     * @return
     */
    abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
