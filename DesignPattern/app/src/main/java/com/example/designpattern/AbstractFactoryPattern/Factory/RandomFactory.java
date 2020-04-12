package com.example.designpattern.AbstractFactoryPattern.Factory;

import com.example.designpattern.AbstractFactoryPattern.Comsumable.Drink.Coca;
import com.example.designpattern.AbstractFactoryPattern.Comsumable.Drink.Drink;
import com.example.designpattern.AbstractFactoryPattern.Comsumable.Drink.Sprite;
import com.example.designpattern.AbstractFactoryPattern.Comsumable.Food.Carrot;
import com.example.designpattern.AbstractFactoryPattern.Comsumable.Food.Food;
import com.example.designpattern.AbstractFactoryPattern.Comsumable.Food.MeatBall;

import java.util.List;
import java.util.Random;

public class RandomFactory implements IFactory {

    @Override
    public Drink getDrink() {
        int num = getRandomNumber(2);
        switch (num)
        {
            case 0:
                return new Sprite();
            default:
                return new Coca();
        }
    }

    @Override
    public Food getFood() {
        int num = getRandomNumber(2);
        switch (num)
        {
            case 0:
                return new MeatBall();
            default:
                return new Carrot();
        }
    }

    public int getRandomNumber(int max)
    {
        Random random = new Random();
        return random.nextInt(max);
    }
}
