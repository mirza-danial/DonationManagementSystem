/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.PersistentDB;
import java.awt.event.*;

/**
 *
 * @author mirza
 */
public class WindowCloser extends WindowAdapter {
    
    @Override
    public void windowClosing(WindowEvent e)
    {
        PersistentDB db = new PersistentDB();
        try 
        {
            db.setOrganizationAndAdmin(Login.org, Login.admin);
            db.connect();
            db.saveToDB();
            db.disconnect();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        System.out.println("Window closed");
        System.exit(0);
    }
}
