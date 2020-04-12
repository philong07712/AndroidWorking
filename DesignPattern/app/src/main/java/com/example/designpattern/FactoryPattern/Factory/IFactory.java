package com.example.designpattern.FactoryPattern.Factory;

import com.example.designpattern.FactoryPattern.Animal.Animal;
import com.example.designpattern.FactoryPattern.Animal.IAnimal;

public interface IFactory {
    public Animal createAnimal();
}
