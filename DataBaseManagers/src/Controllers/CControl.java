package Controllers;

import Managers.MySQLConnection;
import Views.UIControl;
import java.awt.CardLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CControl implements IControl {
    private final UIControl window;
    
    public CControl(String user, String pass) {
        window = new UIControl(this, user, pass, initialState(user, pass));
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
    public void changeStart(CardLayout crdCard, JPanel pnlPanel){
        crdCard.show(pnlPanel, "pnlShowTables");
    }
    
    @Override
    public void changeAddUser(CardLayout crdCard, JPanel pnlPanel){
        crdCard.show(pnlPanel, "pnlAddUser");
    }
    
    @Override
    public void changeAddTable(CardLayout crdCard, JPanel pnlPanel){
        crdCard.show(pnlPanel, "pnlAddTable");
    }
    
    @Override
    public void changeShowData(CardLayout crdCard, JPanel pnlPanel){
        crdCard.show(pnlPanel, "pnlShowData");
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
    public String removeDataBase(String user, String pass, String name){
        MySQLConnection mysql = new MySQLConnection("mysql", user, pass);
         mysql.conect();
         String message = "";

         try {
             mysql.send("DROP DATABASE " + name);
             mysql.desconect();
         } catch (SQLException ex) {
             message = ex.getMessage();
         }
         
         return message;
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
    
    @Override
    public void addRow(JTable table){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{false, "", "", "0"});        
        table.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(new JComboBox(new String[]{"INTEGER", "DOUBLE", "CHAR", "BOOL", "FLOAT", "DATE"})));
    }
       
    @Override
    public String addTable(String user, String pass, String database, JTable table, JTextField name){
        String resultado = "";
        ArrayList <String> primary = new ArrayList <>();
        String cadena = "CREATE TABLE " + name.getText() + "\n(\n\t";
        
        for(int i = 0; i < table.getRowCount() && resultado.isEmpty();i++) {
            if(!String.valueOf(table.getValueAt(i, 1)).isEmpty())
                cadena += table.getValueAt(i, 1) + " ";
            else {
                resultado = "Datos Incompletos. Debe rellenar todos los campos";
                break;
            }
            
            switch(String.valueOf(table.getValueAt(i, 2))){
                case "INTEGER":
                    cadena += "Int(";
                    if(!String.valueOf(table.getValueAt(i, 3)).isEmpty())
                        cadena += table.getValueAt(i, 3) + ") NOT NULL,\n\t";
                    else
                        resultado = "Datos Incompletos. Debe rellenar todos los campos";
                    break;
                
                case "DOUBLE":
                    cadena += "Double NOT NULL,\n\t";
                    break;
                
                case "CHAR":
                    cadena += "Char(";
                    
                    if(!String.valueOf(table.getValueAt(i, 3)).isEmpty())
                        cadena += table.getValueAt(i, 3) + ") NOT NULL,\n\t";
                    else
                        resultado = "Datos Incompletos. Debe rellenar todos los campos";
                    break;
                    
                case "BOOL":
                    cadena += "Bool,\n\t";
                    break;
                    
                case "FLOAT":
                    cadena += "Float(";
                    
                    if(!String.valueOf(table.getValueAt(i, 3)).isEmpty())
                        cadena += table.getValueAt(i, 3) + "),\n\t";
                    else
                        resultado = "Datos Incompletos. Debe rellenar todos los campos";
                    break;
                    
                case "DATE":
                    cadena += "Date,\n\t";
                    break;
                    
                default: resultado = "Datos Incompletos. Debe rellenar todos los campos";
                    break;
            }
            
            if(Boolean.parseBoolean(String.valueOf(table.getValueAt(i, 0))) == true) 
                primary.add(String.valueOf(table.getValueAt(i, 1)));
        }
        
        if(resultado.isEmpty()) {
            cadena = primary.stream().map((str) -> "PRIMARY KEY (" + str + "),\n\t").reduce(cadena, String::concat);
            cadena = cadena.substring(0, cadena.length()-3) + "\n)";
            MySQLConnection mysql = new MySQLConnection("mysql", user, pass);
            mysql.conect();
            
            try {
                mysql.send("USE " + database);
                mysql.send(cadena);
                mysql.desconect();
            } catch (SQLException ex) {
                resultado = ex.getMessage();
            }
        }
        
        return resultado;
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
    public String addUser(char []state, String user, String pass, JTextField newUser, JTextField newPass){
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
        CLogIn login = new CLogIn();
    }
}
