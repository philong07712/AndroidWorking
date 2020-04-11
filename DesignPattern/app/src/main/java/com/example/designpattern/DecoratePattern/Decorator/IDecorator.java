package com.example.designpattern.DecoratePattern.Decorator;

public abstract class IDecorator {
    int cost;

    public IDecorator(int cost) {
        this.cost = cost;
    }

    public abstract void Display();
    public int cost()
    {
        return this.cost;
    }
}
