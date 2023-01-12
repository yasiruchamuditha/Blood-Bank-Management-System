/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import com.sun.mail.imap.IMAPMessage;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Mail 
{
        public  void sendMail() throws MessagingException 
    {
       // JOptionPane.showMessageDialog(null,"Sent message successfully....");
     // Recipient's email ID needs to be mentioned.
      String to = "yasiruchamuditha99@gmail.com";
       String Emailpassword="kblegolqwgdniizr";

      // Sender's email ID needs to be mentioned
      String from = "bloodbank99educationalpurposes@gmail.com";
      

      // Assuming you are sending email through relay.jangosmtp.net
      //String host = "relay.jangosmtp.net";

        Properties props = new Properties();
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port", "465");
        props.put("mail.smtp.user","bloodbank99educationalpurposes@gmail.com");
        props.put("mail.smtp.auth","true");
        props.put("email.smtp.starttls.enable","true");
        props.put("mail.smtp.debug","true");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.socketFactory.fallback", "false");
      try {
          // Get the Session object.
          Session session = Session.getDefaultInstance(props ,null);
          session.setDebug(true);
          MimeMessage message=new MimeMessage(session);
          message.setText("Your Password is hi");
          message.setSubject("Test");
          message.setFrom(new InternetAddress("bloodbank99educationalpurposes@gmail.com"));
          message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
          message.saveChanges();
          Transport transport=session.getTransport("smtp");
          transport.connect(from, Emailpassword);
          transport.sendMessage(message, message.getAllRecipients());
          transport.close();
          JOptionPane.showMessageDialog(null, "Delivered");
          
            }
            catch (MessagingException e) 
             {
                   throw new RuntimeException(e);
             }
          
          
        /**  
         new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(from, Emailpassword);
	   }
         });


	   // Create a default MimeMessage object.
	   Message message = new MimeMessage(session);
	
	   // Set From: header field of the header.
	   message.setFrom(new InternetAddress(from));
	
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

	         JOptionPane.showMessageDialog(null,"Sent message successfully....");

      } catch (MessagingException e) {
         throw new RuntimeException(e);
      }
   }

    private void InternetAddress(String bloodbank99educationalpurposesgmailcom) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
       
        **/
    }
       
}
