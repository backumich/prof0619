package com.vertex.academy.generics.wildcard;


import com.vertex.util.Apple;
import com.vertex.util.Fruit;
import com.vertex.util.Jonathan;
import com.vertex.util.Orange;

public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple(); // OK
        fruit[1] = new Jonathan(); // OK
        // Runtime type is Apple[], not Fruit[] or Orange[]:
        try {
            // Compiler allows you to add Fruit:
            fruit[0] = new Fruit(); // ArrayStoreException
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            // Compiler allows you to add Oranges:
            fruit[0] = new Orange(); // ArrayStoreException
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//our goal is to determine such cast not in runtime but at compile @see NonCovariantGenerics





