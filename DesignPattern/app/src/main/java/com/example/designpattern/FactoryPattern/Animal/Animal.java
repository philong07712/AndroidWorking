package com.example.designpattern.FactoryPattern.Animal;

import android.util.Log;

public abstract class Animal implements IAnimal{
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void display()
    {
        Log.d("FactoryPattern", name);
    }

    public void eat()
    {
        Log.d("FactoryPattern", name + " eat");
    }
    public void sleep()
    {
        Log.d("FactoryPattern", name + " sleep");
    }
}
