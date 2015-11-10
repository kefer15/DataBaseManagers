package Controllers;

import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public interface IControl {
    String createDataBase(String user, String pass, String name);
    
    
    ArrayList <String> initialState(String user, String pass, JComboBox comboBox);
    String removeDataBase(String user, String pass, String name);
    void close();
    void addUser(String user, String pass);
    void showTables(String user, String pass, String bdName, JList list);
    String dropTable(String user, String pass, String bdName, String table);
    
    void changeStart(CardLayout crdCard, JPanel pnlPanel);
    void changeAddUser(CardLayout crdCard, JPanel pnlPanel);
    void changeAddTable(CardLayout crdCard, JPanel pnlPanel);
    void changeShowData(CardLayout crdCard, JPanel pnlPanel);
    
    void addRow(JTable table);
    String addTable(String user, String pass, String database, JTable table, JTextField name);
    String addUser(char []state, String user, String pass, JTextField newUser, JTextField newPass); 
}