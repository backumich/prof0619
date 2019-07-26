package homework.drawfigureapp.artist;

import homework.drawfigureapp.Canvas;
import homework.drawfigureapp.figure.*;
import homework.drawfigureapp.factory.FigureFactory;

import java.util.Random;

public class ArtistImpl implements Artist {
    private FigureFactory figureFactory = FigureFactory.getInstance();
    private final Figure[] figuresToDraw;
    private int indexFrom;

    public ArtistImpl(Figure[] figuresToDraw) {
        this.figuresToDraw = figuresToDraw;
    }

    public void draw(Canvas canvas, int numFiguresToDraw) {
        for (int i = 0; i < numFiguresToDraw; i++) {
            System.out.println(i + 1 + " Canvas:" + canvas.getWidth() + "x" + canvas.getHeight());
            if (indexFrom == 100) {
                refillFiguresToDraw();
                indexFrom = 0;
            }
            Figure figure = figuresToDraw[indexFrom];
            System.out.println("Income data: " + figure.toString());
            adjustFigureSize(figure, canvas);
            adjustFigurePosition(figure, canvas);
            System.out.println("...was drawn: " + figure.toString() + "\n"); // finally draw figure
            figuresToDraw[indexFrom] = null;
            indexFrom++;
        }
    }

    private void adjustFigureSize(Figure figure, Canvas canvas) {
        if (figure.getHeight() > canvas.getHeight() || figure.getWidth() > canvas.getWidth()) {
            figure.setHeight(figure.getHeight() / 1.5);
            figure.setWidth(figure.getWidth() / 1.5);
            adjustFigureSize(figure, canvas);
            System.out.println("Figure size changed");
        }
    }

    private void adjustFigurePosition(Figure figure, Canvas canvas) {
        double halfHeightOfCanvas = (double) canvas.getHeight() / 2;
        double halfWidthOfCanvas = (double) canvas.getWidth() / 2;
        if (figure instanceof Rectangle) {
            adjustLeftCornerPosition(figure, halfHeightOfCanvas, halfWidthOfCanvas);
        }
        if (figure instanceof Oval) {
            adjustCenterPosition(figure, halfHeightOfCanvas, halfWidthOfCanvas);
        }
    }

    private void adjustLeftCornerPosition(Figure figure, double halfHeightOfCanvas, double halfWidthOfCanvas) {
        double topBorder = figure.getPoint().getY() + figure.getHeight();
        adjustTopBorder(topBorder, figure, halfHeightOfCanvas);

        double rightBorder = figure.getPoint().getX() + figure.getWidth();
        adjustRightBorder(rightBorder, figure, halfWidthOfCanvas);

        if(figure.getPoint().getY() < halfHeightOfCanvas * (-1)){
            double y = halfHeightOfCanvas * (-1);
            movePoint(figure, figure.getPoint().getX(), y, 'Y');
        }
        if(figure.getPoint().getX() < halfWidthOfCanvas * (-1)){
            double x = halfWidthOfCanvas * (-1);
            movePoint(figure, x, figure.getPoint().getY(), 'X');
        }
    }

    private void adjustCenterPosition(Figure figure, double halfHeightOfCanvas, double halfWidthOfCanvas) {
        double halfFigHeight = figure.getHeight() / 2;
        double halfFigWidth = figure.getWidth() / 2;

        double topBorder = figure.getPoint().getY() + halfFigHeight;
        adjustTopBorder(topBorder, figure, halfHeightOfCanvas);

        double rightBorder = figure.getPoint().getX() + halfFigWidth;
        adjustRightBorder(rightBorder, figure, halfWidthOfCanvas);

        double bottomBorder = figure.getPoint().getY() - halfFigHeight;
        adjustBottomBorder(bottomBorder, figure, halfHeightOfCanvas);

        double leftBorder = figure.getPoint().getX() - halfFigWidth;
        adjustLeftBorder(leftBorder, figure, halfWidthOfCanvas);
    }

    private void adjustTopBorder(double topBorder, Figure figure, double halfHeightOfCanvas) {
        if (topBorder > halfHeightOfCanvas) {
            double y = figure.getPoint().getY() - (topBorder - halfHeightOfCanvas);
            movePoint(figure, figure.getPoint().getX(), y, 'Y');
        }
    }

    private void adjustRightBorder(double rightBorder, Figure figure, double halfWidthOfCanvas) {
        if (rightBorder > halfWidthOfCanvas) {
            double x = figure.getPoint().getX() - (rightBorder - halfWidthOfCanvas);
            movePoint(figure, x, figure.getPoint().getY(), 'X');
        }
    }

    private void adjustBottomBorder(double bottomBorder, Figure figure, double halfHeightOfCanvas) {
        if(bottomBorder < halfHeightOfCanvas * (-1)){
            double y = figure.getPoint().getY() - (bottomBorder - (halfHeightOfCanvas * (-1)));
            movePoint(figure, figure.getPoint().getX(), y, 'Y');
        }
    }

    private void adjustLeftBorder(double leftBorder, Figure figure, double halfWidthOfCanvas) {
        if (leftBorder < halfWidthOfCanvas* (-1)) {
            double x = figure.getPoint().getX() - (leftBorder - (halfWidthOfCanvas* (-1)));
            movePoint(figure, x, figure.getPoint().getY(), 'X');
        }
    }

    private void movePoint(Figure figure, double x, double y, char direction){
        Point point = new Point(x, y);
        figure.setPoint(point);
        System.out.println("Point moved by " + direction);
    }

    private void refillFiguresToDraw() {
        FigureType[] types = FigureType.values();
        int typesLength = types.length;

        for (int i = 0; i < 100; i++) {
            FigureType type = types[new Random().nextInt(typesLength)];
            figuresToDraw[i] = figureFactory.getPreConfiguredFigure(type);
        }
    }
}
