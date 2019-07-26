package homework.markerapp;

import homework.markerapp.exception.NoSuchToolException;
import homework.markerapp.entity.Marker;
import homework.markerapp.entity.Teacher;

/**
 *  To to see how the method .write() works, use the console.
 */
public class MarkerApp {
    public static void main(String[] args) {
        try {
            new Teacher().write(Marker.class);
        } catch (NoSuchToolException e) {
            e.printStackTrace();
        }
    }
}
