// Package declaration
package com.jdbc;

// Import necessary classes
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Class declaration
public class DatabaseConnection {
    // Declare a static instance of DatabaseConnection
    private static DatabaseConnection instance;
    // Declare a Connection object
    private Connection connection;

    // Private constructor to prevent instantiation from other classes
    private DatabaseConnection() throws SQLException {
        // Specify the MySQL driver
        String driver = "com.mysql.cj.jdbc.Driver";
        // Specify the URL of the database
        String url = "jdbc:mysql://localhost:3306/internship";
        // Specify the username
        String user = "root";
        // Specify the password
        String pass = "tsaj12345";

        // Try to load the driver and establish a connection
        try {
            Class.forName(driver);
            this.connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException e) {
            // Throw a SQLException if the driver cannot be loaded
            throw new SQLException("Database driver not found.", e);
        }
    }

    // Method to get the singleton instance of DatabaseConnection
    public static synchronized DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Method to get the Connection object
    public Connection getConnection() {
        return connection;
    }
}
