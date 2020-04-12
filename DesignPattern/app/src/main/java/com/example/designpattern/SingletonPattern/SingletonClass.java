package com.example.designpattern.SingletonPattern;

import android.util.Log;

public class SingletonClass {
    static private SingletonClass instance;
    private SingletonClass()
    {

    }

    static public SingletonClass getInstance()
    {
        if (SingletonClass.instance == null)
        {
            SingletonClass.instance = new SingletonClass();
        }
        return SingletonClass.instance;
    }

    public void display()
    {
        Log.d("SingletonPattern", "This is Singleton Class");
    }
}
