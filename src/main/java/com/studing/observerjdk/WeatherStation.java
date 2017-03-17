package com.studing.observerjdk;

/**
 * Created by fengqz on 2017-3-16.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.change(12.5f, 13.6f, 17.8f);
        currentConditionsDisplay.cancel();
        weatherData.change(44.4f, 55.5f, 66.6f);
    }
}
