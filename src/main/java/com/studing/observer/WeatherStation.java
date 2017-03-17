package com.studing.observer;

/**
 * Created by fengqz on 2017-3-16.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.change(1.2f,2.3f,3.4f);
        weatherData.change(80.2f, 43.5f, 66.6f);
        currentConditionsDisplay.cancel();
        weatherData.change(10.8f, 22.9f, 43.2f);

    }
}
