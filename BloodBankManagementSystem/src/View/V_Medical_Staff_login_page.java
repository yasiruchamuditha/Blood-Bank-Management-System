/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.*;
import Model.*;
import javax.swing.JOptionPane;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class V_Medical_Staff_login_page extends javax.swing.JFrame {

    /**
     * Creates new form Medical_Staff_login_page
     */
    public V_Medical_Staff_login_page() {
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

        lbl_loginheadline = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        lbl_fogottenPassword = new javax.swing.JLabel();
        lbl_Display1 = new javax.swing.JLabel();
        btn_SignIn = new javax.swing.JButton();
        txt_Musername = new javax.swing.JTextField();
        pf_Mpassword = new javax.swing.JPasswordField();
        lbl_SignUp = new javax.swing.JLabel();
        lbl_headline1 = new javax.swing.JLabel();
        lbl_headline2 = new javax.swing.JLabel();
        lbl_footer1 = new javax.swing.JLabel();
        lbl_footer2 = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_loginheadline.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lbl_loginheadline.setText("LOG IN");
        getContentPane().add(lbl_loginheadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 213, 100));

        lbl_username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/usernameicon.png"))); // NOI18N
        getContentPane().add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, -1, -1));

        lbl_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/passwordicon.png"))); // NOI18N
        lbl_password.setText("jLabel3");
        getContentPane().add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 61, -1));

        lbl_fogottenPassword.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        lbl_fogottenPassword.setText("Forgotten Password ?");
        lbl_fogottenPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_fogottenPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_fogottenPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 287, -1));

        lbl_Display1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Display1.setText("Don't have an Account ?");
        getContentPane().add(lbl_Display1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 600, 221, -1));

        btn_SignIn.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn_SignIn.setText("SIGN IN");
        btn_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignInActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, -1, -1));

        txt_Musername.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txt_Musername, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 320, 40));

        pf_Mpassword.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(pf_Mpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 320, 40));

        lbl_SignUp.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_SignUp.setText("SIGN UP");
        lbl_SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_SignUpMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 630, 152, -1));

        lbl_headline1.setFont(new java.awt.Font("Pristina", 1, 75)); // NOI18N
        lbl_headline1.setText("WORK HARD\n");
        getContentPane().add(lbl_headline1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 470, 99));

        lbl_headline2.setFont(new java.awt.Font("Viner Hand ITC", 1, 65)); // NOI18N
        lbl_headline2.setText("SAVE LIFE");
        getContentPane().add(lbl_headline2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 384, -1));

        lbl_footer1.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        lbl_footer1.setText("National Blood Bank");
        getContentPane().add(lbl_footer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 407, 69));

        lbl_footer2.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        lbl_footer2.setText("@National Blood Transfusion Service");
        getContentPane().add(lbl_footer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 478, 82));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Logo_size_3.png"))); // NOI18N
        getContentPane().add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 50, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Medical_stuff_login_wallpaper.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignInActionPerformed
        // TODO add your handling code here:
        String NIC,Password;
        boolean value;
        NIC=txt_Musername.getText();
        Password=pf_Mpassword.getText();
        SelectedUser su=new SelectedUser();
        su.selectAuthenification(NIC, Password);
        C_MedicalStaff_Login ms=new C_MedicalStaff_Login();
        value=C_MedicalStaff_Login.MedicalStaffLogin(NIC, Password);
        if(value==true)
        {
           V_home_admin n=new V_home_admin();
             n.setVisible(true);
             this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Try Again Shortly!!!!");
        }
    }//GEN-LAST:event_btn_SignInActionPerformed

    private void lbl_SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_SignUpMouseClicked
        // TODO add your handling code here:
        V_MedicalStuff_SignUp_Page ms=new V_MedicalStuff_SignUp_Page();
        ms.setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_lbl_SignUpMouseClicked

    private void lbl_fogottenPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_fogottenPasswordMouseClicked
        // TODO add your handling code here:
        VerificationPage v=new VerificationPage();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_fogottenPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(V_Medical_Staff_login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Medical_Staff_login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Medical_Staff_login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Medical_Staff_login_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new V_Medical_Staff_login_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SignIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_Display1;
    private javax.swing.JLabel lbl_SignUp;
    private javax.swing.JLabel lbl_fogottenPassword;
    private javax.swing.JLabel lbl_footer1;
    private javax.swing.JLabel lbl_footer2;
    private javax.swing.JLabel lbl_headline1;
    private javax.swing.JLabel lbl_headline2;
    private javax.swing.JLabel lbl_loginheadline;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField pf_Mpassword;
    private javax.swing.JTextField txt_Musername;
    // End of variables declaration//GEN-END:variables
}
