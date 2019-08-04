package com.vertex.academy.teacherAndMarkers;

import com.vertex.academy.teacherAndMarkers.markers.Marker;

import java.util.Scanner;

public class Teacher {

    private Marker markerInUse;

    //Конструктор автоматически запускает функционал учителя
    // (как только учитель стал учителем, он тут же начинает писать на доске)
    public Teacher () {
        takeMarker();
        write();
        System.out.println("Teacher: It's all. Good By");
    }

    //Написание текста вложнного в голову учителя
    // (делегирование полномочий непосредственно написания, маркеру)
    private void write () {
        if (markerInUse != null) {
            Scanner scan = new Scanner(System.in);
            System.out.println("God: What does the teacher think?");
            String text = scan.nextLine();
            while (true) {
                text = markerInUse.write(text);
                if (text.length() != 0) {
                    takeMarker();
                } else {
                    break;
                }
            }
        } else {
            System.out.println("Teacher: I can't write, markers are over");
        }
    }

    //Получаение маркера по запросу от ящика
    private void takeMarker () {
        System.out.println("Teacher: Drawer, how much markers you contain?");
        int numbOfMarkers = Drawer.DRAWER.getMarkersSize();
        if (numbOfMarkers == 0) {
            System.out.println("Teacher: Okay, Drawer, I'll fill you");
            Board.viewBoard();
            System.exit(0);
        } else {
            int randomColorOrDesired = (int) ( Math.random() * 2 );
            if (randomColorOrDesired == 0) {
                System.out.println("Teacher: Drawer give me any marker");
                markerInUse = Drawer.DRAWER.giveMarker();
            } else {
                markerInUse = Drawer.DRAWER.giveMarker(randomiseColor());
                if (markerInUse == null) {
                    System.out.println("Teacher: Drawer, give me any marker");
                    markerInUse = Drawer.DRAWER.giveMarker();
                }
            }
        }
    }

    //Рандомизация цвета маркера, котрый хочет получить учитель
    private String randomiseColor () {
        int colorIdent = (int) ( Math.random() * 5 );
        switch (colorIdent) {
            case 0:
                System.out.println("Teacher: Drawer, give me a Black marker"); return "Black";
            case 1:
                System.out.println("Teacher: Drawer, give me a Blue marker"); return "Blue";
            case 2:
                System.out.println("Teacher: Drawer, give me a Red marker");return "Red";
            case 3:
                System.out.println("Teacher: Drawer, give me a Purple marker"); return "Purple";
            case 4:
                System.out.println("Teacher: Drawer, give me a Yellow marker"); return "Yellow";
        }
        return null;
    }
}
