package com.vertex.academy.figure2d;

import lombok.ToString;

@ToString
public class Point {
    private final int x;
    private final int y;

    public Point(int xParam, int yParam) {
        this.x = xParam;
        this.y = yParam;
    }

    public int getXParam() {
        return x;
    }

    public int getYPram() {
        return y;
    }

    public Point withXParam(int xParam) {
        return new Point(x, this.y);
    }

    public Point withYParam(int yParam) {
        return new Point(this.x, y);
    }

}
