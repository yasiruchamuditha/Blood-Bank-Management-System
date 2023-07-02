/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import Model.*;

/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class V_Donor_signUp_page extends javax.swing.JFrame {

    /**
     * Creates new form V_Donor_signUp_page
     */
    public V_Donor_signUp_page() {
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

        lbl_MainHeading = new javax.swing.JLabel();
        lbl_subheading = new javax.swing.JLabel();
        lbl_subheading2 = new javax.swing.JLabel();
        lbl_NIC = new javax.swing.JLabel();
        lbl_Name = new javax.swing.JLabel();
        lbl_DOB = new javax.swing.JLabel();
        lbl_age = new javax.swing.JLabel();
        lbl_Gender = new javax.swing.JLabel();
        lbl_BloodGroup = new javax.swing.JLabel();
        lbl_Email = new javax.swing.JLabel();
        txt_Email = new javax.swing.JTextField();
        lbl_Password = new javax.swing.JLabel();
        txt_Password = new javax.swing.JTextField();
        lbl_ConfirmPassword = new javax.swing.JLabel();
        txt_Confirm_Password = new javax.swing.JTextField();
        lbl_Address = new javax.swing.JLabel();
        txt_NIC = new javax.swing.JTextField();
        txt_Name = new javax.swing.JTextField();
        txt_Contact_no = new javax.swing.JTextField();
        txt_Age = new javax.swing.JTextField();
        DatePickerDOB = new org.jdesktop.swingx.JXDatePicker();
        rb_Male = new javax.swing.JRadioButton();
        rb_Female = new javax.swing.JRadioButton();
        cmb_BloodGroup = new javax.swing.JComboBox<>();
        lbl_ContactNo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_Address = new javax.swing.JTextArea();
        lbl_Footer = new javax.swing.JLabel();
        lbl_Logo = new javax.swing.JLabel();
        CheckBoxTermsAgree = new javax.swing.JCheckBox();
        lbl_TermsandConditions = new javax.swing.JLabel();
        btn_Register = new javax.swing.JButton();
        lbl_AccountsignIn = new javax.swing.JLabel();
        panel_background = new javax.swing.JPanel();
        lbl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1400, 750));
        setMinimumSize(new java.awt.Dimension(1400, 750));
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_MainHeading.setFont(new java.awt.Font("Goudy Old Style", 1, 55)); // NOI18N
        lbl_MainHeading.setText("Registration");
        getContentPane().add(lbl_MainHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 6, 270, -1));

        lbl_subheading.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_subheading.setText("Personal Details");
        getContentPane().add(lbl_subheading, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 205, -1));

        lbl_subheading2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbl_subheading2.setText("Account Authentication");
        getContentPane().add(lbl_subheading2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 80, 270, -1));

        lbl_NIC.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_NIC.setText("NIC Number");
        getContentPane().add(lbl_NIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 100, -1));

        lbl_Name.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_Name.setText("Name");
        getContentPane().add(lbl_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 90, -1));

        lbl_DOB.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_DOB.setText("DOB");
        getContentPane().add(lbl_DOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 70, -1));

        lbl_age.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_age.setText("Age");
        getContentPane().add(lbl_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 50, -1));

        lbl_Gender.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_Gender.setText("Gender");
        getContentPane().add(lbl_Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 70, -1));

        lbl_BloodGroup.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_BloodGroup.setText("Blood Group");
        getContentPane().add(lbl_BloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 100, -1));

        lbl_Email.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_Email.setText("Email");
        getContentPane().add(lbl_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 130, 43, -1));

        txt_Email.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 160, 420, 40));

        lbl_Password.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_Password.setText("Password");
        getContentPane().add(lbl_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 220, 70, -1));

        txt_Password.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 250, 420, 40));

        lbl_ConfirmPassword.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_ConfirmPassword.setText("Confirm Password");
        getContentPane().add(lbl_ConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 320, 140, -1));

        txt_Confirm_Password.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txt_Confirm_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 420, 40));

        lbl_Address.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_Address.setText("Address");
        getContentPane().add(lbl_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, 60, -1));

        txt_NIC.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txt_NIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 410, 40));

        txt_Name.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txt_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 410, 40));

        txt_Contact_no.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txt_Contact_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 410, 40));

        txt_Age.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txt_Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 410, 40));
        getContentPane().add(DatePickerDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 410, 30));

        rb_Male.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rb_Male.setText("Male");
        getContentPane().add(rb_Male, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 100, -1));

        rb_Female.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rb_Female.setText("Female");
        getContentPane().add(rb_Female, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 120, -1));

        cmb_BloodGroup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmb_BloodGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        getContentPane().add(cmb_BloodGroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 410, -1));

        lbl_ContactNo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbl_ContactNo.setText("Contact No");
        getContentPane().add(lbl_ContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 600, 90, -1));

        txtA_Address.setColumns(20);
        txtA_Address.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtA_Address.setRows(5);
        jScrollPane1.setViewportView(txtA_Address);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 410, 70));

        lbl_Footer.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        lbl_Footer.setText("National Blood Bank  @ National Blood Transfusion Service");
        getContentPane().add(lbl_Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 680, 450, -1));

        lbl_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Logo_size_3.png"))); // NOI18N
        getContentPane().add(lbl_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 660, 50, 50));

        CheckBoxTermsAgree.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CheckBoxTermsAgree.setText("I Agreed to Terms and Conditions.");
        getContentPane().add(CheckBoxTermsAgree, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 430, 350, -1));

        lbl_TermsandConditions.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        lbl_TermsandConditions.setText("Terms and Conditions");
        lbl_TermsandConditions.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_TermsandConditionsMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_TermsandConditions, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 490, 300, -1));

        btn_Register.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_Register.setText("REGISTER");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 550, 180, 60));

        lbl_AccountsignIn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_AccountsignIn.setText("Already have an Account ? SIGN IN");
        lbl_AccountsignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_AccountsignInMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_AccountsignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 630, 330, -1));

        panel_background.setBackground(new java.awt.Color(186, 183, 214));
        panel_background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Donor_SignUp_wallpaper.png"))); // NOI18N
        panel_background.add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 750));

        getContentPane().add(panel_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 750));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        // TODO add your handling code here:
          try
        {
        boolean value,evalid;
        int Contact_No,Age;
        String NIC,Name,Address,DOB,BloodGroup,Gender,Email,Password,Confirm_Password;
        NIC=txt_NIC.getText();
        Name=txt_Name.getText();
        //create object in adte class and get value feon date picker
        Date date_of_birth=DatePickerDOB.getDate();
        //create object in date format class and call SimpleDateFormat method
        DateFormat dformat=new SimpleDateFormat("yyyy-MM-dd");
        //assign formated date to dob variable
        DOB=dformat.format(date_of_birth);
        Age=Integer.parseInt(txt_Age.getText());
         if(rb_Male.isSelected())
        {
            Gender="M";
        }
        else
        {
            Gender="F";
        }
        BloodGroup=cmb_BloodGroup.getSelectedItem().toString();   
        Address=txtA_Address.getText();
        Contact_No=Integer.parseInt(txt_Contact_no.getText());
        Email=txt_Email.getText();
        Password=txt_Password.getText();
        Confirm_Password=txt_Confirm_Password.getText();
        
        Validation v=new Validation();
        evalid= Validation.EmailValidation(Email);
        if(evalid==true)
        {
             if(Password.equals(Confirm_Password))
             {
                  if(this.CheckBoxTermsAgree.isSelected())
                  {
                        //CDonorRegistration c1=new C_Donor_Registration();
                        value = C_Donor_Registration.DonorRegistration(NIC, Name, DOB, Age, Gender, BloodGroup, Address, Contact_No, Email, Password);
                        if(value==true)
                                {
                                  V_Donor_login_page h1=new V_Donor_login_page();
                                  h1.setVisible(true);
                                  this.setVisible(false);
                                }
                                else
                                {
                                  JOptionPane.showMessageDialog(null, "Please try again Shortly.. ");
                                }
                  }
                  else
                  {
                    JOptionPane.showMessageDialog(null,"Please Agree to Terms and Conditions");
                  }
              
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"Please Enter Password Correctly Again");
             }
        
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please enter valid email");
        }
      
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_RegisterActionPerformed

    private void lbl_TermsandConditionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_TermsandConditionsMouseClicked
        // TODO add your handling code here:
        V_TermsAndConditions ts=new V_TermsAndConditions();
        ts.setVisible(true);
    }//GEN-LAST:event_lbl_TermsandConditionsMouseClicked

    private void lbl_AccountsignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_AccountsignInMouseClicked
        // TODO add your handling code here:
        V_Donor_login_page lp=new V_Donor_login_page();
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbl_AccountsignInMouseClicked

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
            java.util.logging.Logger.getLogger(V_Donor_signUp_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Donor_signUp_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Donor_signUp_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Donor_signUp_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Donor_signUp_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxTermsAgree;
    private org.jdesktop.swingx.JXDatePicker DatePickerDOB;
    private javax.swing.JButton btn_Register;
    private javax.swing.JComboBox<String> cmb_BloodGroup;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_AccountsignIn;
    private javax.swing.JLabel lbl_Address;
    private javax.swing.JLabel lbl_BloodGroup;
    private javax.swing.JLabel lbl_ConfirmPassword;
    private javax.swing.JLabel lbl_ContactNo;
    private javax.swing.JLabel lbl_DOB;
    private javax.swing.JLabel lbl_Email;
    private javax.swing.JLabel lbl_Footer;
    private javax.swing.JLabel lbl_Gender;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JLabel lbl_MainHeading;
    private javax.swing.JLabel lbl_NIC;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_TermsandConditions;
    private javax.swing.JLabel lbl_age;
    private javax.swing.JLabel lbl_subheading;
    private javax.swing.JLabel lbl_subheading2;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JPanel panel_background;
    private javax.swing.JRadioButton rb_Female;
    private javax.swing.JRadioButton rb_Male;
    private javax.swing.JTextArea txtA_Address;
    private javax.swing.JTextField txt_Age;
    private javax.swing.JTextField txt_Confirm_Password;
    private javax.swing.JTextField txt_Contact_no;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_NIC;
    private javax.swing.JTextField txt_Name;
    private javax.swing.JTextField txt_Password;
    // End of variables declaration//GEN-END:variables
}
