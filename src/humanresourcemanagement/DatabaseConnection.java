/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanresourcemanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kasturi Sahoo
 */
public class DatabaseConnection {
    // Method to establish a connection to the database
    public static Connection connect() {
        Connection conn = null;
        try {
            // Database connection details
            String URL = "jdbc:mysql://localhost:3306/kasturi";
            String USER = "root";
            String PASSWORD = "kasturi@2004";
            
            // Load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connection established successfully.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
}

