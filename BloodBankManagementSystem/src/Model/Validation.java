/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class Validation
{
   // public static String inputEmail;
     public static boolean EmailValidation(String email)
     {
       boolean isvalid;
      String emailregex = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
      Pattern pattern = Pattern.compile(emailregex);
       Matcher matcher = pattern.matcher(email);
       if(matcher.matches()) 
       {
       isvalid=true;
       } 
       else 
       {
         isvalid=false;
       }
     return isvalid;
   }
 
}
