/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.C_Appointment;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class V_Appointment_Organization extends javax.swing.JFrame {

    /**
     * Creates new form V_Appointment_Organization
     */
    public V_Appointment_Organization() {
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

        lbl_Headline = new javax.swing.JLabel();
        lbl_Registration_No = new javax.swing.JLabel();
        lbl_OrganizationName = new javax.swing.JLabel();
        lbl_PreferedDate = new javax.swing.JLabel();
        lbl_MOHLINKED = new javax.swing.JLabel();
        txt_RegNo = new javax.swing.JTextField();
        txt_OrganizationName = new javax.swing.JTextField();
        txt_MOHLinked = new javax.swing.JTextField();
        btn_Submit = new javax.swing.JButton();
        lbl_Footer = new javax.swing.JLabel();
        lbl_ContactNo = new javax.swing.JLabel();
        txt_ContactNo = new javax.swing.JTextField();
        DatePickerDate = new org.jdesktop.swingx.JXDatePicker();
        lbl_logo = new javax.swing.JLabel();
        lbl_Back = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Headline.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_Headline.setText("Appointment  For Mobile Camp");
        getContentPane().add(lbl_Headline, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 550, 50));

        lbl_Registration_No.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Registration_No.setText("Registration No");
        getContentPane().add(lbl_Registration_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        lbl_OrganizationName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_OrganizationName.setText("Organization Name");
        getContentPane().add(lbl_OrganizationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        lbl_PreferedDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_PreferedDate.setText("Prefered Date");
        getContentPane().add(lbl_PreferedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        lbl_MOHLINKED.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_MOHLINKED.setText("MOH Linked");
        getContentPane().add(lbl_MOHLINKED, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 100, 20));
        getContentPane().add(txt_RegNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 480, 40));
        getContentPane().add(txt_OrganizationName, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 480, 40));
        getContentPane().add(txt_MOHLinked, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 480, 40));

        btn_Submit.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_Submit.setText("SUBMIT");
        btn_Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, -1, -1));

        lbl_Footer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Footer.setText("National Blood Bank @ National Blood Transfusion Service");
        getContentPane().add(lbl_Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, 410, -1));

        lbl_ContactNo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_ContactNo.setText("Contact No");
        getContentPane().add(lbl_ContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, -1, -1));
        getContentPane().add(txt_ContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 480, 40));
        getContentPane().add(DatePickerDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 480, 40));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Logo_size_3.png"))); // NOI18N
        getContentPane().add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, 50, 50));

        lbl_Back.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_Back.setText("Back");
        lbl_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_BackMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, 100, 70));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, -1, -1));

        lbl_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/AppointmentOrganizations.png"))); // NOI18N
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SubmitActionPerformed
        // TODO add your handling code here:
        String Reg_No,Organization_Name,Date,MOH;
        int Contact_No;
        boolean result;
        Reg_No=txt_RegNo.getText();
        Organization_Name=txt_OrganizationName.getText();
        //create object in adte class and get value feon date picker
        Date Date1=DatePickerDate.getDate();
        //create object in date format class and call SimpleDateFormat method
        DateFormat dformat=new SimpleDateFormat("yyyy-MM-dd");
        //assign formated date to dob variable
        Date=dformat.format(Date1);
        MOH=txt_MOHLinked.getText();
        Contact_No=Integer.parseInt(txt_ContactNo.getText());
        
         C_Appointment ca=new C_Appointment();
        result=C_Appointment.Appointment_Organization(Reg_No, Organization_Name, Date, MOH, Contact_No);
        
        if(result==true)
        {
                 JOptionPane.showMessageDialog(null, "Your Appointment is Created,Our officer contact You for futher Details");
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
        
    }//GEN-LAST:event_btn_SubmitActionPerformed

    private void lbl_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_BackMouseClicked
        // TODO add your handling code here:
        V_Home_page t=new V_Home_page();
        t.setVisible(true);
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
            java.util.logging.Logger.getLogger(V_Appointment_Organization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Appointment_Organization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Appointment_Organization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Appointment_Organization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Appointment_Organization().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker DatePickerDate;
    private javax.swing.JButton btn_Submit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_Back;
    private javax.swing.JLabel lbl_ContactNo;
    private javax.swing.JLabel lbl_Footer;
    private javax.swing.JLabel lbl_Headline;
    private javax.swing.JLabel lbl_MOHLINKED;
    private javax.swing.JLabel lbl_OrganizationName;
    private javax.swing.JLabel lbl_PreferedDate;
    private javax.swing.JLabel lbl_Registration_No;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JTextField txt_ContactNo;
    private javax.swing.JTextField txt_MOHLinked;
    private javax.swing.JTextField txt_OrganizationName;
    private javax.swing.JTextField txt_RegNo;
    // End of variables declaration//GEN-END:variables
}
