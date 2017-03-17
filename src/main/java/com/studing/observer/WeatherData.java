package com.studing.observer;

import java.util.ArrayList;

/**
 * Created by fengqz on 2017-3-16.
 */
public class WeatherData implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private float a;
    private float b;
    private float c;
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if ( i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(a, b, c);
        }
    }

    public void change(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
        notifyObservers();
    }
}
