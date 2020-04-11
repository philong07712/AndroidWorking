package com.example.designpattern.ObserverPattern.Observer;

import android.util.Log;

import com.example.designpattern.ObserverPattern.Observerable.WeatherStation;

public class UntrackingObsersver implements IObserver {
    WeatherStation station;

    public UntrackingObsersver(WeatherStation station) {
        this.station = station;
    }

    @Override
    public void update() {
        Display();
    }

    public void Display()
    {
        Log.d("ObserverPattern", "Untracking " + station.getData());
    }
}
