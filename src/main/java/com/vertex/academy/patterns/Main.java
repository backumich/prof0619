package com.vertex.academy.patterns;

import com.vertex.academy.patterns.singletone.Singleton;

public class Main {

    public static void main(String[] args) {

        Singleton instance = Singleton.INSTANCE;

        System.out.println(Singleton.INSTANCE);
        System.out.println(instance == Singleton.INSTANCE);
        System.out.println(instance);
//        System.out.println(Singleton.INSTANCE);
//        System.out.println(Singleton.INSTANCE);
    }
}
