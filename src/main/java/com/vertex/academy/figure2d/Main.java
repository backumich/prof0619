package com.vertex.academy.figure2d;

import com.vertex.academy.figure2d.artist.MalevichProxy;
import com.vertex.academy.figure2d.factory.FiguresFactory;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(8,2);
        MalevichProxy malevich = new MalevichProxy(FiguresFactory.FACTORY.FACTORY, point);
        malevich.paint(10);
    }
}
