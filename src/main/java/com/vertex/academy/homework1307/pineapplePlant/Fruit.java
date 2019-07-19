package com.vertex.academy.homework1307.pineapplePlant;

public final class Fruit {
    private final FruitType fruitType;
    private final int sweetness;
    private final int wateriness;
    private final int weight;

    public Fruit(FruitType fruitType, int sweetness, int wateriness, int weight) {
        this.fruitType = fruitType;
        this.sweetness = sweetness;
        this.wateriness = wateriness;
        this.weight = weight;
    }

    public FruitType getFruitType() {
        return fruitType;
    }

    public int getSweetness() {
        return sweetness;
    }

    public int getWateriness() {
        return wateriness;
    }

    public int getWeight() {
        return weight;
    }

}