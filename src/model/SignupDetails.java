/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Statement;
/**
 *
 * @author ASUS
 */
public class SignupDetails {
    Statement stmt;
    public void Signup(String username, String password) {

          try {
stmt = DBConnection.getStatementConnection();
stmt.executeUpdate
("INSERT INTO user_login VALUES('"+username+"', '"+password+"')");
 } catch (Exception e) {
 e.printStackTrace();
 }
 
 }
}
