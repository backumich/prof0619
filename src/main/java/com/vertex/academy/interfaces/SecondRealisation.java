package com.vertex.academy.interfaces;

public interface SecondRealisation extends ParentInterface {

    @Override
    default int conflictMethod(){
        return 1;
    }
}
