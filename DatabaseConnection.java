package UserInterface;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/farmers";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
