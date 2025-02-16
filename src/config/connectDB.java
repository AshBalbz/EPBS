
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDB {
    private static final String URL = "jdbc:mysql://localhost:3306/event_booking_system";
    private static final String USER = "root"; // Change to your MySQL username
    private static final String PASSWORD = ""; // Change if you have a MySQL password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
