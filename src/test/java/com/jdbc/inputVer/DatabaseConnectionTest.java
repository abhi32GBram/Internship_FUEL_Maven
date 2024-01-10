package com.jdbc.inputVer;
// Package declaration

// Import necessary classes

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Class declaration
public class DatabaseConnectionTest {
    // Test method for getConnection()
    @Test
    public void testGetConnection() {
        try {
            // Get the singleton instance of DatabaseConnection.
            // WE NEED TO PASS THE CREDENTIALS HERE ITSELF,
            // for some reason we cant user Scanner in the running test console

            DatabaseConnection dbConn = DatabaseConnection.getInstance("root", "tsaj12345");
            // Assert that the returned Connection object is not null
            assertNotNull(dbConn.getConnection());
        } catch (SQLException e) {
            // Fail the test if a SQLException is thrown
            fail("Failed to establish database connection.");
        }
    }
}
