package com.example.designpattern.ObserverPattern.Observer;

import android.util.Log;

import com.example.designpattern.ObserverPattern.Observerable.Observerable;
import com.example.designpattern.ObserverPattern.Observerable.WeatherStation;

public class TrackingObserver implements IObserver {
    WeatherStation station;

    public TrackingObserver(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        Display();
    }

    public void Display()
    {
        Log.d("ObserverPattern", "Tracking " + station.getData());
    }
}
