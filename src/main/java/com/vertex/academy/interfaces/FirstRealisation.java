package com.vertex.academy.interfaces;

public interface FirstRealisation extends ParentInterface {

    @Override
    default int conflictMethod(){
        return 0;
    }
}
