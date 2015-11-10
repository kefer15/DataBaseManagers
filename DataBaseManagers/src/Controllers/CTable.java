package Controllers;

import Managers.MySQLConnection;
import Views.UITable;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CTable implements ITable{    
    private final UITable window;
    
    public CTable(String user, String pass, String database) {
        window = new UITable(this, user, pass, database);
    }
    
    @Override
    public void addRow(JTable table){        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(new Object[]{false, "", "", "0"});        
        table.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(new JComboBox(new String[]{"INTEGER", "DOUBLE", "VARCHAR"})));
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
                
                case "VARCHAR":
                    cadena += "Char(";
                    
                    if(!String.valueOf(table.getValueAt(i, 3)).isEmpty())
                        cadena += table.getValueAt(i, 3) + ") NOT NULL,\n\t";
                    else
                        resultado = "Datos Incompletos. Debe rellenar todos los campos";
                    
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
    public void returnWindow(String name, String pass){
        window.dispose();
        CControl control = new CControl(name, pass);
    }
    
    @Override
    public void close(){
        window.dispose();
    }
}
