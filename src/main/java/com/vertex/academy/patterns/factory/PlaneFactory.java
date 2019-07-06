package com.vertex.academy.patterns.factory;

import com.vertex.academy.data.planes.Plane;
import com.vertex.academy.data.planes.PlaneModel;

public class PlaneFactory {


    public static Plane buildPlane(PlaneModel model, String boardNumber) {

        return new Plane(model, boardNumber);

//        switch (model){
//            case BOEING_777:
//                BoeingPlane boeingPlane = new BoeingPlane(boardNumber);
//                boeingPlane.setFlyLength(model.getFlyLength());
//                boeingPlane.setCapacity(model.getCapacity());
//                return boeingPlane;
//            case AN_2:
//                AnPlane anPlane = new AnPlane(boardNumber);
//                anPlane.setFlyLength(model.getFlyLength());
//                anPlane.setCapacity(model.getCapacity());
//                return anPlane;
//            default:
//                throw new UnsupportedOperationException("We can't build such type of planes: " + model);
//        }

    }

    public static void main(String[] args) {
        System.out.println(PlaneFactory.buildPlane(PlaneModel.AN_2, "AN-111"));
        System.out.println(PlaneFactory.buildPlane(PlaneModel.BOEING_777, "BE-777"));
        System.out.println(PlaneFactory.buildPlane(PlaneModel.BI_2, "BB-3241"));
    }

}
