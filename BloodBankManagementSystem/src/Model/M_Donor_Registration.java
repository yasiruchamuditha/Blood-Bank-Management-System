/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class M_Donor_Registration
{
      public static boolean DonorRegistration(String NIC,String Name,String DOB,int Age,String Gender,String BloodGroup,String Address ,int Contact_No,String Email,String Password)
       {
       boolean isSucces=false;
        try
        {
            
        Statement st=dbConnection.createDbConnection().createStatement();
        int row_count=st.executeUpdate("insert into Donor values('"+NIC+"','"+Name+"','"+DOB+"','"+Age+"','"+Gender+"','"+BloodGroup+"','"+Address+"','"+Contact_No+"','"+Email+"','"+Password+"')");
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
