package com.vertex.academy.homework1307.pineapplePlant;

public class CanningShopProxy {
    private Fruit fruit;
    private CannedFood cannedFood;

    public CanningShopProxy(Fruit fruit) {
        this.fruit = fruit;
    }

    public CannedFood makeFruitCan() {
        fruit = makeFruitCanGreateAgain();
        if (fruit == null) {
            return null;
        }
        cannedFood = CanningShop.CANNING_SHOP.makeFruitCan(fruit);
        return cannedFood;
    }

    public Fruit makeFruitCanGreateAgain() {
        if (fruit.getWateriness() < 30) {
            System.out.println("Hey, that's bad fruit with wateriness " + fruit.getWateriness() + ". We can't do can with that bad guy:(\n");
            return null;
        }
        return this.fruit;
    }
}
