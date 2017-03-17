package com.studing.observerjdk;

import java.util.Observable;

/**
 * Created by fengqz on 2017-3-16.
 */
public class WeatherData extends Observable {
    private float a;
    private float b;
    private float c;

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public void change() {
        setChanged();
        notifyObservers();
    }
    public void change(float a, float b, float c) {
        this.a=a;
        this.b=b;
        this.c=c;
        change();
    }
}
