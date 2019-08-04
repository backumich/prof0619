package com.vertex.academy.teacherAndMarkers;

public class Board {

    private static String textOnBoard = "";

    // Написание текста на доске
    public static void writeOnBoard (String t) {
        textOnBoard += t;
    }


    public static void viewBoard () {
        System.out.println("\nFinal text on board: " + textOnBoard);
    }
}
