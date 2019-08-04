package com.vertex.academy.pineappleFactory.factory;

import com.vertex.academy.pineappleFactory.CannedFruit;
import com.vertex.academy.pineappleFactory.fruit.Fruit;

public class WorkshopProxy {
    Fruit fruit;
    CannedFruit cannedFruit;

    public WorkshopProxy (Fruit fruit) {
        this.fruit = fruit;
    }

    public CannedFruit createCannedFruit () {
        fruit = checkFruit();
        if (fruit == null) {
            return null;
        }
        cannedFruit = Workshop.WORKSHOP.createCannedFruit(fruit);
        return cannedFruit;
    }

    public Fruit checkFruit () {
        if (fruit.getWateriness() < 30) {
            System.out.println("Фрукт типа: " + fruit.getFruitName() + " сгнил (водянистость " + fruit.getWateriness() + "%). Создание консервы невозможно");
            return null;
        }
        return this.fruit;
    }
}
