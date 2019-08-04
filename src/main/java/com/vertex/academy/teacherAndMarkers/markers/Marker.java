package com.vertex.academy.teacherAndMarkers.markers;

import com.vertex.academy.teacherAndMarkers.Board;

import java.awt.*;

public abstract class Marker {
    public static final String ANSI_RESET = "\u001B[0m";

    protected String colour;
    protected int inkOnSymbols;

    public String getColour() { return colour; }

    // Описание процесса написания текста на доске
    public String write (String text) {
        System.out.println();
        System.out.print("Marker: I write text: ");
        while (text.length() != 0 && inkOnSymbols != 0) {
            System.out.print(Color.getColor(colour) + "" + text.charAt(0) + ANSI_RESET);
            Board.writeOnBoard(Color.getColor(colour) + "" + text.charAt(0) + ANSI_RESET);
            if (text.charAt(0) != ' ') {
                inkOnSymbols--;
            }
            text = text.substring(1);
        }
        System.out.println("\n");
        return text;
    }
}
