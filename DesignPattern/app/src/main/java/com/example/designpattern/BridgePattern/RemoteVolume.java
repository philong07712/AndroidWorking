package com.example.designpattern.BridgePattern;

import android.util.Log;

public class RemoteVolume extends Remote {


    public RemoteVolume(Television television) {
        super(television);
    }

    @Override
    public void nextButtonClick() {
        this.tvObject.setVolume(this.tvObject.getVolume() + 1);
        Log.d(MainBridgePattern.TAG,"Volume up");

    }

    @Override
    public void backButtonClick() {
        this.tvObject.setVolume(this.tvObject.getVolume() - 1);
        Log.d(MainBridgePattern.TAG,"Volume down");

    }

    @Override
    public void mainButtonClick() {
        this.tvObject.setVolume(0);
        Log.d(MainBridgePattern.TAG,"Mute");
    }
}
