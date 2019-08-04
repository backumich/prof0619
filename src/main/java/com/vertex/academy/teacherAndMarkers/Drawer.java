package com.vertex.academy.teacherAndMarkers;

import com.vertex.academy.teacherAndMarkers.markers.*;

import java.util.ArrayList;

public class Drawer {
    private ArrayList<Marker> markers = new ArrayList<>();

    //В конструкторе ящик автоматически заполняется случайным количеством маркеров со случайными цветами
    private Drawer(){
        int numbOfMarkers = (int) ( Math.random() * 10 ) + 1;
        for (int i = 0; i < numbOfMarkers; i++) {
            int colorIdent = (int) ( Math.random() * 5 );
            markers.add(putMarker(colorIdent));
        }
    }
    public static final Drawer DRAWER = new Drawer();


    //Кладем маркер в ящик в соответствии с идентификатором его цвета
    private Marker putMarker (int colorIdent) {
        switch (colorIdent) {
            case 0: return new BlackMarker();
            case 1: return new BlackMarker();
            case 2: return new RedMarker();
            case 3: return new PurpleMarker();
            case 4: return new YellowMarker();
        }
        return null;
    }

    //Возврат маркера с конкретным цветом по требованию
    public Marker giveMarker (String color) {
        for (int i = 0; i < markers.size(); i++) {
            Marker newMarker = markers.get(i);
            if (newMarker.getColour().equals(color)) {
                markers.remove(i);
                System.out.println("Drawer: Okay, hold " + newMarker.getColour() + " marker");
                return newMarker;
            }
        }
        System.out.println("Drawer: I don`t have this marker");
        return null;
    }

    //Возврат любого маркера по требованию (возвращается последний лежащий в ящике маркер)
    public Marker giveMarker () {
        System.out.println("Drawer: Okay, hold " + markers.get(markers.size() - 1).getColour() + " marker");
        Marker buff = markers.get(markers.size() - 1);
        markers.remove(markers.size() - 1);
        return buff;
    }

    //Ящик уведомляет пользователя о количестве маркеров в себе
    public int getMarkersSize () {
        System.out.println("Drawer: I have a " + markers.size() + " markers");
        return markers.size();
    }
}
