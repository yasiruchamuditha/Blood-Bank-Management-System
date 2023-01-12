/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;


public class C_MedicalStaff_Login 
{
      public static boolean MedicalStaffLogin(String NIC,String Password)
    {
        boolean istrue;
        //M_MedicalStaff_Login m1=new M_MedicalStaff_Login();
        istrue=M_MedicalStaff_Login.MedicalStaffLogin(NIC, Password);
        return istrue;
    }
}
