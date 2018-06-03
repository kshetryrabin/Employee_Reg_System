package com.rabin.employee.util;

import java.sql.Connection;

public class EmployeeUtil {
  private static final String URL = "jdbc:mysql://localhost:3306/employee_registration";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "rabin123";
  private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
  
  public EmployeeUtil() {}
  
  public static Connection getConnection() throws java.sql.SQLException, ClassNotFoundException {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_registration", "root", "rabin123");
    return con;
  }
}
