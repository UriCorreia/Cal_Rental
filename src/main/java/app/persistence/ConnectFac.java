package app.persistence;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectFac { 

    private static final String URL = "jdbc:mariadb://localhost:3306/rent_car_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root"; 

    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("❌ Falha na conexão: " + e.getMessage());
            throw e;
        }
    }
}

