package com.vertex.academy.data.vegetables;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.awt.*;

@Data
@AllArgsConstructor
public class Tomato implements Comparable<Tomato> {

    private int weight;
    private int size;
    private Color color;


    @Override
    public int compareTo(Tomato another) {
        return Integer.compare(weight, another.weight);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tomato tomato = (Tomato) o;

        if (weight != tomato.weight) return false;
        if (size != tomato.size) return false;
        return color != null ? color.equals(tomato.color) : tomato.color == null;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + weight;
        result = 31 * result + size;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
