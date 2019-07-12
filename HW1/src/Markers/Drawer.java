package Markers;

public class Drawer {
    private Markers marker = null;

    public Markers getNewMarker() {
        switch (MarkerTypes.randomColor()) {
            case RED:
                marker = new RedMarker();
                System.out.println("You took red marker!");
                break;
            case BLUE:
                marker = new BlueMarker();
                System.out.println("You took blue marker!");
                break;
            case BLACK:
                marker = new BlackMarker();
                System.out.println("You took black marker!");
                break;
        }
        return marker;
    }

    public Markers getMarker() {
        return marker;
    }
}

