package com.company.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USERNAME = "eslam";
    private static final String PASSWORD = "eslam";
    private static final String URL = "jdbc:mysql://localhost:3306/threads?zeroDateTimeBehavior=convertToNull";
    private static Connection connection = null;

    public DatabaseConnection() {
    }
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName(DRIVER);
            connection = (Connection) DriverManager.getConnection(
                    URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e){
            connection.rollback();
        }
        return connection;
    }
}
