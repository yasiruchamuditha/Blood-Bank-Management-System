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
public class C_ForgottenPassword 
{
        public static boolean ForgottenPassword(String NIC, String Password)
        {
            boolean result;
            M_ForgottenPassword p=new M_ForgottenPassword();
            result= M_ForgottenPassword.ForgottenPassword(NIC, Password);
            return result;
        }

  
}
