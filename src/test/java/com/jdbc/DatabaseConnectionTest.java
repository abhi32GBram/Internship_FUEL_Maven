    // Package declaration
    package com.jdbc;

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
                // Get the singleton instance of DatabaseConnection
                DatabaseConnection dbConn = DatabaseConnection.getInstance();
                // Assert that the returned Connection object is not null
                assertNotNull(dbConn.getConnection());
            } catch (SQLException e) {
                // Fail the test if a SQLException is thrown
                fail("Failed to establish database connection.");
            }
        }
    }
