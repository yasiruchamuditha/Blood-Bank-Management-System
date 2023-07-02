/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class C_Appointment 
{
     public static boolean Appointment_Donor(String NIC,String Name,int Contact_No,String Email,String Time_Slot,String Date,String Nearest_Center,String Blood_Group)
    {
         boolean result;
         result=M_Appointment.Appointment_Donor(NIC,Name,Contact_No,Email, Time_Slot, Date, Nearest_Center, Blood_Group);
        
        return result;
    }
     


    public static boolean Appointment_Organization(String Reg_No, String Organization_Name, String Date, String MOH, int Contact_No)
    {
         boolean result;
         result=M_Appointment.Appointment_Organization(Reg_No,Organization_Name,Date,MOH,Contact_No);
        
         return result;
    }
}
