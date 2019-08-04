package com.vertex.academy.figure2d.figures;

import com.vertex.academy.figure2d.Point;

public class Circle implements Figure {

    protected int radius;
    protected Point center;

    public Circle (int radius, Point point) {
        this.radius = radius;
        this.center = point;
    }

    @Override
    public String toString() {
        return "I'm Circle.\n\tMy parameters: radius: " + radius + ". My center in: " + center.toString() + "\n";
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
