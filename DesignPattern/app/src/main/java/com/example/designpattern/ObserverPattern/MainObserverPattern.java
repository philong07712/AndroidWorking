package com.example.designpattern.ObserverPattern;

import com.example.designpattern.IPattern;
import com.example.designpattern.ObserverPattern.Observer.IObserver;
import com.example.designpattern.ObserverPattern.Observer.TrackingObserver;
import com.example.designpattern.ObserverPattern.Observer.UntrackingObsersver;
import com.example.designpattern.ObserverPattern.Observerable.Observerable;
import com.example.designpattern.ObserverPattern.Observerable.WeatherStation;

public class MainObserverPattern implements IPattern {
    WeatherStation station = new WeatherStation();
    @Override
    public void run() {
        init();
        station.notifing();
    }
    public void init()
    {
        station.add(new TrackingObserver(station));
        station.add(new UntrackingObsersver(station));
    }
}
