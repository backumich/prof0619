package com.vertex.academy.hw.hw0607.task1;


class Teacher {
    private Marker marker;

    Teacher() {
        marker = new Marker.Builder().build();
    }

    void write (String text) {
        char[] arrSymbol = text.toCharArray();
        for (char symbol : arrSymbol) {
            if (symbol == ' ') {
                System.out.print(symbol);
            } else if (marker.getCurrentResource() > 0) {
                System.out.print(marker.getColor()+symbol);
                marker.setCurrentResource();
            } else if (marker.getCurrentResource() == 0) {
                marker = new Marker.Builder().build();
                System.out.print(marker.getColor()+symbol);
                marker.setCurrentResource();
            }
        }
        System.out.print(marker.ANSI_RESET);
    }
}
