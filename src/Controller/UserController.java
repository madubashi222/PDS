/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
 import javax.swing.JOptionPane;
 import java.util.ArrayList;
 import java.util.List;

/**
 *
 * @author ASUS
 */
public class UserController {
    
    private static final List<String[]> UserDetails = new ArrayList<>();
    public static void AddDetails(String username, String StdID, String Email) 
 { 
     
     UserDetails.add(new String[]{username, StdID,Email});
     new model.AddRecord().AddDetails(username,StdID,Email);
 
     JOptionPane.showMessageDialog(null, "New Record has been inserted", "Successfull",JOptionPane.INFORMATION_MESSAGE);
} 
      public static List<String[]> getUserDetails() {
        return UserDetails;
}}
    

