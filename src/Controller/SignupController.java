/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class SignupController {
    
    private static final List<String[]> Signupdetails = new ArrayList<>();
    public static void Signup(String username, String password) 
 { 
     
     Signupdetails.add(new String[]{username,password});
     new model.SignupDetails().Signup(username,password);
 
     JOptionPane.showMessageDialog(null, "New Account Successfully created ","",JOptionPane.INFORMATION_MESSAGE);
     JOptionPane.showMessageDialog(null, "Now login into your Account ","",JOptionPane.INFORMATION_MESSAGE);
} 
      public static List<String[]> getUserDetails() {
        return Signupdetails;
}

  
    }
    

