package com.example.designpattern.CommandPattern.Receiver;

import android.util.Log;

public class Sound implements IReceiver {

    public void volumeUp()
    {
        Log.d("CommandPattern", "Volume has turn upp");
    }

    public void volumeDown()
    {
        Log.d("CommandPattern", "Volume has turn downn");
    }

}
