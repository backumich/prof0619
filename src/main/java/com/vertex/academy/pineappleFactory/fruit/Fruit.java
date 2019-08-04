package com.vertex.academy.pineappleFactory.fruit;

public class Fruit {
    private final FruitType fruitName;
    private final int weight;
    private final int sweetness;
    private final int wateriness;

    public Fruit(FruitType fruitName, int weight, int sweetness, int wateriness) {
        this.fruitName = fruitName;
        this.weight = weight;
        this.sweetness = sweetness;
        this.wateriness = wateriness;
    }

    public int getWateriness() {
        return wateriness;
    }

    public int getSweetness() {
        return sweetness;
    }

    public FruitType getFruitName() {
        return fruitName;
    }

    public int getWeight() {
        return weight;
    }
}
