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

public class M_Donation 
{
    public static boolean Donation(String Donor_NIC,String Donor_Name,String Date, String Time,String Blood_Group,String Body_Weight,String Blood_Glucose_Level,String Blood_Pressure,String Body_Temperature,String Donated_Place,int No_Of_Bags,String Weight_Of_Bags,String Incharge_Officer_Id)
    {
           boolean isSucces=false;
        try
        {
            
        Statement st=dbConnection.createDbConnection().createStatement();
        int row_count=st.executeUpdate("insert into Donation values('"+Donor_NIC+"','"+Donor_Name+"','"+Date+"','"+Time+"','"+Blood_Group+"','"+Body_Weight+"','"+Blood_Glucose_Level+"','"+Blood_Pressure+"','"+Body_Temperature+"','"+Donated_Place+"','"+No_Of_Bags+"','"+Weight_Of_Bags+"','"+Incharge_Officer_Id+"')");
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
    
    
    public static boolean updateStockDonation(int No_Of_Bags, String Blood_Group) 
    {
           boolean stock=false;
        try
        {
            
        Statement st=dbConnection.createDbConnection().createStatement();
        int row_count=st.executeUpdate("update storage set No_Of_Bags=(No_Of_Bags+'"+No_Of_Bags+"') where Blood_Group='"+Blood_Group+"'");
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
}
