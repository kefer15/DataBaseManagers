package Controllers;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public interface ILogIn {
    void close();
    ArrayList <String> setUsersMySQL(JComboBox comboBox);
    ArrayList <String> setUsersSQLServer(JComboBox comboBox);
    ArrayList <String> setUsersPostgreSQL(JComboBox comboBox);
    void join(String name, String pass);
}
