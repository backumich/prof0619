package com.vertex.academy.generics;


public class CarGenerator implements Generator<Car> {
    @Override
    public Car next() {
        return new Car();
    } //!!!!!
}
