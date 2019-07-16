package com.vertex.academy.hw.hw0607.task2;


public class Oval {
    private Point centre;

    private int width;
    private int height;
    private Oval(){

    }

    public Oval(int axisX, int axisY, int width, int height) {
        this.centre = new Point(axisX, axisY);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Point getCentre() {
        return centre;
    }


    public static class Builder {

        private Oval oval;

        public Builder() {
            oval = new Oval();
        }

        public Builder withWidth (int width) {
            this.oval.width = width;
            return this;
        }

        public Builder withHeigth (int height) {
            this.oval.height = height;
            return this;
        }

        public Builder withCentre (int axisX, int axisY) {
            oval.centre = new Point(axisX, axisY);
            return this;
        }

        public Oval build() {
            return new Oval();
        }

    }



}
