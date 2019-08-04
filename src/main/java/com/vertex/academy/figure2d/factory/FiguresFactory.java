package com.vertex.academy.figure2d.factory;

import com.vertex.academy.figure2d.Point;
import com.vertex.academy.figure2d.figures.*;

public class FiguresFactory {
    private FiguresFactory(){

    }

    public static final FiguresFactory FACTORY = new FiguresFactory();

    public Figure create (FigureType type, int param, Point point) {
        switch (type) {
            case CIRCLE:return new Circle (param, point);
            case SQUARE: return new Square (param, point);
        }
        return null;
    }

    public Figure create (FigureType type, int firstParam, int secondParam, Point point) {
        switch (type) {
            case OVAL:
                return new Oval (firstParam, secondParam, point);
            case RECTANGULAR: return new Rectangular(firstParam, secondParam, point);
        }
        return null;
    }
}
