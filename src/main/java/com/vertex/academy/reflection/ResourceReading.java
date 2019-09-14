package com.vertex.academy.reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ResourceReading {

    public static void main(String[] args) {
        try (InputStream resourceAsStream = ResourceReading.class
                .getClassLoader()
                .getResourceAsStream("properties/test.properties");
             InputStreamReader inputStreamReader = new InputStreamReader(resourceAsStream);
             BufferedReader reader = new BufferedReader(inputStreamReader);
        ) {

            reader.lines().forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
