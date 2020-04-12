package com.example.designpattern.AbstractFactoryPattern.Comsumable.Food;

import com.example.designpattern.AbstractFactoryPattern.Comsumable.Comsumable;

public abstract class Food extends Comsumable {

    public Food(String name, int price) {
        super(name, price);
    }
}
