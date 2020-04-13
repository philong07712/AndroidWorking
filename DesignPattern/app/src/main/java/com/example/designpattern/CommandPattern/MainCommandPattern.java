package com.example.designpattern.CommandPattern;

import com.example.designpattern.CommandPattern.Command.LightCommand;
import com.example.designpattern.CommandPattern.Command.SoundCommand;
import com.example.designpattern.CommandPattern.Invoker.Invoker;
import com.example.designpattern.CommandPattern.Receiver.Light;
import com.example.designpattern.CommandPattern.Receiver.Sound;
import com.example.designpattern.IPattern;

public class MainCommandPattern implements IPattern {

    @Override
    public void run() {
        Invoker remote = new Invoker(new SoundCommand(new Sound()), new SoundCommand(new Sound()),
                new LightCommand(new Light()), new LightCommand(new Light()));
        remote.upClick();
        remote.downClick();
        remote.offClick();
        remote.onClick();

        remote.onClick();
    }
}
