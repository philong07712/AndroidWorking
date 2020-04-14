package com.example.designpattern.BridgePattern;

import android.util.Log;

import com.example.designpattern.CommandPattern.Invoker.Invoker;

public interface ITelevision {
}

abstract class Television implements ITelevision
{
    private int volume = 2;
    private int chanel = 1;
    private int maxVolume;

    public Television(int maxVolume)
    {
        this.maxVolume = maxVolume;
    }

    public int getChanel() {
        return chanel;
    }

    public void setChanel(int chanel) {
        this.chanel = chanel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void display()
    {
        Log.d(MainBridgePattern.TAG, "TV is on " + Integer.toString(this.volume) + " Channel at " +
                Integer.toString(this.chanel));
    }
}
