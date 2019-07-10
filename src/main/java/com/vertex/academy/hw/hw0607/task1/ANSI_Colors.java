package com.vertex.academy.hw.hw0607.task1;

enum ANSI_Colors {
    ANSI_BLACK ("\u001B[30m"),
    ANSI_RED ("\u001B[31m"),
    ANSI_GREEN ("\u001B[32m"),
    ANSI_YELLOW ("\u001B[33m"),
    ANSI_BLUE ("\u001B[34m"),
    ANSI_PURPLE ("\u001B[35m"),
    ANSI_CYAN ("\u001B[36m"),
    ANSI_WHITE ("\u001B[37m");

    private String title;

    ANSI_Colors(String title) {
        this.title = title;
    }

    String getColor() {
        return title;
    }

}
