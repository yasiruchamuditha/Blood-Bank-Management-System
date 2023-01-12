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
public class M_Transcation 
{
 public static boolean Transcation(String Patient_NIC,String Patient_Name,int Patient_Contact_No,String Date,String Time,String Blood_Group,float Weight_Of_Blood,int No_Of_Bags,String Hospital_Linked,String Incharge_Officer_ID)
 {
       boolean isSucces=false;
      try
        {
            
        Statement st=dbConnection.createDbConnection().createStatement();
        int row_count=st.executeUpdate("insert into Transcation values('"+Patient_NIC+"','"+Patient_Name+"','"+Patient_Contact_No+"','"+Date+"','"+Time+"','"+Blood_Group+"','"+Weight_Of_Blood+"','"+No_Of_Bags+"','"+Hospital_Linked+"','"+Incharge_Officer_ID+"')");
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
 
  public static boolean updateStockTranscation(int No_Of_Bags, String Blood_Group) 
    {
           boolean stock=false;
        try
        {
            
        Statement st=dbConnection.createDbConnection().createStatement();
        int row_count=st.executeUpdate("update storage set No_Of_Bags=(No_Of_Bags-'"+No_Of_Bags+"') where Blood_Group='"+Blood_Group+"'");
        if(row_count>0)
         {
             stock=true;   
         }
        else
         {
            stock=false;
         }
        
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
         return stock;
    }

    public static boolean Transcation(String NIC, String Name, int Contact_No, String Email, String Time_Slot, String Date, String Nearest_Center, String Blood_Group) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

