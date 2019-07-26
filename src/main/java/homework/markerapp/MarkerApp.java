package homework.markerapp;

import homework.markerapp.exception.NoSuchToolException;
import homework.markerapp.entity.Marker;
import homework.markerapp.entity.Teacher;

public class MarkerApp {
    public static void main(String[] args) {
        try {
            new Teacher().write(Marker.class);
        } catch (NoSuchToolException e) {
            e.printStackTrace();
        }
    }
}
