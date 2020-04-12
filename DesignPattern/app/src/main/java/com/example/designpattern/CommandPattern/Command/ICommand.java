package com.example.designpattern.CommandPattern.Command;

import com.example.designpattern.CommandPattern.Receiver.IReceiver;
import com.example.designpattern.CommandPattern.Receiver.Light;

public interface ICommand {
    public void execute();
    public void unexecute();
}
