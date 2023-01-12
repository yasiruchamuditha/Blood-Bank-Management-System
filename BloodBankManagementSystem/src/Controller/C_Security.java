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
public class C_Security {

    public static boolean SecurityQuestions(String NIC, String Question1, String Question2, String Question3) 
    {
        boolean result;
        //M_Security m=new M_Security();
        result=M_Security.SecurityQuestions(NIC,Question1,Question2,Question3);
        return result;
    }
    
}
