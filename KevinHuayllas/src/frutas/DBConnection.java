/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frutas;

/**
 *
 * @author TUF
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String DB_URL = "jdbc:postgresql://oregon-postgres.render.com:5432/sisinfo2db"; 
    private static final String DB_USERNAME = "kevin_123"; 
    private static final String DB_PASSWORD = "8baO6G0RmY0HjY2PqSrScxaR3p4aI3We"; 

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el controlador JDBC: " + e.getMessage());
            throw new SQLException("Error al cargar el controlador JDBC", e);
        }
    }
}
