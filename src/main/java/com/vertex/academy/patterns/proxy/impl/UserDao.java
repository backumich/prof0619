package com.vertex.academy.patterns.proxy.impl;

import com.vertex.academy.data.User;

public class UserDao implements com.vertex.academy.patterns.proxy.UserDao {
    @Override
    public void saveUser(User user) {
        System.out.println("saving user " + user);
    }
}
