package com.example.designpattern.CommandPattern.Command;

import com.example.designpattern.CommandPattern.Receiver.Sound;

public class SoundCommand implements ICommand {
    Sound sound;

    public SoundCommand(Sound sound) {
        this.sound = sound;
    }

    @Override
    public void execute() {
        this.sound.volumeUp();
    }

    @Override
    public void unexecute() {
        this.sound.volumeDown();
    }
}
