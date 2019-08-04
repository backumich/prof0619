package com.vertex.academy.figure2d.artist;

import com.vertex.academy.figure2d.Point;
import com.vertex.academy.figure2d.factory.FigureType;
import com.vertex.academy.figure2d.factory.FiguresFactory;
import com.vertex.academy.figure2d.figures.Figure;

public class Malevich {

    private int figureCounter = -1;

    private Figure[] figures;
    public Malevich (FiguresFactory figuresFactory, Point point) {
        FigureType type;
        figures = new Figure[100];
        for (int i = 0; i < figures.length ; i++) {
            int randType = (int) ( Math.random() * 4 );
            switch (randType) {
                case 0: figures [i] = figuresFactory.create(FigureType.CIRCLE, ((int) ( Math.random() * 10)) + 1, point); break;
                case 1: figures[i] = figuresFactory.create(FigureType.SQUARE, ((int) ( Math.random() * 10 )) + 1, point); break;
                case 2: figures[i] = figuresFactory.create(FigureType.OVAL, ((int) ( Math.random() * 11 )) + 1, ((int) ( Math.random() * 6 )) + 1, point); break;
                case 3: figures[i] = figuresFactory.create(FigureType.RECTANGULAR, ((int) ( Math.random() * 11 )) + 1, ((int) ( Math.random() * 6 )) + 1, point); break;
            }
        }
    }

    public Figure getFigure () {
        figureCounter++;
        return figures[figureCounter];
    }
}