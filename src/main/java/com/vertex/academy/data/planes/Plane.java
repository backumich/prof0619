package com.vertex.academy.data.planes;

import lombok.ToString;

@ToString
//public abstract class Plane {
public class Plane {


    private final PlaneType type;
    private final PlaneModel model;
    private int capacity;
    private int flyLength;
    private final String boardNumber;

    public Plane(PlaneModel model, String boardNumber) {
        this.model = model;
        this.type = model.getType();
        this.boardNumber = boardNumber;
    }

//    abstract void fly();

    public PlaneType getType() {
        return type;
    }

    public PlaneModel getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFlyLength() {
        return flyLength;
    }

    public void setFlyLength(int flyLength) {
        this.flyLength = flyLength;
    }

    public String getBoardNumber() {
        return boardNumber;
    }
}
