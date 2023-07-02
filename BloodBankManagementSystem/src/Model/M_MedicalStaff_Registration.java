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
public class M_MedicalStaff_Registration
{
    public static boolean MedicalStaffRegistration(String NIC,String Name,int Contact_No,String Address,String Gender,String Blood_Group,String Linked_Branch,String Department,String Email,String Password)
      {
        boolean isSucces=false;
        try
        {
        Statement st=dbConnection.createDbConnection().createStatement();
        int row_count=st.executeUpdate("insert into MedicalStaff values('"+NIC+"','"+Name+"','"+Contact_No+"','"+Address+"','"+Gender+"','"+Blood_Group+"','"+Linked_Branch+"','"+Department+"','"+Email+"','"+Password+"')");
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
