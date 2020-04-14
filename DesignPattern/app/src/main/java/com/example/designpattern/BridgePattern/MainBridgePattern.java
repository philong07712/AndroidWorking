package com.example.designpattern.BridgePattern;

import com.example.designpattern.IPattern;

public class MainBridgePattern implements IPattern {
    public static final String TAG = "BridgePattern";
    @Override
    public void run() {
        Remote remote = new RemoteVolume(new HighResTelevision());
        remote.backButtonClick();
        remote.nextButtonClick();
        remote.nextButtonClick();
        remote.nextButtonClick();
        remote.nextButtonClick();
        remote.mainButtonClick();
        remote.display();

    }
}
