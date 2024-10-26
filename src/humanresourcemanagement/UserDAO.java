/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package humanresourcemanagement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Kasturi Sahoo
 */
public class UserDAO {
    public void createAccount(String firstName, String email,String role,String password) {
        String insertSQL = "INSERT INTO logins (username, email, password,role) VALUES (?, ?, ?,?)";
        
        try (Connection connection = DatabaseConnection.connect(); // Reusing your existing connection method
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
             
            preparedStatement.setString(1, firstName); // Set the first name
            preparedStatement.setString(2, email); // Set the email
            preparedStatement.setString(3, password);// Set the password
            preparedStatement.setString(4, role); 
            int rowsAffected = preparedStatement.executeUpdate(); // Execute the insert
            if (rowsAffected > 0) {
                System.out.println("Account created successfully!");
            } else {
                System.out.println("Account creation failed.");
            }
        } catch (SQLException e) {
            System.err.println("Error during account creation: " + e.getMessage());
        }
    }
}
