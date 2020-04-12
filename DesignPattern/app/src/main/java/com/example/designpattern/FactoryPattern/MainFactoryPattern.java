package com.example.designpattern.FactoryPattern;

import com.example.designpattern.FactoryPattern.Animal.Animals.Cat;
import com.example.designpattern.FactoryPattern.Animal.Animals.Fox;
import com.example.designpattern.FactoryPattern.Animal.IAnimal;
import com.example.designpattern.FactoryPattern.Factory.BalanceFactory;
import com.example.designpattern.IPattern;

import java.util.ArrayList;
import java.util.List;

public class MainFactoryPattern implements IPattern {
    List<IAnimal> animals = new ArrayList<>();
    @Override
    public void run() {
        BalanceFactory factory = new BalanceFactory();
        animals.add(factory.createAnimal());
        display();
    }
    private void display()
    {
        for (int i = 0; i < animals.size(); i++)
        {
            animals.get(i).eat();
        }
    }
}
