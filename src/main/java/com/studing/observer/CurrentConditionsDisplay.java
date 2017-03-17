package com.studing.observer;

/**
 * Created by fengqz on 2017-3-16.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float a;
    private float b;
    private float c;
    private Subject subject;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        // 保存主题，方便取消用
        subject = weatherData;
        // 注册订阅主题
        weatherData.registerObserver(this);
    }

    public void update(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
        display();
    }

    public void display() {
        System.out.println("CurrentConditionsDisplay: a = " + a + ", b = " + b + ", c = " + c);
    }

    public void cancel() {
        subject.removeObserver(this);
    }
}
