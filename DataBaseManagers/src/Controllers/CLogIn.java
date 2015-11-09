package Controllers;

import Managers.MySQLConnection;
import Views.UILogIn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class CLogIn implements ILogIn{
    private UILogIn window;
    
    public CLogIn() {
        window = new UILogIn(this);
    }
    
    @Override
    public void close(){
        window.dispose();
    }
    
    @Override
    public ArrayList <String> setUsersMySQL(JComboBox comboBox){
        MySQLConnection mysql = new MySQLConnection("mysql", "root", "123456");
        mysql.conect();
        ArrayList <String> users = new ArrayList <> ();
        
        try {
            ResultSet result = mysql.receive("SELECT DISTINCT User FROM USER");
            
            while(result.next()){
                comboBox.addItem(result.getString("User"));
                users.add(result.getString("User"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CLogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return users;
    }
    
    @Override
    public void join(String name, String pass){
        MySQLConnection mysql = new MySQLConnection("mysql", name, pass);
        if(mysql.conect()){
            window.dispose();
            CControl control = new CControl(name, pass);
        }
    }
    
    public ArrayList <String> setUsersSQLServer(JComboBox comboBox){
        return null;
    }
    
    public ArrayList <String> setUsersPostgreSQL(JComboBox comboBox){
        return null;
    }
    
    
}
