package com.vertex.academy.patterns.immutable;

import lombok.ToString;

@ToString
public final class Apple {

    private final int weight;
    private final int watter;

    public Apple(int weight, int watter) {
        this.weight = weight;
        this.watter = watter;
    }

    public int getWeight() {
        return weight;
    }

    public int getWatter() {
        return watter;
    }

    public Apple withWeight(int newWeight) {
        return new Apple(newWeight, this.watter);
    }

    public Apple withWatter(int newWatter) {
        return new Apple(this.weight, newWatter);
    }

    public static void main(String[] args) {
        Apple first = new Apple(150, 80);
        Apple bite = first.withWeight(70);

        System.out.println(bite);
    }
}
