package Markers;

public class BlackMarker implements Markers {
    @Override
    public String color() {
        String s = "black";
        return s;
    }

    @Override
    public int maxWordQuantity() {
        return 10;
    }
}
