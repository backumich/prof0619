package com.vertex.academy.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.vertex.academy.data.User;

public class JsonExperiments {

    private static Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .serializeNulls()
            .create();

    public static void main(String[] args) {
        User user = new User();
        user.setBoss(new User(1, "BigBoss", null, "boss"));
        user.setName("userName");
        user.setPosition("employee");

        String jsonUser = gson.toJson(user);
        System.out.println(jsonUser);

        User fromJson = gson.fromJson(jsonUser, User.class);

        System.out.println(fromJson);
    }
}
