package com.vertex.academy.arrays;

import java.util.Arrays;

public class ArraysExperiments {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

        A[] arrayOfA = new A[8];
        B[] arrayOfB = new B[9];

        arrayOfB[3] = new B();
        System.out.println(arrayOfB[3]);

//        has different clases
//        System.out.println(a.getClass());
//        System.out.println(arrayOfA.getClass());
//
        //transitive extension
//        System.out.println(arrayOfB instanceof A[]);
//        System.out.println(arrayOfA);
//        System.out.println(a instanceof A[]);
//        System.out.println(arrayOfA instanceof A);

        System.out.println(arrayOfA.length);
        arrayOfA = Arrays.copyOfRange(arrayOfB, 0, 20);
        System.out.println(arrayOfA.length);

        System.out.println(Arrays.toString(arrayOfA));


    }
}


class A {
}

class B extends A {
}
