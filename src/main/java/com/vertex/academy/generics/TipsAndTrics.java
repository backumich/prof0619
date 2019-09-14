package com.vertex.academy.generics;

import com.vertex.academy.data.fruits.Apple;
import com.vertex.academy.data.fruits.Fruit;
import com.vertex.academy.data.fruits.Orange;

import java.lang.reflect.Array;
import java.util.*;

public class TipsAndTrics {

    private static final int SIZE = 100;

    public static void main(String[] args) {

//        equalsClasses();
//        lostInfo();

//        System.out.println("New string is: " + new String());
//        String[] strings = sillyThings(String.class);
//
//        System.out.println(strings instanceof Object[]);
//        System.out.println(strings instanceof String[]);
//        System.out.println(strings[0] instanceof String);
//        System.out.println(strings);
//        System.out.println(Arrays.toString(strings));

//        cast();

//        Orange orange = instanceOfExample(new Orange());
//        Object o = instanceOfExample(new Object());
//        Object b = instanceOfExample(Customer.getInstance());
//
//        System.out.println(orange);
//        System.out.println(o);
//        System.out.println(b);

    }

    private static void cast() {
        Integer[] ints = new Integer[]{
                0, 1, 2
        };

//        ArrayList<Integer>[] integers = Arrays.fill();

        Car<Integer>[] gia = (Car<Integer>[]) new Car[100];
//         Compiles; produces ClassCastException:
//        gia = (Car<Integer>[])new Object[SIZE];
//         Runtime type is the raw (erased) type:
        gia[0] = new Car();
        System.out.println(gia.getClass().getSimpleName());
//        gia[1] = new Object(); // Compile-time error
        // Discovers type mismatch at compile time:
        Car<Double> doubleCar = new Car<>();
        doubleCar.setT(3.14);
//        gia[2] = doubleCar;

//        Double t = (Double) gia[2].getT();

//        System.out.println(t);

    }

    private static <T> T[] sillyThings(Class<T> kind) {
        return (T[]) Array.newInstance(kind, 10);
    }

    private static void equalsClasses() {
        ArrayList<String> stringArrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = new ArrayList<>();

        Class strClass = stringArrayList.getClass();
        Class intClass = integerArrayList.getClass();
        // !!!!! Classes are generics too, but they are "downcasted" because of migration (erasure).
        // The cost of this ability is - casts, instanceof, new on generics are forbidden

        System.out.println(strClass);
        System.out.println(strClass == intClass);
        System.out.println(strClass.isInstance(integerArrayList));


    }

    public static void lostInfo() {
        List<Frob> list = new ArrayList<Frob>();
        Map<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();
        Quark<Fnorkle> quark = new Quark<Fnorkle>();
        Particle<Long, Double> p = new Particle<Long, Double>();
        System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
    }

    static class Car<T> {
        T t;

        public T getT() {
            return t;
        }

        public void setT(T t) {
            this.t = t;
        }
    }

    static class Quark<Q> {
    }

    static class Particle<POSITION, MOMENTUM> {
    }

    class Frob {
    }

    class Fnorkle {
    }

    public static <U> U instanceOfExample(U u) {
        System.out.println("Apple: " + (u instanceof Apple));
        System.out.println("Orange: " + (u instanceof Orange));
        System.out.println("Fruit: " + (u instanceof Fruit));

//        Constructor<?>[] declaredConstructors = u.getClass().getDeclaredConstructors();
//        Constructor<?> constructor = declaredConstructors[0];
//        if(constructor != null){
//            Parameter[] parameters = constructor.getParameters();
//            constructor.newInstance();
//        }

        try {
            return (U) u.getClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
