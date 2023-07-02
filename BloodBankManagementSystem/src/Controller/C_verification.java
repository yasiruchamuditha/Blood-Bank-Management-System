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
public class C_verification {

    public static boolean verification(String NIC,String q1, String q2, String q3)
    {
        boolean result;
        M_Verification v=new M_Verification();
        result=v.verification( NIC,q1,q2,q3);
        
        return result;
    }
    
}
