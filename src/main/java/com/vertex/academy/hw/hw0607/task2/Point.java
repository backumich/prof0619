package com.vertex.academy.hw.hw0607.task2;

public final class Point {
    private final int axisX;
    private final int axisY;

    public Point(int axisX, int axisY) {
        this.axisX = axisX;
        this.axisY = axisY;
    }

    public int getAsixX() {
        return axisX;
    }

    public int getAxisY() {
        return axisY;
    }

    public Point withAxisX (int axisX) {
        return new Point(axisX, this.axisY);
    }

    public Point withAxisY (int axisY) {
        return new Point(this.axisX, axisY);
    }
}
