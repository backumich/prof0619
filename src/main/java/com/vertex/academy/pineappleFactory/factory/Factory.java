package com.vertex.academy.pineappleFactory.factory;

import com.vertex.academy.pineappleFactory.CannedFruit;
import com.vertex.academy.pineappleFactory.fruit.Fruit;

public class Factory {
    private CannedFruit cannedFruit;
    private Fruit fruit;

    public Factory () {
    }

    public CannedFruit produce (Fruit fruit) {
        this.fruit = fruit;
        WorkshopProxy workshopProxy = new WorkshopProxy(fruit);
        cannedFruit = workshopProxy.createCannedFruit();
        if (cannedFruit != null) {
            produceFructose();
        }
        return cannedFruit;
    }

    private void produceFructose () {
        System.out.println("Произведено " + fruit.getSweetness() * 0.8 + " грамм фруктозы");
    }
}
