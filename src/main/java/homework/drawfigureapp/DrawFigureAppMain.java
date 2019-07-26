package homework.drawfigureapp;

import homework.drawfigureapp.artist.Artist;
import homework.drawfigureapp.artist.ArtistProxy;
import homework.drawfigureapp.exception.NoSuchFigureTypeException;

public class DrawFigureAppMain {
    public static void main(String[] args) {
        try {
            Artist artist = new ArtistProxy();
            artist.draw(new Canvas(100, 100), 25);
            artist.draw(new Canvas(70, 70), 100);
        } catch (NoSuchFigureTypeException ex){
            System.out.println(ex.getMessage());
        }
    }
}
