package com.vertex.academy.figure2d.figures;

import com.vertex.academy.figure2d.Point;

public class Oval extends Circle implements Figure {
    private int secondRadius;
    public Oval(int radius, int secondRadius, Point point) {
        super(radius, point);
        this.secondRadius = secondRadius;
    }

    @Override
    public String toString() {
        return "I'm Oval.\n\tMy parameters: First radius: " + radius + ", second radius: " + secondRadius + ". My center in: " + center.toString() + "\n";
    }

    @Override
    public String getName () {
        return "Oval";
    }
}
