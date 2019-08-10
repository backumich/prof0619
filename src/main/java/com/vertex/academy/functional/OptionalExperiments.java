package com.vertex.academy.functional;

import lombok.Data;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExperiments {

    private UserDao userDao;

    public OptionalExperiments(UserDao userDao) {
        this.userDao = userDao;
    }

    public void printBossName(User user) {
//        System.out.println(user.getBoss().getName());

        Optional.ofNullable(user)
                .map(User::getBoss)
                .map(User::getName)
                .ifPresent(System.out::println);

//          DON NOT DO LIKE THIS!!!!
//        Optional<User> optionalUser = Optional.ofNullable(user);
//        if(optionalUser.isPresent()){
//            User notNullUser = optionalUser.get();
//        }

    }

    public boolean isPresent(User user) {
        return Optional.ofNullable(user)
                .flatMap(u -> userDao.getUser(u.getId()))
                .isPresent();

    }

    public List<User> getUsersColleagues(User user) {
        return Optional.ofNullable(user)
                .map(User::getColleagues)
                .orElse(Collections.emptyList())
                .stream()
//                .flatMap(u -> userDao.getUser(u.getId()).stream())
                .collect(Collectors.toList());
    }

}

@Data
class User {
    private int id;
    private String name;
    private User boss;
    private List<User> colleagues;
}

interface UserDao {
    Optional<User> getUser(int id);
}