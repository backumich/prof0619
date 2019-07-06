package com.vertex.academy.patterns.builder;

import com.vertex.academy.data.Sex;
import lombok.ToString;

@ToString
public final class User {

    private String nickname;
    private String password;
    private String name;
    private String secondName;
    private Sex sex;
    private int weight;

    private User() {

    }

    public User(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
    }

    public User(String nickname, String password, int weight, String name,
                String secondName, Sex sex) {
        this.nickname = nickname;
        this.password = password;
        this.weight = weight;
        this.name = name;
        this.secondName = secondName;
        this.sex = sex;
    }

    public static class Builder {
        private User user;

        public Builder() {
            this.user = new User();
        }

        public Builder withName(String name) {
            this.user.name = name;
            return this;
        }

        public Builder withSecondName(String secondName) {
            this.user.secondName = secondName;
            return this;
        }

        public Builder withSex(Sex sex) {
            this.user.sex = sex;
            return this;
        }

        public Builder withNickname(String nickname) {
            this.user.nickname = nickname;
            return this;
        }

        public Builder withPassword(String password) {
            this.user.password = password;
            return this;
        }

        public Builder withWeight(int weight) {
            this.user.weight = weight;
            return this;
        }

        public User build() {
            return new User(user.nickname, user.password, user.weight, user.name, user.secondName, user.sex);
        }
    }

    public static void main(String[] args) {

        Builder builder = new Builder()
                .withName("Vasiliy")
                .withSex(Sex.MALE)
                .withNickname("president");

        User slave = builder
                .withPassword("changeMe1")
                .build();

        User slave2 = builder
                .withPassword("changeMe123")
                .build();


        System.out.println(slave);
        System.out.println(slave2);
    }
}
