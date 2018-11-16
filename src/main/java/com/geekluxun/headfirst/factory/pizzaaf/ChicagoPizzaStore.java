package com.geekluxun.headfirst.factory.pizzaaf;

public class ChicagoPizzaStore extends PizzaStore {

    /**
     * 工厂方法，子类决定实例化对象
     * 此处遵循了"依赖倒置原则",高层（ChicagoPizzaStore）不依赖低层（具体类CheesePizza）
     * ，两者都依赖抽象（抽象类Pizza）
     * @param item
     * @return
     */
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        // 芝加哥原料工厂 使用抽象工厂模式
        PizzaIngredientFactory ingredientFactory =
                new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");

        }
        return pizza;
    }
}
