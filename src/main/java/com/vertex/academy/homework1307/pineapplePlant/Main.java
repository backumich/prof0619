package com.vertex.academy.homework1307.pineapplePlant;

public class Main {
    public static void main(String[] args) {
        FruitPlant fruitPlant = new FruitPlant();
        System.out.println("List of fruits: ");
        CanningShop.CANNING_SHOP.messageFruits();
        CanningShop.CANNING_SHOP.createCan(fruitPlant, 10);
        System.out.println("List of can :");
        CanningShop.CANNING_SHOP.messageCan();
    }
}
