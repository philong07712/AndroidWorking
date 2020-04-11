package com.example.designpattern.DecoratePattern;

import android.util.Log;

import com.example.designpattern.DecoratePattern.Component.AComponent;
import com.example.designpattern.DecoratePattern.Component.Coffee;
import com.example.designpattern.DecoratePattern.Component.Macchiato;
import com.example.designpattern.DecoratePattern.Decorator.Cheese;
import com.example.designpattern.DecoratePattern.Decorator.Chocolate;
import com.example.designpattern.IPattern;

import java.util.ArrayList;
import java.util.List;

import javax.crypto.Mac;

public class MainDecoratePattern implements IPattern {
    @Override
    public void run() {
        List<AComponent> drinks = new ArrayList<>();
        drinks.add(new Coffee());
        drinks.add(new Macchiato());
        addFlavor(drinks);
        display(drinks);
    }

    public void display(List<AComponent> drinks)
    {
        for (int i = 0; i < drinks.size(); i++)
        {
            Log.d("DecoratePattern", Integer.toString(drinks.get(i).cost()));
        }
    }

    public void addFlavor(List<AComponent> drinks)
    {
        for (int i = 0; i < drinks.size(); i++)
        {
            drinks.get(i).addDecorator(new Cheese());
        }
    }
}
