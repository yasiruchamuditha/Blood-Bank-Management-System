/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class M_Appointment
{
      public static boolean Appointment_Donor(String NIC,String Name,int Contact_No,String Email,String Time_Slot,String Date,String Nearest_Center,String Blood_Group)
       {
        
        boolean isSucces=false;
        try
        {    
        Statement st=dbConnection.createDbConnection().createStatement();
        int row_count=st.executeUpdate("insert into DonorAppointment values('"+NIC+"','"+Name+"','"+Contact_No+"','"+Email+"','"+Time_Slot+"','"+Date+"','"+Nearest_Center+"','"+Blood_Group+"')");
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
      
      


    public static boolean Appointment_Organization(String Reg_No, String Organization_Name, String Date, String MOH, int Contact_No) 
    {
         boolean isSucces=false;
        try
        {    
        Statement st=dbConnection.createDbConnection().createStatement();
        int row_count=st.executeUpdate("insert into DonorOrganization values('"+Reg_No+"','"+Organization_Name+"','"+Date+"','"+MOH+"','"+Contact_No+"')");
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
