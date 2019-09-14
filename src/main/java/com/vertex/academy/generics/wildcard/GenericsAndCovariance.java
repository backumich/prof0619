package com.vertex.academy.generics.wildcard;


import com.vertex.academy.data.fruits.Apple;
import com.vertex.academy.data.fruits.Fruit;
import com.vertex.academy.data.fruits.Jonathan;
import com.vertex.academy.data.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//we can do it with wildcards
public class GenericsAndCovariance {
    public static void main(String[] args) {
        // Wildcards allow covariance:
        List<? extends Fruit> flist = new ArrayList<>();
        List<Apple> apples = new ArrayList<Apple>();
        flist = apples;
        // Compile Error: can’t add any type of object:
        apples.add(new Apple());
        apples.add(new Jonathan());
//         flist.add(new Fruit());
//         flist.add(new Orange());
        flist.add(null); // Legal but uninteresting
        // We know that it returns at least Fruit:
        Fruit fruit = flist.get(0);

        System.out.println(flist);

        //all we can do is to define the variable with predefined lists
        flist = Arrays.asList(new Apple(), new Jonathan(), new Orange());
//        Collections.addAll(flist, new Apple(), new Jonathan(), new Orange());
    }
}
