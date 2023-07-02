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
public class C_Organization_Login 
{
      public static boolean OrganizationalLogin(String RegNo,String Password)
    {
        boolean istrue;
         //M_Organizational_Login ol=new M_Organizational_Login();
         istrue=M_Organizational_Login.OrganizationalLogin(RegNo, Password);
        return istrue;
    }
}
