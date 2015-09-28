package Controllers;

import Views.UILogIn;
import java.util.ArrayList;
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
    
    public ArrayList <String> setUsersMySQL(JComboBox comboBox){
        return null;
    }
    
    public ArrayList <String> setUsersSQLServer(JComboBox comboBox){
        return null;
    }
    
    public ArrayList <String> setUsersPostgreSQL(JComboBox comboBox){
        return null;
    }
}
