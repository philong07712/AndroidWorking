package com.example.designpattern.AbstractFactoryPattern.Factory;

import com.example.designpattern.AbstractFactoryPattern.Comsumable.Drink.Drink;
import com.example.designpattern.AbstractFactoryPattern.Comsumable.Drink.Sprite;
import com.example.designpattern.AbstractFactoryPattern.Comsumable.Food.Food;

public interface IFactory {
    public Drink getDrink();
    public Food getFood();
}
