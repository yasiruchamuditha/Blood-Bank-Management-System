/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import Controller.*;
import javax.swing.JOptionPane;
import Model.*;

/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class V_Appointment_Donor extends javax.swing.JFrame {

    /**
     * Creates new form V_Appointment_Donor
     */
    public V_Appointment_Donor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_NIC = new javax.swing.JLabel();
        lbl_Headline = new javax.swing.JLabel();
        lbl_Name = new javax.swing.JLabel();
        lbl_ContactNO = new javax.swing.JLabel();
        lbl_NearestCenter = new javax.swing.JLabel();
        lbl_TimeSlot = new javax.swing.JLabel();
        lbl_Date = new javax.swing.JLabel();
        lbl_Email = new javax.swing.JLabel();
        txt_NICNumber = new javax.swing.JTextField();
        txt_Name = new javax.swing.JTextField();
        txt_ContactNo = new javax.swing.JTextField();
        txt_NearestCenter = new javax.swing.JTextField();
        txt_Email = new javax.swing.JTextField();
        lbl_BloodGroup = new javax.swing.JLabel();
        cmb_BloodGroup = new javax.swing.JComboBox<>();
        cmbTimeSlot = new javax.swing.JComboBox<>();
        lbl_Logo = new javax.swing.JLabel();
        lbl_Footer = new javax.swing.JLabel();
        btn_Submit = new javax.swing.JButton();
        DatePickerDATE = new org.jdesktop.swingx.JXDatePicker();
        lbl_Back = new javax.swing.JLabel();
        lbl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1400, 750));
        setMinimumSize(new java.awt.Dimension(1400, 750));
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_NIC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_NIC.setText("NIC Number");
        getContentPane().add(lbl_NIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 100, -1));

        lbl_Headline.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_Headline.setText("Appointment - Donor");
        getContentPane().add(lbl_Headline, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 6, 390, 60));

        lbl_Name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Name.setText("Name");
        getContentPane().add(lbl_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 60, -1));

        lbl_ContactNO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_ContactNO.setText("Contact No");
        getContentPane().add(lbl_ContactNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 100, 20));

        lbl_NearestCenter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_NearestCenter.setText("Nearest Center");
        getContentPane().add(lbl_NearestCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 130, -1));

        lbl_TimeSlot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_TimeSlot.setText("Time Slot");
        getContentPane().add(lbl_TimeSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 90, -1));

        lbl_Date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Date.setText("Date");
        getContentPane().add(lbl_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, 60, -1));

        lbl_Email.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Email.setText("Email");
        getContentPane().add(lbl_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 60, 20));

        txt_NICNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txt_NICNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 400, 40));

        txt_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txt_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 400, 40));

        txt_ContactNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txt_ContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 400, 40));

        txt_NearestCenter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txt_NearestCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 310, 390, 40));

        txt_Email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 400, 40));

        lbl_BloodGroup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_BloodGroup.setText("Blood Group");
        getContentPane().add(lbl_BloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 100, -1));

        cmb_BloodGroup.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmb_BloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        getContentPane().add(cmb_BloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, 390, 40));

        cmbTimeSlot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbTimeSlot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "9.00 A.M - 10.00 A.M", "10.00 A.M - 11.00 A.M", "11.00 A.M - 12.00 P.M", "12.00 A.M - 1.00 P.M", "1.00 P.M -2.00 P.M", "2.00 P.M - 3.00 P.M", "3.00 P.M - 4.00 P.M", " " }));
        getContentPane().add(cmbTimeSlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, 390, 40));

        lbl_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Logo_size_3.png"))); // NOI18N
        getContentPane().add(lbl_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 660, -1, -1));

        lbl_Footer.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        lbl_Footer.setText("National Blood Bank @National Blood Transfusion Service");
        getContentPane().add(lbl_Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 680, 570, -1));

        btn_Submit.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_Submit.setText("SUBMIT");
        btn_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 300, 70));
        getContentPane().add(DatePickerDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 220, 390, 40));

        lbl_Back.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_Back.setText("Back");
        lbl_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_BackMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 640, 100, 90));

        lbl_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/AppointmentDonor.jpg"))); // NOI18N
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubmitActionPerformed
        // TODO add your handling code here:
        String NIC,Name,Email, Time_Slot, Date, Nearest_Center, Blood_Group;
        int Contact_No;
        boolean result,evalid;
        NIC=txt_NICNumber.getText();
        Name=txt_Name.getText();
        Contact_No=Integer.parseInt(txt_ContactNo.getText());
        Email=txt_Email.getText();
        Time_Slot=cmbTimeSlot.getSelectedItem().toString();
         //create object in adte class and get value feon date picker
        Date Date1=DatePickerDATE.getDate();
        //create object in date format class and call SimpleDateFormat method
        DateFormat dformat=new SimpleDateFormat("yyyy-MM-dd");
        //assign formated date to dob variable
        Date=dformat.format(Date1);
        Nearest_Center=txt_NearestCenter.getText();
        Blood_Group=cmb_BloodGroup.getSelectedItem().toString();
        
        Validation v=new Validation();
        evalid=Validation.EmailValidation(Email);
        
        C_Appointment ca=new C_Appointment();
        result=C_Appointment.Appointment_Donor(NIC, Name, Contact_No, Email, Time_Slot, Date, Nearest_Center, Blood_Group);
        
        if(evalid==true)
        {
             if(result==true)
               {
                 JOptionPane.showMessageDialog(null, "Your Appointment is Created,Please visit Center at Correct Time");
                 V_Home_page h=new V_Home_page();
                 h.setVisible(true);
                 this.setVisible(false);
               }
               else
               {
                JOptionPane.showMessageDialog(null, "Please Try again later");
                 V_Home_page h=new V_Home_page();
                 h.setVisible(true);
                 this.setVisible(false);
               }   
        }
        else
        {
             JOptionPane.showMessageDialog(null, "Please Enter Valid Email");
        }
        
       
        
    }//GEN-LAST:event_btn_SubmitActionPerformed

    private void lbl_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_BackMouseClicked
        // TODO add your handling code here:
        V_Home_page h=new V_Home_page();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_BackMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_Appointment_Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Appointment_Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Appointment_Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Appointment_Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Appointment_Donor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker DatePickerDATE;
    private javax.swing.JButton btn_Submit;
    private javax.swing.JComboBox<String> cmbTimeSlot;
    private javax.swing.JComboBox<String> cmb_BloodGroup;
    private javax.swing.JLabel lbl_Back;
    private javax.swing.JLabel lbl_BloodGroup;
    private javax.swing.JLabel lbl_ContactNO;
    private javax.swing.JLabel lbl_Date;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_Footer;
    private javax.swing.JLabel lbl_Headline;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_NIC;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_NearestCenter;
    private javax.swing.JLabel lbl_TimeSlot;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JTextField txt_ContactNo;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_NICNumber;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_NearestCenter;
    // End of variables declaration//GEN-END:variables
}
