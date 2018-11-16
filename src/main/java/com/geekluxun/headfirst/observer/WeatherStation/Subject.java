package com.geekluxun.headfirst.observer.WeatherStation;

/**
 * 主题
 */
public interface Subject {
    /**
     * 注册观察者
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 移除观察者
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 数据变化时通知观察者
     */
    public void notifyObservers();
}
