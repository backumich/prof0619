package homework.drawfigureapp.artist;

import homework.drawfigureapp.Canvas;
import homework.drawfigureapp.figure.Figure;
import homework.drawfigureapp.figure.FigureType;
import homework.drawfigureapp.factory.FigureFactory;

import java.util.Random;

public class ArtistProxy implements Artist {
    private ArtistImpl target;

    public ArtistProxy() {
        FigureFactory figureFactory = FigureFactory.getInstance();
        FigureType[] types = FigureType.values();
        Figure[] figuresToDraw = new Figure[100];
        for (int i = 0; i < 100; i++) {
            figuresToDraw[i] = figureFactory.getPreConfiguredFigure(types[new Random().nextInt(types.length)]);
        }
        target = new ArtistImpl(figuresToDraw);
    }

    public void draw(Canvas canvas, int numFiguresToDraw) {
        target.draw(canvas, numFiguresToDraw);
    }
}
