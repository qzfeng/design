package com.studing.observer;

/**
 * Created by fengqz on 2017-3-16.
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
