package homework.drawfigureapp.factory;

import homework.drawfigureapp.exception.NoSuchFigureTypeException;
import homework.drawfigureapp.figure.*;

import java.util.Random;

public class FigureFactory {
    private static FigureFactory instance;

    private FigureFactory() {
    }

    public static FigureFactory getInstance() {
        if (instance == null) {
            synchronized (FigureFactory.class) {
                if (instance == null) {
                    instance = new FigureFactory();
                }
            }
        }
        return instance;
    }

    public Figure getPreConfiguredFigure(FigureType type) {
        int min = 1;
        int max = 100;
        switch (type) {
            case CIRCLE:
                return new Circle.CircleBuilder().
                        withCenter(createPoint()).
                        withRadius(generateNumber(min, max) / 2).
                        build();
            case OVAL:
                return new Oval.OvalBuilder().
                        withCenter(createPoint()).
                        withHeight(generateNumber(min, max)).
                        withWidth(generateNumber(min, max)).
                        build();
            case RECTANGLE:
                return new Rectangle.RectangleBuilder().
                        withLeftCorner(createPoint()).
                        withHeight(generateNumber(min, max)).
                        withWidth(generateNumber(min, max)).
                        build();
            case SQUARE:
                return new Square.SquareBuilder().
                        withLeftCorner(createPoint()).
                        withWidth(generateNumber(min, max)).
                        build();
            default:
                throw new NoSuchFigureTypeException(type.toString());
        }
    }

    private Point createPoint() {
        double x = generateNumber(-50, 50);
        double y = generateNumber(-50, 50);
        return new Point(x, y);
    }

    private double generateNumber(int min, int max) {
        Random rand = new Random();
        return (double) (min + rand.nextInt((max - min) + 1));
    }
}
