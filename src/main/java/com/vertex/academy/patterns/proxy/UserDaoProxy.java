package com.vertex.academy.patterns.proxy;

import com.vertex.academy.data.User;

public class UserDaoProxy implements UserDao {

    private UserDao userDao;
    private EmailSender emailSender;

    public UserDaoProxy(UserDao userDao, EmailSender emailSender) {
        this.userDao = userDao;
        this.emailSender = emailSender;
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
        emailSender.sendEmailAboutRegistration(user);
    }
}
