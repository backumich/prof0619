package com.vertex.academy.homework1307.pineapplePlant;

public class CannedFood {
    private FruitType fruitType;
    private int water;
    private int sugar;

    public CannedFood(FruitType fruitType, int water, int sugar) {
        this.fruitType = fruitType;
        this.water = water;
        this.sugar = sugar;
    }

    public FruitType getFruitType() {
        return fruitType;
    }

    public int getWater() {
        return water;
    }

    public int getSugar() {
        return sugar;
    }

    public CannedFood() {

    }

    public static class Builder {
        private CannedFood cannedFood;

        public Builder() {
            this.cannedFood = new CannedFood();
        }

        public Builder withFruit(FruitType fruitType) {
            this.cannedFood.fruitType = fruitType;
            return this;
        }

        public Builder withWater(int water) {
            this.cannedFood.water = water;
            return this;
        }

        public Builder withSugar(int sugar) {
            this.cannedFood.sugar = sugar;
            return this;
        }

        public CannedFood build() {
            return new CannedFood(cannedFood.fruitType, cannedFood.water, cannedFood.sugar);
        }
    }
}
