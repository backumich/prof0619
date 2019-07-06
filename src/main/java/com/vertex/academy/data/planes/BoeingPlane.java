package com.vertex.academy.data.planes;

public class BoeingPlane extends Plane {

    public BoeingPlane(String boardNumber) {
//        super(PlaneType.CIVIL, PlaneModel.BOEING_777, boardNumber);
        super(PlaneModel.BOEING_777, boardNumber);
    }

    //    @Override
    void fly() {
        System.out.println("vsssssssss");
    }
}
