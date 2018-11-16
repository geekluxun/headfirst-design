package com.geekluxun.headfirst.decorator.starbuzz;

/**
 * 具体装饰者，和被装饰者Beverage具有相同的超类
 * 这里虽然使用了继承，但是继承的目的不是为了继承行为，
 * 而是为了"类型匹配"，增加新的行为
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    /**
     * 在原有的饮料基础上增加牛奶调料的价格
     * @return
     */
    public double cost() {
        return .10 + beverage.cost();
    }
}
