package com.example.designpattern.ObserverPattern.Observerable;

public class WeatherStation extends Observerable {
    String data = "This is weather station data";

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
