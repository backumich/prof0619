package com.vertex.academy.figure2d.figures;

import com.vertex.academy.figure2d.Point;
import lombok.ToString;

@ToString
public class Square implements Figure{
    protected int length;
    protected Point lowerLeftCorner;

    public Square (int length, Point point) {
        this.lowerLeftCorner = point;
        this.length = length;
    }

    public int getLength () {
        return length;
    }

    @Override
    public String toString() {
        return "I'm Square.\n\tMy parameters: Side: " + length + ". My lower left corner in: " + lowerLeftCorner.toString() + "\n";
    }

    @Override
    public String getName() {
        return "Square";
    }
}
