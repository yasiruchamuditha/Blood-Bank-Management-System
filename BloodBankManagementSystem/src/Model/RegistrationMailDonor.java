/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
//import static java.util.Date.from;
import java.util.Properties;
import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class RegistrationMailDonor
{
    public static void sendMail() 
    {
        //create properties field
        Properties properties=new Properties();
        
        properties.put("mail.smtp.auth","true");
        properties.put("email.smtp.starttls.enable","true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        String EmailAccount="bloodbank99educationalpurposes@gmail.com";
        String to="yasiruchamudithawijesinghe@gmail.com";
        String Emailpassword="kblegolqwgdniizr";
        
        Session session=Session.getInstance(properties,new Authenticator()
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() 
            {
                return new PasswordAuthentication(EmailAccount,Emailpassword); 
            } 
        });
     
         try 
         {
	   // Create a default MimeMessage object.
	   Message message = new MimeMessage(session);
	
	   // Set From: header field of the header.
	   message.setFrom(new InternetAddress(to));
	
	   // Set To: header field of the header.
	   message.setRecipients(Message.RecipientType.TO,
               InternetAddress.parse(to));
	
	   // Set Subject: header field
	   message.setSubject("Testing Subject");
	
	   // Now set the actual message
	   message.setText("Hello, this is sample for to check send " +
		"email using JavaMailAPI ");

	   // Send message
	   Transport.send(message);

	   System.out.println("Sent message successfully....");

      } catch (MessagingException e) {
         throw new RuntimeException(e);
      }
    }  
            
}
