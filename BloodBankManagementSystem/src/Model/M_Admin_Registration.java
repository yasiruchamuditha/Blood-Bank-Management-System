/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.*;
import javax.swing.*;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */

public class M_Admin_Registration
{
     public static boolean AdminRegistration(String NIC,String Name,int Contact_No,String Address,String Department,String Linked_Branch,String EmployeeID,String Email,String Password)
      {
        boolean isSucces=false;
        try
        {
        Statement st=dbConnection.createDbConnection().createStatement();
        int row_count=st.executeUpdate("insert into Admin values('"+NIC+"','"+Name+"','"+Contact_No+"','"+Address+"','"+Department+"','"+Linked_Branch+"','"+EmployeeID+"','"+Email+"','"+Password+"')");
        if(row_count>0)
         {
             isSucces=true;   
         }
        else
         {
            isSucces=false;
         }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        
       return isSucces;
    }
}
