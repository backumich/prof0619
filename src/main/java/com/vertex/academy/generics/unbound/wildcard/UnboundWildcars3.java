package com.vertex.academy.generics.unbound.wildcard;

/**
 * Created by sweet_home on 04.03.17.
 */
public class UnboundWildcars3 {

    public static void main(String[] args) {
        Wildcards.Holder<?> holder1 = new Wildcards.Holder();
        Wildcards.Holder<? extends Object> holder2 = new Wildcards.Holder<Integer>();

        System.out.println(holder1 instanceof Wildcards.Holder<?>);
        System.out.println(holder1 instanceof Wildcards.Holder);
//        System.out.println(holder1 instanceof Wildcards.Holder<Integer>);

        System.out.println(holder1.getClass());
        System.out.println(holder2.getClass());

        holder1.set(null);
        holder2.set(null);

//        holder2.set("My string");
//        holder2.set(new Integer(1));
//        holder2.set(new Object());

        Object o = holder1.get();
        Object o1 = holder2.get();

    }
}
