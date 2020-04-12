package com.example.designpattern.CommandPattern.Command;

import com.example.designpattern.CommandPattern.Receiver.Light;

public class LightCommand implements ICommand {
    Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }

    @Override
    public void unexecute() {
        light.lightOff();
    }
}
