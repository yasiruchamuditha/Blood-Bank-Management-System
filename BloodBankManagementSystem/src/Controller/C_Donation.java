/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.*;
/**
 *
 * @author Yasiru
 */
public class C_Donation
{
     public static boolean Donation(String Donor_NIC,String Donor_Name,String Date, String Time,String Blood_Group,String Body_Weight,String Blood_Glucose_Level,String Blood_Pressure,String Body_Temperature,String Donated_Place,int No_Of_Bags,String Weight_Of_Bags,String Incharge_Officer_Id)
    {
        boolean istrue;
        //M_Donation d=new M_Donation();
        istrue= M_Donation.Donation(Donor_NIC, Donor_Name, Date, Time, Blood_Group, Body_Weight, Blood_Glucose_Level, Blood_Pressure, Body_Temperature, Donated_Place, No_Of_Bags, Weight_Of_Bags, Incharge_Officer_Id); 
        return istrue;
    }


    public static boolean updateStockDonation(int No_Of_Bags, String Blood_Group) 
    {
        boolean stock ;
        // M_Donation d1=new M_Donation();
        stock= M_Donation.updateStockDonation(No_Of_Bags,Blood_Group);
          return stock;
    }
    
 
}
