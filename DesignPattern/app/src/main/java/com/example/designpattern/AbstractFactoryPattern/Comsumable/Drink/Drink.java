package com.example.designpattern.AbstractFactoryPattern.Comsumable.Drink;

import android.util.Log;

import com.example.designpattern.AbstractFactoryPattern.Comsumable.Comsumable;

public abstract class Drink extends Comsumable {

    public Drink(String name, int price) {
        super(name, price);
    }

}
