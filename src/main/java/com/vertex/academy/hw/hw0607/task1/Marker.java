package com.vertex.academy.hw.hw0607.task1;

class Marker {
    final String ANSI_RESET = "\u001B[0m";
    private final int RESOURCE = 10;
    private String color;
    private int currentResource;

    private Marker(ANSI_Colors color) {
        this.color = color.getColor();
        this.currentResource = RESOURCE;
    }

    int getCurrentResource() {
        return currentResource;
    }

    void setCurrentResource() {
        currentResource--;
        if (currentResource == 0) {
            color = ANSI_RESET;
        }
    }

    String getColor() {
        return color;
    }

    static class Builder {
        private Marker newMarker;

        public Builder() {
            switch ((int) (Math.random() * 8)) {
                case 0:
                    newMarker = new Marker(ANSI_Colors.ANSI_BLACK);
                    break;
                case 1:
                    newMarker = new Marker(ANSI_Colors.ANSI_RED);
                    break;
                case 2:
                    newMarker = new Marker(ANSI_Colors.ANSI_GREEN);
                    break;
                case 3:
                    newMarker = new Marker(ANSI_Colors.ANSI_YELLOW);
                    break;
                case 4:
                    newMarker = new Marker(ANSI_Colors.ANSI_BLUE);
                    break;
                case 5:
                    newMarker = new Marker(ANSI_Colors.ANSI_PURPLE);
                    break;
                case 6:
                    newMarker = new Marker(ANSI_Colors.ANSI_CYAN);
                    break;
                case 7:
                    newMarker = new Marker(ANSI_Colors.ANSI_WHITE);
                    break;
                default:
                    newMarker = null;
            }
        }

        Marker build() {
            return newMarker;
        }
    }
}
