/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class dbConnection 
{
    public static Connection con;
    public static Connection createDbConnection()
    {
        try
        {
        String dbpath="jdbc:mysql://localhost:3306/NationalBloodBank";
        con=DriverManager.getConnection(dbpath,"root","");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;
        
    }
}
