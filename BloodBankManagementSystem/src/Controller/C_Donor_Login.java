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
public class C_Donor_Login 
{
    public static boolean DonorLogin(String NIC,String Password)
    {
        boolean istrue;
        //MDonorLogin m1=new M_Donor_Login();
        istrue= M_Donor_Login.DonorLogin(NIC, Password);
        return istrue;
    }
}
