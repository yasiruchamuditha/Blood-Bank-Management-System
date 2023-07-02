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

public class C_MedicalStaff_Registration 
{
    public static boolean MedicalStaffRegistration(String NIC,String Name,int Contact_No,String Address,String Gender,String Blood_Group,String Linked_Branch,String Department,String Email,String Password)
    {
        boolean istrue;
        //M_MedicalStaff_Registration ms=new M_MedicalStaff_Registration();
        istrue=M_MedicalStaff_Registration.MedicalStaffRegistration(NIC, Name, Contact_No, Address, Gender, Blood_Group, Linked_Branch,Department, Email, Password);
        return istrue;
    }
    
}
