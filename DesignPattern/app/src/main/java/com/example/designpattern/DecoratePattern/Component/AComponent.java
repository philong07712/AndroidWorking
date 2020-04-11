package com.example.designpattern.DecoratePattern.Component;

import com.example.designpattern.DecoratePattern.Decorator.IDecorator;

import java.util.ArrayList;
import java.util.List;

public abstract class AComponent {
    List<IDecorator> decorators = new ArrayList<>();
    int cost;
    public AComponent(int cost)
    {
        this.cost = cost;
    }
    public abstract void display();
    public int cost()
    {
        int sum = this.cost;
        for (int i = 0; i < decorators.size(); i++)
        {
            sum += decorators.get(i).cost();
        }
        return sum;
    }
    public void addDecorator(IDecorator decorator)
    {
        this.decorators.add(decorator);
    }
    public void removeDecorator(IDecorator decorator)
    {
        this.decorators.remove(decorator);
    }
}
