/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

//import javax.swing.JOptionPane;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class SelectedUser 
{
    public static String UserType;
    public static String NIC;
    public static String Password;
    public void selectIUsertype(String UserType)
    {
       Model.SelectedUser.UserType=UserType;
    } 
    public void selectAuthenification(String NIC,String Password)
    {
        Model.SelectedUser.NIC=NIC;
        Model.SelectedUser.Password=Password;
    }
    public String VerificationUser()
    {
        return UserType;
    }
    
    
}
