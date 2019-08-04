package com.vertex.academy.teacherAndMarkers;

public class Color {
    private static final String ANSI_BLACK = "\u001B[37m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_PURPLE = "\u001B[35m";
    private static final String ANSI_YELLOW = "\u001B[33m";
    private static final String ANSI_BLUE = "\u001B[34m";

    // Возврат цвета в ANSI по названию
    public static String getColor (String colour) {
        switch (colour) {
            case "Black": return ANSI_BLACK;
            case "Blue": return ANSI_BLUE;
            case "Red": return ANSI_RED;
            case "Purple": return ANSI_PURPLE;
            case "Yellow": return ANSI_YELLOW;
            default: break;
        }
        return "error";
    }
}