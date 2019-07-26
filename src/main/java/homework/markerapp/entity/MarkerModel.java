package homework.markerapp.entity;

public enum MarkerModel {
    KOHINOOR_N50(50),
    FABER_CASTEL_E30(75);

    private int capacity;

    MarkerModel(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

}


