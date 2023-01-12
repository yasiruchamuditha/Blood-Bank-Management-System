/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.JOptionPane;
import java.sql.*;

public class M_Donor_Login 
{
    public static boolean DonorLogin(String NIC,String Password)
    {
        boolean issucces = false;
           try
        {
            Statement st=dbConnection.createDbConnection().createStatement();
            String sql="Select * from Donor where NIC='"+NIC+"' and Password='"+Password+"' ";
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
