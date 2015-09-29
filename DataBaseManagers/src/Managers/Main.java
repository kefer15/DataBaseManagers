package Managers;

import Controllers.CLogIn;
import javax.swing.UIManager;

public class Main {
    
    private CLogIn logIn;
    
    public Main() {
        logIn = new CLogIn();
    }
    
    public static void main(String [] args)
    {
        try
        {
            UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException e)
        {
            e.printStackTrace();
        }
        
        new Main();
    }
}
