package com.vertex.academy.figure2d.artist;

import com.vertex.academy.figure2d.Point;
import com.vertex.academy.figure2d.factory.FiguresFactory;
import com.vertex.academy.figure2d.figures.Figure;

public class MalevichProxy {

    private Malevich malevich;
    private FiguresFactory figuresFactory;
    private Point point;

    public MalevichProxy (FiguresFactory figuresFactory, Point point) {
        this.point = point;
        this.figuresFactory = figuresFactory;
    }

    public void paint (int numbOfFigures) {
        initMalevich(figuresFactory);
        for (int i = 0; i < numbOfFigures; i++) {
            Figure figure = malevich.getFigure();
            System.out.println(figure.toString());
        }
    }

    public void initMalevich (FiguresFactory figuresFactory) {
        malevich = new Malevich(figuresFactory, point);
    }
}
