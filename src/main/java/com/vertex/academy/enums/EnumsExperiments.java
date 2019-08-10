package com.vertex.academy.enums;

import java.util.EnumSet;

import static com.vertex.academy.enums.WeekDays.*;

public class EnumsExperiments {

    public static void main(String[] args) {
        EnumSet<WeekDays> allDays = EnumSet.of(MONDAY);

        allDays.remove(MONDAY);

        System.out.println(allDays);

        System.out.println(EnumSet.range(TUESDAY, FRIDAY));
    }
}

enum WeekDays {
    MONDAY, TUESDAY, THURSDAY, WEDNESDAY, FRIDAY, SATURDAY, SUNDAY
}
