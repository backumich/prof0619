package com.vertex.academy.pineappleFactory;

import com.vertex.academy.pineappleFactory.fruit.FruitType;

public class CannedFruit {
    private FruitType fruitType;
    private int water = 0;
    private int sweet = 0;

    public CannedFruit (FruitType fruitType, int water, int sweet) {
        this.fruitType = fruitType;
        this.water = water;
        this.sweet = sweet;
    }

    public CannedFruit () {

    }

    public FruitType getFruitType() {
        return fruitType;
    }

    public int getSweet() {
        return sweet;
    }

    public int getWater() {
        return water;
    }

    public static class CannedFruitBuilder {
        private CannedFruit cannedFruit;

        public CannedFruitBuilder () {
            this.cannedFruit = new CannedFruit();
        }

        public CannedFruit.CannedFruitBuilder withFruitType (FruitType fruitType) {
            this.cannedFruit.fruitType = fruitType;
            return this;
        }

        public CannedFruit.CannedFruitBuilder withFruitWater (int water) {
            this.cannedFruit.water = water;
            return this;
        }

        public CannedFruit.CannedFruitBuilder withFruitSweet (int sweet) {
            this.cannedFruit.sweet = sweet;
            return this;
        }

        public CannedFruit build() {
            return new CannedFruit(cannedFruit.fruitType, cannedFruit.water, cannedFruit.sweet);
        }
    }
}

