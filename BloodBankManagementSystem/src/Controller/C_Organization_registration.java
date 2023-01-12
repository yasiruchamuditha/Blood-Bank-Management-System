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
public class C_Organization_registration 
{
    public static boolean OrganizationRegistration(String RegNo,String Name,int OrganizationalContact_No,int faxNo,String Address,String Member_Name, int MemberContact_No,String MemberEmail,String OrganizationalEmail,String Password)
    {
        boolean istrue;
       //M_Organization_Registration or=new M_Organization_Registration();
       istrue=M_Organization_Registration.OrganizationRegistration(RegNo, Name, OrganizationalContact_No, faxNo, Address, Member_Name, MemberContact_No, MemberEmail, OrganizationalEmail, Password);
        return istrue;
    }
    
}
