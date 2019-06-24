package com.vertex.academy.inheritance;

import java.io.IOException;

public class ParentClass {

    protected ClassC myMethod(ClassA a, ClassC b) throws ExceptionY {
        return null;
    }


    public class ClassA {
    }

    public class ClassB {
    }

    public class ClassC extends ClassB{
    }

    public class ClassD extends ClassC{
    }


    public class ExceptionX extends IOException {}

    public class ExceptionY extends ExceptionX {

    }

}

