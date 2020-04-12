package com.example.designpattern.SingletonPattern;

import com.example.designpattern.IPattern;

public class MainSingletonPattern implements IPattern {

    @Override
    public void run() {
        SingletonClass.getInstance().display();
    }
}
