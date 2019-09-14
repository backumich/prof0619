package com.vertex.academy.collections;

import com.vertex.academy.data.User;

import java.util.HashMap;

public class MapExperiments {

    public static void main(String[] args) {
        HashMap<String, User> companyHierarchy = getCompanyHierarchy();

        System.out.println(companyHierarchy);

        User spNewPosition = companyHierarchy.computeIfPresent("account",
                (key, user) -> {

                    if ("Svetlana Petrovna".equals(user.getName())) {
                        return new User(
                                1,
                                user.getName(),
                                user.getBoss(),
                                "senior executive vice president"
                        );
                    } else {
                        return user;
                    }

                });

        System.out.println(spNewPosition);
        System.out.println(companyHierarchy);

//        System.out.println(Collections.newSetFromMap(companyHierarchy));
    }

    private static HashMap<String, User> getCompanyHierarchy() {
        HashMap<String, User> myMap = new HashMap<>();

        User boss = new User(1, "Volodymyr", null, "boss");
        User accounter = new User(2, "Svetlana Petrovna", boss, "accounter");
        User accounter2 = new User(3, "Galina Vasilievna", boss, "accounter");

        myMap.put("boss", boss);
        myMap.put("account", accounter);
        myMap.put("anotherAccount", accounter2);

        return myMap;
    }


}
