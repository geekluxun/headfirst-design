package com.geekluxun.headfirst.observer.WeatherStation;

/**
 * 所有的观察者都实现这个统一接口
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
