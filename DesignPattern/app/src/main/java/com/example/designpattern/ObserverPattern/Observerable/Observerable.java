package com.example.designpattern.ObserverPattern.Observerable;

import com.example.designpattern.ObserverPattern.Observer.IObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class Observerable {
    List<IObserver> observers;
    public Observerable()
    {
        observers = new ArrayList<>();
    }
    public void add(IObserver object)
    {
        observers.add(object);
    }
    public void remove(IObserver object)
    {
        observers.remove(object);
    }

    public void notifing()
    {
        for (int i = 0; i < observers.size(); i++)
        {
            observers.get(i).update();
        }
    }
}
