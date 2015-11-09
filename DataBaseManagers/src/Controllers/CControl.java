package Controllers;

import Managers.MySQLConnection;
import Views.UIControl;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;

public class CControl implements IControl{
    
    private UIControl window;
    
    public CControl(String user, String pass) {
        window = new UIControl(this, user, pass, initialState(user, pass));
    }
    
    @Override
    public String createDataBase(String user, String pass, String name){
        MySQLConnection mysql = new MySQLConnection("mysql", user, pass);
         mysql.conect();
         String message = "";

         try {
             mysql.send("CREATE DATABASE " + name);
             mysql.desconect();
         } catch (SQLException ex) {
             message = ex.getMessage();
         }
         
        return message;
    }
    
    @Override
    public void createTable(String user, String pass, String database){
        window.dispose();
        CTable tableWindow = new CTable(user, pass, database);
    }
    
    public final ArrayList <String> initialState(String user, String pass){
        ArrayList <String> dataBases = new ArrayList <> ();
        MySQLConnection mysql = new MySQLConnection("mysql", user, pass);
        mysql.conect();
        try {
            ResultSet result = mysql.receive("SHOW DATABASES");
            
            while(result.next())
                dataBases.add(result.getString("Database"));
            
        } catch (SQLException ex) {
            Logger.getLogger(CControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dataBases;
    }
    
    @Override
    public ArrayList <String> initialState(String user, String pass, JComboBox comboBox){
        ArrayList <String> dataBases = new ArrayList <> ();
        MySQLConnection mysql = new MySQLConnection("mysql", user, pass);
        mysql.conect();
        comboBox.removeAllItems();
        try {
            ResultSet result = mysql.receive("SHOW DATABASES");
            
            while(result.next()){
                comboBox.addItem(result.getString("Database"));
                dataBases.add(result.getString("Database"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dataBases;
    }
    
    @Override
    public void removeDataBase(String user, String pass, String name){
        MySQLConnection mysql = new MySQLConnection("mysql", user, pass);
         mysql.conect();
         String message = "";

         try {
             mysql.send("DROP DATABASE " + name);
             mysql.desconect();
         } catch (SQLException ex) {
             message = ex.getMessage();
         }
    }
    
    @Override
    public String dropTable(String user, String pass, String bdName, String table){
        MySQLConnection mysql = new MySQLConnection("mysql", user, pass);
        mysql.conect();
        String message = "";

        try {
            mysql.send("USE " + bdName);
            mysql.send("DROP TABLE " + table);
            mysql.desconect();
        } catch (SQLException ex) {
            message = ex.getMessage();
        }
         
        return message;
    }
    
    
    @Override
    public void close(){
        window.dispose();
    }
    
    @Override
    public void addUser(String user, String pass){
        window.dispose();
        CUser userWindow = new CUser(user, pass);
    }
    
    @Override
    public void showTables(String user, String pass, String bdName, JList list){
        ArrayList <String> dataBases = new ArrayList <> ();
        MySQLConnection mysql = new MySQLConnection("mysql", user, pass);
        mysql.conect();
        DefaultListModel model = new DefaultListModel();        try {
            ResultSet result = mysql.receive("SHOW FULL TABLES FROM " + bdName);
            
            while(result.next()){
                model.addElement(result.getString("Tables_in_" + bdName));
                dataBases.add(result.getString("Tables_in_" + bdName));
            }
            list.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(CControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
