package com.vertex.academy.generics.issues;

interface Payable<T> {
}

/**
 * Created by sweet_home on 01.10.16.
 */
public interface ParameteryzedInterface {
}

class Employee implements Payable<Employee> {
}

//class Hourly extends Employee implements Payable<Hourly> {
//}