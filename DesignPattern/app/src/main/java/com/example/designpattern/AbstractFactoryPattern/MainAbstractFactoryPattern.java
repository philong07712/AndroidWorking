package com.example.designpattern.AbstractFactoryPattern;

import com.example.designpattern.AbstractFactoryPattern.Comsumable.Comsumable;
import com.example.designpattern.AbstractFactoryPattern.Factory.RandomFactory;
import com.example.designpattern.IPattern;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.FactoryConfigurationError;

public class MainAbstractFactoryPattern implements IPattern {

    @Override
    public void run() {
        RandomFactory factory = new RandomFactory();
        List<Comsumable> comsumables = new ArrayList<>();
        comsumables.add(factory.getDrink());
        comsumables.add(factory.getFood());

        display(comsumables);
    }

    private void display(List<Comsumable> comsumables)
    {
        for (int i = 0; i < comsumables.size(); i++)
        {
            comsumables.get(i).display();
        }
    }
}
