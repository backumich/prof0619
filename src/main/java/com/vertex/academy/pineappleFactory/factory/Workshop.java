package com.vertex.academy.pineappleFactory.factory;

import com.vertex.academy.pineappleFactory.CannedFruit;
import com.vertex.academy.pineappleFactory.fruit.Fruit;

public class Workshop {
    private CannedFruit cannedFruit;

    private Workshop () {

    }

    public static final Workshop WORKSHOP = new Workshop();

    public CannedFruit createCannedFruit (Fruit fruit) {
        int sweet = fruit.getSweetness();
        int water = fruit.getWateriness();
//        cannedFruit = new CannedFruit(FruitType.PEACH, 10, 23);
//        return cannedFruit;
        CannedFruit.CannedFruitBuilder cannedFruitBuilder = new CannedFruit.CannedFruitBuilder().withFruitType(fruit.getFruitName());
        if (sweet < 40) {
            cannedFruitBuilder = cannedFruitBuilder.withFruitSweet(((int)Math.random() * 40) + 20);
        }
        if (water < 40) {
            cannedFruitBuilder = cannedFruitBuilder.withFruitWater(((int)Math.random() * 40) + 20);
        }
        cannedFruit = cannedFruitBuilder.build();
        return cannedFruit;
    }
}
