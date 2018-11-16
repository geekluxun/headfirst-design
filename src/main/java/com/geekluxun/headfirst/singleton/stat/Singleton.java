package com.geekluxun.headfirst.singleton.stat;

public class Singleton {
    /**
     * 静态变量实现单例
     */
    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
