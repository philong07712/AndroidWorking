package com.example.designpattern.AbstractFactoryPattern.Comsumable;

import android.util.Log;

public abstract class Comsumable implements IComsumable {
    int price;
    String name;

    public Comsumable(String name, int price)
    {
        this.name = name;
        this.price = price;
    }

    public void cost()
    {
        Log.d("AbstractFactoryPattern", Integer.toString(this.price));
    }

    public void display()
    {
        Log.d("AbstractFactoryPattern", this.name + " " + this.price);
    }
}
