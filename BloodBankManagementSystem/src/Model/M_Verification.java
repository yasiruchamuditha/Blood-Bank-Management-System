/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class M_Verification {

    public boolean verification(String NIC,String q1, String q2, String q3)
    {  boolean issucces = false;
           try
          {
            Statement st=dbConnection.createDbConnection().createStatement();
            String sql="Select * from securityquestion where NIC='"+NIC+"' and question01='"+q1+"' and question02='"+q2+"' and question03='"+q3+"' ";
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
