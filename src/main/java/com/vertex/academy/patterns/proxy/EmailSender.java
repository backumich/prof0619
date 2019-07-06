package com.vertex.academy.patterns.proxy;

import com.vertex.academy.data.User;

public class EmailSender {

    public void sendEmailAboutRegistration(User user) {
        System.out.println("Hi User, sending you a confirmation email");
    }
}
