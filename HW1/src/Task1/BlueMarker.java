package Task1;

public class BlueMarker implements Markers {
    @Override
    public String color() {
        String s = "blue";
        return s;
    }

    @Override
    public int maxWordQuantity() {
        return 8;
    }
}