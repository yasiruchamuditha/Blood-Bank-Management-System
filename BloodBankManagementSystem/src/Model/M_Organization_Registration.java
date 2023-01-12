/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasiru
 */
public class M_Organization_Registration 
{
     public static boolean OrganizationRegistration(String RegNo,String Name,int OrganizationalContact_No,int faxNo,String Address,String Member_Name, int MemberContact_No,String MemberEmail,String OrganizationalEmail,String Password)
      {
        boolean isSucces=false;
        try
        {
        Statement st=dbConnection.createDbConnection().createStatement();
        int row_count=st.executeUpdate("insert into Organization values('"+RegNo+"','"+Name+"','"+OrganizationalContact_No+"','"+faxNo+"','"+Address+"','"+Member_Name+"','"+MemberContact_No+"','"+MemberEmail+"','"+OrganizationalEmail+"','"+Password+"')");
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
