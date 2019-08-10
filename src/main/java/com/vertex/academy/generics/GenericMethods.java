package com.vertex.academy.generics;

import com.vertex.util.Orange;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {
    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);

        gm.f(gm.<Orange>generate());
    }

    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public <U> List<U> generate() {
        return new ArrayList<>();
    }
}
