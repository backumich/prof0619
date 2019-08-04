package com.vertex.academy.pineappleFactory;

import com.vertex.academy.pineappleFactory.factory.Factory;
import com.vertex.academy.pineappleFactory.fruit.Fruit;
import com.vertex.academy.pineappleFactory.fruit.FruitType;
import lombok.ToString;

import java.util.ArrayList;

@ToString
public class Pantry {
    private ArrayList <CannedFruit> cannedFruits;
    private Fruit[] fruits;
    private Pantry () {
        fruits = new Fruit[50];
        cannedFruits = new ArrayList<>();
        for (int i = 0; i < fruits.length ; i++) {
            int randCoef = (int)(Math.random() * 3);
            FruitType fruitType = defineFruitType(randCoef);
            fruits[i] = new Fruit(fruitType, defineWeight(fruitType), (int)(Math.random() * 81) , (int)(Math.random() * 71));
        }
    }

    public static final Pantry PANTRY = new Pantry();

    private int defineWeight (FruitType fruitType) {
        if (fruitType == FruitType.APPLE || fruitType == FruitType.PEACH) {
            return (int)(Math.random() * 251) + 50;
        } else {
            return (int)(Math.random() * 1001) + 1000;
        }
    }

    private FruitType defineFruitType (int randCoef) {
        switch (randCoef) {
            case 0: return FruitType.APPLE;
            case 1: return FruitType.PINEAPPLE;
            case 2: return FruitType.PEACH;
        }
        return null;
    }

    public void produce (Factory factory, int numbOfFruits) {
        for (int i = 0; i < numbOfFruits; i++) {
            CannedFruit cannedFruitbuff = factory.produce(fruits[i]);
            if (cannedFruitbuff != null) {
                cannedFruits.add(cannedFruitbuff);
            }
        }
    }

    public void inventoryFruit () {
        for (int i = 0; i < fruits.length; i++) {
            System.out.println( (i + 1) + ") Фрукт типа " + fruits[i].getFruitName() + ", вес " + fruits[i].getWeight()
                    + " грамм, водянистость " + fruits[i].getWateriness() + "%, сладость " + fruits[i].getSweetness() + "%.");
        }
    }

    public void inventoryCanned () {
        for (int i = 0; i < cannedFruits.size(); i++) {
            System.out.println((i + 1) + ") Консерва из фрукта типа " + cannedFruits.get(i).getFruitType() + ", добавленная вода "
                    + cannedFruits.get(i).getWater() + "%, добавленный сахар " + cannedFruits.get(i).getSweet() + "%.");
        }
    }
}

