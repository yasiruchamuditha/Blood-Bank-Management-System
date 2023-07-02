/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;
/**
 *
 * @author yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class C_Admin_Registration 
{
    public static boolean AdminRegistration(String NIC,String Name,int Contact_No,String Address,String Department,String Linked_Branch,String EmployeeID,String Email,String Password)
    {
        boolean istrue;
        //MAdminRegistration m1=new M_Admin_Registration();
        istrue=M_Admin_Registration.AdminRegistration(NIC, Name, Contact_No, Address, Department, Linked_Branch, EmployeeID, Email, Password);
        return istrue;
    }
}
