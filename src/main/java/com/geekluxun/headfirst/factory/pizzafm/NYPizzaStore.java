package com.geekluxun.headfirst.factory.pizzafm;

public class NYPizzaStore extends PizzaStore {

    /**
     * 工厂方法，子类完成对象实例化
     * @param item
     * @return
     */
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
