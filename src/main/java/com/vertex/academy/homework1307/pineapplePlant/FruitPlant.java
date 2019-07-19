package com.vertex.academy.homework1307.pineapplePlant;

public class FruitPlant {
    private Fruit fruit;
    private CannedFood cannedFood;

    public CannedFood createCan(Fruit fruit) {
        this.fruit = fruit;
        CanningShopProxy canningShopProxy = new CanningShopProxy(fruit);
        cannedFood = canningShopProxy.makeFruitCan();
        if (cannedFood != null) {
            produceFructose();
        }
        return cannedFood;
    }

    private void produceFructose() {
        System.out.println("Good job! Produced " + (double) (Math.round((fruit.getSweetness() * 0.8) * 10) / 10) + " gramm of fructose.\n");
    }
}
