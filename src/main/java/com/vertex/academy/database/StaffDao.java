package com.vertex.academy.database;

import java.sql.SQLException;
import java.util.List;

public interface StaffDao {

    List<Employee> getEmployees() throws SQLException;

    Employee getEmployee(int id) throws SQLException;

    void create(Employee employee) throws SQLException;
}
