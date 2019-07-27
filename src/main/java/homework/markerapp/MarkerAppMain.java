package homework.markerapp;

import homework.markerapp.entity.ToolType;
import homework.markerapp.exception.NoSuchToolException;
import homework.markerapp.entity.Teacher;

/**
 *  To to see how the method .write() works, use the console.
 */
public class MarkerAppMain {
    public static void main(String[] args) {
        try {
            new Teacher().write(ToolType.MARKER);
        } catch (NoSuchToolException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
