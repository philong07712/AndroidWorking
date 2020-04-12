package com.example.designpattern.CommandPattern.Invoker;

import com.example.designpattern.CommandPattern.Command.ICommand;

public class Invoker {
    ICommand upButton;
    ICommand downButton;
    ICommand offButton;
    ICommand onButton;

    public Invoker(ICommand upButton, ICommand downButton, ICommand offButton, ICommand onButton) {
        this.upButton = upButton;
        this.downButton = downButton;
        this.offButton = offButton;
        this.onButton = onButton;
    }

    public void upClick()
    {
        this.upButton.execute();
    }

    public  void downClick()
    {
        this.downButton.execute();
    }

    public void offClick()
    {
        this.offButton.execute();
    }

    public void onClick()
    {
        this.onButton.execute();
    }
}
