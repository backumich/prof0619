package com.vertex.academy.figure2d.figures;

import com.vertex.academy.figure2d.Point;
import lombok.ToString;

@ToString
public class Rectangular extends Square implements Figure {
    private int width;
    public Rectangular (int length, int width, Point point) {
        super(length, point);
        this.width = width;
    }

    @Override
    public String toString() {
        return "I'm Rectangular.\n\tMy parameters: Fist side: " + length + ", second side: " + width + ". My lower left corner in: " + lowerLeftCorner.toString() + "\n";
    }

    @Override
    public String getName() {
        return "Rectangule";
    }

}
