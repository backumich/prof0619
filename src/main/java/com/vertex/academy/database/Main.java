package com.vertex.academy.database;

import com.vertex.academy.database.impl.StaffDaoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {

    private static String url = "jdbc:mysql://localhost:3306/learn_me?serverTimezone=UTC";
    private static String username = "newuser";
    private static String password = "newuser";


    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {

            StaffDao staffDao = new StaffDaoImpl(connection);
//            System.out.println(staffDao.getEmployees());
//
//            System.out.println(staffDao.getEmployee(3));

            Employee employee = Employee.builder()
                    .id(9)
                    .firstName("Eric")
                    .lastName("Shultz")
                    .email("fake@email.com")
                    .salary(100000)
                    .department("test")
                    .build();

            staffDao.create(employee);

            System.out.println(staffDao.getEmployees());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
