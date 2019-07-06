package com.vertex.academy.data.planes;

public class AnPlane extends Plane {

    public AnPlane(String boardNumber) {
//        super(PlaneType.CIVIL, PlaneModel.AN_2, boardNumber);
        super(PlaneModel.AN_2, boardNumber);
    }

    //    @Override
    void fly() {
        System.out.println("Trah-tah-tah byr-byr");
    }
}
