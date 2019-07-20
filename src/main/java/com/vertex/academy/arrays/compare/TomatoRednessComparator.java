package com.vertex.academy.arrays.compare;

import com.vertex.academy.data.vegetables.Tomato;

import java.util.Comparator;

public class TomatoRednessComparator implements Comparator<Tomato> {
    @Override
    public int compare(Tomato left, Tomato right) {
        if (left == right)
            return 0;

        if (left == null)
            return -1;

        if (right == null)
            return 1;

        int leftRed = left.getColor().getRed();
        int rightRed = right.getColor().getRed();

        return Integer.compare(leftRed, rightRed);
    }
}
