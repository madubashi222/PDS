package Controller;

import view.home;
import model.DBSearch;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.login;

/**
 *
 * @author ASUS
 */
public class LoginController {
     
   public static void login(String usName, String pass) {
    try {
        String username = null;
        String password = null;
        ResultSet rs = new DBSearch().searchLogin(usName);
        // Process the Query
        if (rs != null) {
            if (rs.next()) {
                username = rs.getString("username");
                password = rs.getString("password");
                if (username != null && password != null) {
                    if (password.equals(pass)) {
                        System.out.println("Login Successful");
                        login.getFrames()[0].dispose();

                        new home().setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid password", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "User not found", "Error", JOptionPane.ERROR_MESSAGE);
            }
            rs.close(); // Close the ResultSet
        } else {
            JOptionPane.showMessageDialog(null, "Database connection error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(null, "An unexpected error occurred", "Error", JOptionPane.ERROR_MESSAGE);
    }
   }
}