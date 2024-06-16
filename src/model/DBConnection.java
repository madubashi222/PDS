package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    // Establishes the database connection and returns a Statement object
    public static Statement getStatementConnection() {
        try {
            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/pds2";
            Connection conn = DriverManager.getConnection(url, "root", "");
            // Create the statement
            return conn.createStatement();
        } 
        catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            // Handle or log the exception as needed
            return null;
        }
    }

    public static void closeCon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}