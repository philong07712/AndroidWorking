package com.example.designpattern.BridgePattern;

public interface IRemote {
    void nextButtonClick();
    void backButtonClick();
    void mainButtonClick();
}

abstract class Remote implements IRemote
{
    protected Television tvObject;
    public Remote(Television television)
    {
        tvObject = television;
    }

    public void display()
    {
        tvObject.display();
    }

}

