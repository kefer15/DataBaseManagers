package Controllers;

import java.util.ArrayList;
import javax.swing.JComboBox;

public interface ILogIn {
    void close();
    ArrayList <String> setUsersMySQL(JComboBox comboBox);
    ArrayList <String> setUsersSQLServer(JComboBox comboBox);
    ArrayList <String> setUsersPostgreSQL(JComboBox comboBox);
}
