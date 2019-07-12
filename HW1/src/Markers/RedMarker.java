package Markers;

public class RedMarker implements Markers {
    @Override
    public String color() {
        String s = "red";
        return s;
    }

    @Override
    public int maxWordQuantity() {
        return 4;
    }
}
