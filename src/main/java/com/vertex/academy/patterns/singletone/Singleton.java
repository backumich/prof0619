package com.vertex.academy.patterns.singletone;

public class Singleton {

    private Singleton(){
        System.out.println("Initiating singleton");
    }

    public static final Singleton INSTANCE = new Singleton();
}

