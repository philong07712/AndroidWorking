package com.example.designpattern.BridgePattern;

import android.util.Log;

public class RemotePause extends Remote {

    public RemotePause(Television television) {
        super(television);
    }

    @Override
    public void nextButtonClick() {
        this.tvObject.setChanel(this.tvObject.getChanel() + 1);
        Log.d(MainBridgePattern.TAG,"This TV has move up channel");
    }

    @Override
    public void backButtonClick() {
        this.tvObject.setChanel(this.tvObject.getChanel() - 1);
        Log.d(MainBridgePattern.TAG,"This TV has move down channel");

    }

    @Override
    public void mainButtonClick() {
        Log.d(MainBridgePattern.TAG,"This TV has pause");

    }
}
