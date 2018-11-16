package com.geekluxun.headfirst.templatemethod.barista;

public class BeverageTestDrive {
    public static void main(String[] args) {

        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        /**
         * 算法执行，算法以"模板"的形式封装在抽象类中
         */
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();


        TeaWithHook teaHook = new TeaWithHook();
        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\nMaking tea...");
        teaHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeHook.prepareRecipe();
    }
}
