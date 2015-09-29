package Managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MySQLConnection {
    private Connection conecction;
    private String database;
    private String user;
    private String password;

    public MySQLConnection(String database, String user, String password)
    {
        this.database = database;
        this.user = user;
        this.password = password;
    }

    public String getDatabase()
    {
        return database;
    }

    public void setDatabase(String database)
    {
        this.database = database;
    }

    public String getUser()
    {
        return user;
    }

    public void setUser(String user)
    {
        this.user = user;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public boolean conect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conecction = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database, user, password);
            return true;
        }
        catch (ClassNotFoundException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Acceso Negado para el Usuario: " + user + ", Contraseña: " + password + ".", "Error de Conexión", JOptionPane.ERROR_MESSAGE);
        }
        
        return false;
    }
    
    public ResultSet receive(String consulta) throws SQLException
    {
        Statement stat = (Statement) conecction.createStatement();
        return stat.executeQuery(consulta);
    }
    
    public void send(String consulta) throws SQLException
    {
        PreparedStatement preparedStmt = conecction.prepareStatement(consulta);
        preparedStmt.execute();
    }
    
    public void desconect()
    {
        try
        {
            conecction.close();
        }
        catch (SQLException | NullPointerException ex)
        {
            JOptionPane.showMessageDialog(null, "Access denied for User: " + user + ", Password: " + password + ". Configure DB connection.", "Connection Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
