package com.vertex.academy.arrays.compare;

import com.vertex.academy.data.vegetables.Tomato;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;

public class CompareExperiments {

    public static void main(String[] args) {
        Tomato[] tomatos = new Tomato[]{
                null,
                new Tomato(250, 150, new Color(100, 10, 0)),
                new Tomato(200, 112, new Color(213, 216, 14)),
                new Tomato(300, 200, new Color(192, 42, 26)),
                new Tomato(280, 200, new Color(192, 96, 29))
        };

        System.out.println(Arrays.toString(tomatos));

//        Arrays.sort(tomatos);

//        System.out.println(Arrays.toString(tomatos));

//        Arrays.sort(tomatos, new TomatoRednessComparator().reversed());

//        System.out.println(Arrays.toString(tomatos));

        Comparator<Tomato> specialComparator = Comparator.nullsFirst(
                Comparator.comparingInt(Tomato::getSize)
                        .thenComparingInt(Tomato::getWeight))
                .reversed();

        Arrays.sort(tomatos, specialComparator);

        System.out.println(Arrays.toString(tomatos));

    }
}
