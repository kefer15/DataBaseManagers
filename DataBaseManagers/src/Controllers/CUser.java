package Controllers;

import Managers.MySQLConnection;
import Views.UIUser;
import java.sql.SQLException;
import javax.swing.JTextField;

public class CUser implements IUser{
    private final UIUser window;
    
    public CUser(String user, String pass) {
        window = new UIUser(this, user, pass);
    }
    
    @Override
    public String newUser(char []state, String user, String pass, JTextField newUser, JTextField newPass){
        if(!newUser.getText().isEmpty() && !newPass.getText().isEmpty()){
            MySQLConnection mysql = new MySQLConnection("mysql", user, pass);
            mysql.conect();
            String error = "";

            try {
                mysql.send("INSERT INTO user SET"
                        + " Host = 'localhost' ,"
                        + " User = '" + newUser.getText() + "' ,"
                        + " Password = PASSWORD('" + newPass.getText() + "') ," 
                        + " Select_priv = '" + state[0] + "' ,"
                        + " Insert_priv = '" + state[1] + "' ,"
                        + " Update_priv = '" + state[2] + "' ,"
                        + " Delete_priv = '" + state[3] + "' ,"
                        + " Create_priv = '" + state[4] + "' ,"
                        + " Drop_priv = '" + state[5] + "' ,"
                        + " Create_user_priv = 'Y',"
                        + " ssl_cipher = '' ,"
                        + " x509_issuer = '' ,"
                        + " x509_subject = ''");

                mysql.send("FLUSH PRIVILEGES");

                mysql.desconect();
            } catch (SQLException ex) {
                error = ex.getMessage();
            }

            return error;
        }
        
        return "Campos Incompletos. Debe rellenar tanto Id de Usuario como Contraseña";
    }
    
    @Override
    public void close(){
        window.dispose();
    }
    
    @Override
    public void returnWindow(String name, String pass){
        window.dispose();
        CControl control = new CControl(name, pass);
    }
}
