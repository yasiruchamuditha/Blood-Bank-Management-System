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
public class M_Admin_Login 
{
    public static boolean AdminLogin(String NIC,String Password)
    {
         boolean issucces = false; 
           try
            {
            Statement st=dbConnection.createDbConnection().createStatement();
            String sql="Select * from Admin where NIC='"+NIC+"' and Password='"+Password+"' ";
            ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
               issucces=true;
            }
            else
            {
                 issucces=false;
            }
            
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
           return issucces;
    }
}
