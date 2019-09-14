package com.vertex.academy.database.impl;

import com.vertex.academy.database.Employee;
import com.vertex.academy.database.StaffDao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StaffDaoImpl implements StaffDao {

    private static final String SELECT_ALL = "SELECT id, first_name, last_name, email, salary, department FROM staff";
    private static final String SELECT_BY_ID = "SELECT id, first_name, last_name, email, salary, department FROM staff WHERE id = ?";
    private static final String INSERT_EMPLOYEE = "INSERT INTO staff (first_name, last_name, email, salary, department) " +
            "value (?, ?, ?, ?, ?)";


    private Connection connection;

    public StaffDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Employee> getEmployees() throws SQLException {
        List<Employee> result = new ArrayList<>();

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SELECT_ALL)) {
            while (resultSet.next()) {
                result.add(parseEmployee(resultSet));
            }
        }

        return result;
    }

    @Override
    public Employee getEmployee(int id) throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            Employee toReturn = null;

            if (resultSet.next()) {
                toReturn = parseEmployee(resultSet);
            }

            return toReturn;
        }
    }

    @Override
    public void create(Employee employee) throws SQLException {
        try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_EMPLOYEE)) {
            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setString(3, employee.getEmail());
            preparedStatement.setInt(4, employee.getSalary());
            preparedStatement.setString(5, employee.getDepartment());

            preparedStatement.executeUpdate();
        }

    }

    private Employee parseEmployee(ResultSet resultSet) throws SQLException {
        return Employee.builder()
                .id(resultSet.getInt("id"))
                .firstName(resultSet.getString("first_name"))
                .lastName(resultSet.getString("last_name"))
                .email(resultSet.getString("email"))
                .salary(resultSet.getInt("salary"))
                .department(resultSet.getString("department"))
                .build();
    }
}
