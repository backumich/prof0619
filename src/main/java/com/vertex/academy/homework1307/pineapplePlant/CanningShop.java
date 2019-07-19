package com.vertex.academy.homework1307.pineapplePlant;

import java.util.ArrayList;

public class CanningShop {
    private Fruit[] fruits;
    private ArrayList<CannedFood> cannedFoods;

    private CanningShop() {
        fruits = new Fruit[100];
        cannedFoods = new ArrayList<>();
        for (int i = 0; i < fruits.length; i++) {
            int randType = (int) (Math.random() * 3);
            int randWater = (int) (Math.random() * 100);
            int randSweet = (int) (Math.random() * 100);
            FruitType typeFruit = (randomType(randType));
            fruits[i] = new Fruit(typeFruit, randSweet, randWater, randomWeight(typeFruit));
        }
    }

    private FruitType randomType(int randType) {
        switch (randType) {
            case 0:
                return FruitType.APPLE;
            case 1:
                return FruitType.PINEAPPLE;
            case 2:
                return FruitType.PEACHE;
        }
        return null;
    }

    private int randomWeight(FruitType typeFruit) {
        if (typeFruit == FruitType.APPLE) {
            return (int) ((Math.random() * 171) + 30);
        } else if (typeFruit == FruitType.PEACHE) {
            return (int) ((Math.random() * 121) + 30);
        } else {
            return (int) ((Math.random() * 1301) + 200);
        }
    }

    public static final CanningShop CANNING_SHOP = new CanningShop();

    public CannedFood makeFruitCan(Fruit fruit) {
        int sweet = fruit.getSweetness();
        int water = fruit.getWateriness();
        CannedFood.Builder canBuilder = new CannedFood.Builder().withFruit(fruit.getFruitType());
        if (sweet < 50) {
            canBuilder = canBuilder.withSugar((int) (Math.random() * 61) + 40);
        }
        if (water < 50) {
            canBuilder = canBuilder.withWater((int) (Math.random() * 61) + 40);
        }
        CannedFood cannedFruit = canBuilder.build();
        return cannedFruit;
    }

    public void messageFruits() {
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("I am " + fruits[i].getFruitType() + ". I weigh = " + fruits[i].getWeight() +
                    " gramm. I'm watery on " + fruits[i].getWateriness() + "%, and sweet on " + fruits[i].getSweetness() + "%.");
        }
    }

    public void createCan(FruitPlant fruitPlant, int fruitsNumber) {
        for (int i = 0; i < fruitsNumber; i++) {
            CannedFood newCan = fruitPlant.createCan(fruits[i]);
            if (newCan != null) {
                cannedFoods.add(newCan);
            }
        }
    }

    public void messageCan() {
        for (int i = 0; i < cannedFoods.size(); i++) {
            System.out.println("I canned " + cannedFoods.get(i).getFruitType() + ". Ingredients : water "
                    + cannedFoods.get(i).getWater() + "%, sugar " + cannedFoods.get(i).getSugar() + "%.");
        }
    }
}
