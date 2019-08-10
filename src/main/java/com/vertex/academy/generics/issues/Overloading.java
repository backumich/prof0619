package com.vertex.academy.generics.issues;

/**
 * Created by sweet_home on 04.03.17.
 */
public class Overloading<T extends A, U extends B> {

    public void myMethod(T t) {
        System.out.println(t);
    }

    public void myMethod(U u) {
        System.out.println(u);
    }


    public static void main(String[] args) {
        Overloading<A, B> overloading = new Overloading<>();
//        overloading.myMethod(new AB());
    }

}

class A {
}

interface B {
}

class AB extends A implements B {
}
