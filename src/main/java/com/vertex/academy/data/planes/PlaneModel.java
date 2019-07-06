package com.vertex.academy.data.planes;

import static com.vertex.academy.data.planes.PlaneType.CIVIL;

public enum PlaneModel {
    AN_2(CIVIL, 12, 100),
    BI_2(CIVIL, 2, 100),
    TU_154(CIVIL, 200, 6000),
    BOEING_777(CIVIL, 500, 10000);

    private PlaneType type;
    private int capacity;
    private int flyLength;

    PlaneModel(PlaneType type, int capacity, int flyLength) {
        this.type = type;
        this.capacity = capacity;
        this.flyLength = flyLength;
    }

    public PlaneType getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getFlyLength() {
        return flyLength;
    }
}
