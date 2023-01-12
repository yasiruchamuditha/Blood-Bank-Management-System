/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.M_Transcation;
/**
 *
 * @author Yasiru
 */
public class C_Transcation 
{
    public static boolean Transcation(String Patient_NIC,String Patient_Name,int Patient_Contact_No,String Date,String Time,String Blood_Group,float Weight_Of_Blood,int No_Of_Bags,String Hospital_Linked,String Incharge_Officer_ID)
    {
         boolean result;
         //M_Transcation tr=new M_Transcation();
         result=M_Transcation.Transcation(Patient_NIC, Patient_Name, Patient_Contact_No, Date, Time, Blood_Group, Weight_Of_Blood, No_Of_Bags, Hospital_Linked, Incharge_Officer_ID);
        
        return result;
    }
    
     public static boolean updateStockTranscation(int No_Of_Bags, String Blood_Group) 
    {
        boolean stock ;
        //M_Transcation d1=new M_Transcation();
        stock= M_Transcation.updateStockTranscation(No_Of_Bags,Blood_Group);
          return stock;
    }
    
}
