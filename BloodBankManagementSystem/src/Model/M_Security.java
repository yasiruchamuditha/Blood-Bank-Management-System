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
public class M_Security {

    public static boolean SecurityQuestions(String NIC, String Question1, String Question2, String Question3)
    {
      boolean result=false;
        try
        {
            
        Statement st=dbConnection.createDbConnection().createStatement();
        int row_count=st.executeUpdate("insert into securityquestion values('"+NIC+"','"+Question1+"','"+Question2+"','"+Question3+"')");
        if(row_count>0)
         {
             result=true;   
         }
        else
         {
            result=false;
         }
        
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
         return result;
    }
    
}
