/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.*;

public class C_Admin_Login
{
    public static boolean  AdminLogin(String NIC,String Password)
    {
        boolean istrue;
        //MAdminLogin m1=new M_Admin_Login();
        istrue=M_Admin_Login.AdminLogin(NIC, Password);
        return istrue;
    }
}
