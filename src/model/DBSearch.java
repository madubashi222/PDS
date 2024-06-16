package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Statement;
import model.DBConnection;

public class DBSearch {
    private static final String URL = "jdbc:mysql://localhost:3306/pds2";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public ResultSet searchLogin(String usName) {
        ResultSet rs = null;
        try {
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement stmt = conn.createStatement();
            String name = usName;
            // Execute the Query
            rs = stmt.executeQuery("SELECT * FROM user_login where username='" + name + "'");
        } catch (SQLException ex) {
            Logger.getLogger(DBSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet searchStudents(){
                    
        try{
            Statement stmt = DBConnection.getStatementConnection();
            ResultSet rs = stmt.executeQuery("SELECT * FROM newuser");
 }
         catch(SQLException e){
 
 }
        ResultSet rs = null;
        return rs;
    }
    public ResultSet searchSingUp(){
                    
        try{
            Statement stmt = DBConnection.getStatementConnection();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user_login");
 }
         catch(SQLException e){
 
 }
        ResultSet rs = null;
        return rs;
    }
 
}
    
 
 
 


    