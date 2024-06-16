/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author ASUS
 */
public class AddRecord {
    
    Statement stmt;
 
    public void AddDetails(String username, String StdID, String Email) {

          try {
stmt = DBConnection.getStatementConnection();
stmt.executeUpdate
("INSERT INTO newuser1 VALUES('"+username+"', '"+StdID+"','"+Email+"')");
 } catch (SQLException e) {
 }
 
 }
    
}
