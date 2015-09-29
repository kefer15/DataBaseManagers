package Controllers;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JList;

public interface IControl {
    String createDataBase(String user, String pass, String name);
    ArrayList <String> initialState(String user, String pass, JComboBox comboBox);
    void removeDataBase(String user, String pass, String name);
    void close();
    void addUser(String user, String pass);
    void showTables(String user, String pass, String bdName, JList list);
}