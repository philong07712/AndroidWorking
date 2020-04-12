package com.example.designpattern.AbstractFactoryPattern.Comsumable.Drink;

import android.util.Log;

public class Coca extends Drink {

    public Coca() {
        super("CocaCola", 2);
    }

    @Override
    public void use() {
    }
}
