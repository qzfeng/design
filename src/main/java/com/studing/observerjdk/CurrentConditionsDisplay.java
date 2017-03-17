package com.studing.observerjdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by fengqz on 2017-3-16.
 */
public class CurrentConditionsDisplay implements Observer {
    private float a;
    private float b;
    private float c;
    private Observable subject;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        // 保存主题，方便取消用
        subject = weatherData;
        // 注册订阅主题
        weatherData.addObserver(this);
    }

    public void display() {
        System.out.println("CurrentConditionsDisplay: a = " + a + ", b = " + b + ", c = " + c);
    }

    public void cancel() {
        subject.deleteObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.a = weatherData.getA();
            this.b = weatherData.getB();
            this.c = weatherData.getC();
            display();
        }
    }
}
