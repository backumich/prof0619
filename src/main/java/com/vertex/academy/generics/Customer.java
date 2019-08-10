package com.vertex.academy.generics;


class Customer {
    private static long counter = 1;
    private final long id = counter++;

    private Customer() {
    }

    public static Customer getInstance() {
        return new Customer();
    }

    // A method to produce Generator objects:
    public static Generator<Customer> generator() {
        return Customer::new;
    }

    public String toString() {
        return "Customer " + id;
    }
}
