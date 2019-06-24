package com.vertex.academy.interfaces;

public class ConflictClass implements FirstRealisation, SecondRealisation {
    @Override
    public int conflictMethod() {
        return FirstRealisation.super.conflictMethod();
    }

    public static void main(String[] args) {
        ConflictClass conflictClass = new ConflictClass();

        System.out.println(conflictClass.conflictMethod());
    }
}
