/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;

public class C_Donor_Registration 
{
     public static boolean DonorRegistration(String NIC,String Name,String DOB,int Age,String Gender,String BloodGroup,String Address ,int Contact_No,String Email,String Password)
      {
        boolean istrue;
        //MDonorRegistration m1=new M_Donor_Registration();
        istrue=M_Donor_Registration.DonorRegistration(NIC, Name, DOB, Age, Gender, BloodGroup, Address, Contact_No, Email, Password);
        return istrue;
     }     
}
