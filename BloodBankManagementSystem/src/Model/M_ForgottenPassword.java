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
public class M_ForgottenPassword 
{
     public static boolean ForgottenPassword(String NIC, String Password)
        {
             boolean isSucces=false;
             String UserType;
            
            SelectedUser s=new SelectedUser();
            UserType=s.VerificationUser();
              if(UserType.equals("Donor"))
                {
                  try
                    {
            
                   Statement st=dbConnection.createDbConnection().createStatement();
                   int row_count=st.executeUpdate("update donor set Password='"+Password+"' where NIC='"+NIC+"' ");
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
            }
            else if(UserType.equals("MedicalStaff"))
            {
                 try
                    {
            
                   Statement st=dbConnection.createDbConnection().createStatement();
                   int row_count=st.executeUpdate("update medicalstaff set Password='"+Password+"' where NIC='"+NIC+"' ");
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
                
            }
            else if(UserType.equals("Organization"))
            {
                    try
                    {
            
                   Statement st=dbConnection.createDbConnection().createStatement();
                   int row_count=st.executeUpdate("update organization set Password='"+Password+"' where RegNo='"+NIC+"' ");
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
            }
            else
            {
                 try
                    {
            
                   Statement st=dbConnection.createDbConnection().createStatement();
                   int row_count=st.executeUpdate("update admin set Password='"+Password+"' where NIC='"+NIC+"' ");
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
            }
            
      
         return isSucces;
        }
}
