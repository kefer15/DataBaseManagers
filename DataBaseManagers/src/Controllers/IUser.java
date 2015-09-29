package Controllers;

import javax.swing.JTextField;

public interface IUser {
    String newUser(char []state, String user, String pass, JTextField newUser, JTextField newPass); 
    void close();
    void returnWindow(String name, String pass);
}
