package com.example.designpattern.CommandPattern.Receiver;

import android.util.Log;

public class Light implements IReceiver {
    public void lightOn()
    {
        Log.d("CommandPattern", "This light is on");
    }

    public void lightOff()
    {
        Log.d("CommandPattern", "This light is off");
    }
}
