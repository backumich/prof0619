package com.vertex.academy.reflection;

import com.vertex.academy.data.User;
import com.vertex.academy.generics.Car;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<Car> carClass = Car.class;
        Class<Car[]> carArrayClass = Car[].class;
        Class<? extends ArrayList> userListClass = new ArrayList<User>().getClass();
        Class<Boolean> booleanClass = boolean.class;
        Class<Void> voidClass = void.class;

        Class<?> userClass1 = Class.forName("com.vertex.academy.data.User");

//        User user = new User();
//        Class<? extends User> userClass2 = user.getClass();

        Class<User> userClass3 = User.class;

//        Thread.currentThread().getContextClassLoader();
//
//        System.out.println(carClass.getName());
//        System.out.println(carClass.getTypeName());
//        System.out.println(carClass.getCanonicalName());
//        System.out.println(carClass.getSimpleName());
//
//        System.out.println("---===!!!===---");
//
//        System.out.println(carArrayClass.getName());
//        System.out.println(carArrayClass.getTypeName());
//        System.out.println(carArrayClass.getCanonicalName());
//        System.out.println(carArrayClass.getSimpleName());
//        System.out.println(carArrayClass.getComponentType().getCanonicalName());
//
//        System.out.println("---===!!!===---");
//
//        System.out.println(userListClass.getName());
//        System.out.println(userListClass.getTypeName());
//        System.out.println(userListClass.getCanonicalName());
//        System.out.println(userListClass.getSimpleName());
//
//
//        System.out.println(MyInnerClass.class.getDeclaringClass());
//        System.out.println(Arrays.toString(Main.class.getDeclaredClasses()));

//        Constructor<?>[] constructors = User.class.getConstructors();
//
//        for(Constructor<?> constructor : constructors){
////            System.out.println(constructor.getName());
//            System.out.println(constructor.toGenericString());
//            System.out.println(constructor.isSynthetic());
//            System.out.println(Arrays.toString(constructor.getDeclaredAnnotations()));
//        }

//        System.out.println(Object.class.getSuperclass());
//        System.out.println(Class.class.getSuperclass());

//        System.out.println(userClass1 == userClass2);
//        System.out.println(userClass1 == userClass3);

//        User user2 = userClass3.newInstance();
//        System.out.println(user2);

        Constructor<User> constructor = userClass3.getConstructor(String.class, User.class, String.class);
        if (constructor != null) {
            User user3 = constructor.newInstance("", null, "");
            System.out.println(user3);
        }

        System.out.println(new MyInnerClass());

    }


    public static class MyInnerClass {

    }
}
