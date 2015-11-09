package Controllers;

import javax.swing.JTable;
import javax.swing.JTextField;

public interface ITable {
    void returnWindow(String name, String pass);
    void close();    
    void addRow(JTable table);
    String addTable(String user, String pass, String database, JTable table, JTextField name);
}
