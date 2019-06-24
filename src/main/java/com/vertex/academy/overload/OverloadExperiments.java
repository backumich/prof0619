package com.vertex.academy.overload;

import java.util.ArrayList;

public class OverloadExperiments {

    private void methodObj(Object ignore){
        System.out.println("in object method");
    }

    private void methodObj(String ignore){
        System.out.println("in string method");
    }

    private void methodInt(int ignore){
        System.out.println("in int method");
    }

    private void methodInt(Integer ignore){
        System.out.println("in integer method");
    }

    private void methodVarArgs(String ignore){
        System.out.println("in one argument method");
    }

    private void methodVarArgs(String... ignore){
        System.out.println("in varargs method");
    }

//    private void methodArray(String[] ignore){
//        System.out.println("in one argument method");
//    }
//
//    private void methodArray(String... ignore){
//        System.out.println("in varargs method");
//    }

    public static void main(String... args) {
        OverloadExperiments experiments = new OverloadExperiments();

        experiments.methodObj("");
        experiments.methodObj(new ArrayList());

        experiments.methodInt(9);
        experiments.methodInt(new Integer(9));

        experiments.methodVarArgs();
        experiments.methodVarArgs("");
        experiments.methodVarArgs("", "");
    }
}
