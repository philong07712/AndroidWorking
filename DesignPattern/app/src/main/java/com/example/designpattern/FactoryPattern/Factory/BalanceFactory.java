package com.example.designpattern.FactoryPattern.Factory;

import com.example.designpattern.FactoryPattern.Animal.Animal;
import com.example.designpattern.FactoryPattern.Animal.Animals.Cat;
import com.example.designpattern.FactoryPattern.Animal.Animals.Dog;
import com.example.designpattern.FactoryPattern.Animal.Animals.Fox;
import com.example.designpattern.FactoryPattern.Animal.IAnimal;

import java.util.List;

public class BalanceFactory implements IFactory {
    private static int numOfAnimal = 0;
    @Override
    public Animal createAnimal() {
       BalanceFactory.numOfAnimal++;
        switch (numOfAnimal) {
            case 0:
                return new Dog();
            case 1:
                return new Cat();
            default:
                return new Fox();
        }
    }

    private void changeNumber()
    {
        BalanceFactory.numOfAnimal++;
        BalanceFactory.numOfAnimal %= 3;

    }
}
