/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Yasiru
 */
public class V_Admin_logIn_page extends javax.swing.JFrame {

    /**
     * Creates new form Admin_logIn_page
     */
    public V_Admin_logIn_page() {
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

        lbl_DisplayLogin = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_forgottenPassword = new javax.swing.JLabel();
        txt_ANIC = new javax.swing.JTextField();
        pf_Apassword = new javax.swing.JPasswordField();
        btn_SignIn = new javax.swing.JButton();
        lbl_password = new javax.swing.JLabel();
        lbl_signup = new javax.swing.JLabel();
        lbl_footer2 = new javax.swing.JLabel();
        lbl_accountStatus = new javax.swing.JLabel();
        lbl_footer1 = new javax.swing.JLabel();
        lbl_headline1 = new javax.swing.JLabel();
        lbl_headline3 = new javax.swing.JLabel();
        lbl_headline2 = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        lbl_Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_DisplayLogin.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lbl_DisplayLogin.setText("LOG IN");
        getContentPane().add(lbl_DisplayLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 60, 230, 100));

        lbl_username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/usernameicon.png"))); // NOI18N
        getContentPane().add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 220, 50, 50));

        lbl_forgottenPassword.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        lbl_forgottenPassword.setText("Forgotten Password ?");
        lbl_forgottenPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_forgottenPasswordMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_forgottenPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, 280, -1));

        txt_ANIC.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(txt_ANIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 220, 300, 50));

        pf_Apassword.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        getContentPane().add(pf_Apassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 300, 50));

        btn_SignIn.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btn_SignIn.setText("SIGN IN");
        btn_SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SignInActionPerformed(evt);
            }
        });
        getContentPane().add(btn_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 450, 220, 70));

        lbl_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/passwordicon.png"))); // NOI18N
        getContentPane().add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 60, 60));

        lbl_signup.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_signup.setText("SIGN UP");
        lbl_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_signupMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 150, -1));

        lbl_footer2.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        lbl_footer2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_footer2.setText("@National Blood Transfusion Service");
        getContentPane().add(lbl_footer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 450, 70));

        lbl_accountStatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_accountStatus.setText("Don't Have An Account");
        getContentPane().add(lbl_accountStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, -1, -1));

        lbl_footer1.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        lbl_footer1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_footer1.setText("National Blood Bank");
        getContentPane().add(lbl_footer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, -1, -1));

        lbl_headline1.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lbl_headline1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_headline1.setText("LET'S  MAKE");
        getContentPane().add(lbl_headline1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        lbl_headline3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_headline3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_headline3.setText("FUTURE TOGETHER");
        getContentPane().add(lbl_headline3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        lbl_headline2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_headline2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_headline2.setText("A");
        getContentPane().add(lbl_headline2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 40, 60));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Logo_size_3.png"))); // NOI18N
        getContentPane().add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 50, 50));

        lbl_Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Admin_Login_wallpaper.png"))); // NOI18N
        getContentPane().add(lbl_Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SignInActionPerformed
        
        boolean value;
        String NIC,Password;
        NIC=txt_ANIC.getText();
        Password=pf_Apassword.getText();
        //CAdminLogin c1=new C_Admin_Login();
        value=C_Admin_Login.AdminLogin(NIC, Password);
        
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

    private void lbl_signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_signupMouseClicked
        // TODO add your handling code here:
        V_Admin_SignUp_Page al=new V_Admin_SignUp_Page();
        al.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_signupMouseClicked

    private void lbl_forgottenPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_forgottenPasswordMouseClicked
        // TODO add your handling code here:
         VerificationPage v=new VerificationPage();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_forgottenPasswordMouseClicked

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
            java.util.logging.Logger.getLogger(V_Admin_logIn_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Admin_logIn_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Admin_logIn_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Admin_logIn_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Admin_logIn_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_SignIn;
    private javax.swing.JLabel lbl_Background;
    private javax.swing.JLabel lbl_DisplayLogin;
    private javax.swing.JLabel lbl_accountStatus;
    private javax.swing.JLabel lbl_footer1;
    private javax.swing.JLabel lbl_footer2;
    private javax.swing.JLabel lbl_forgottenPassword;
    private javax.swing.JLabel lbl_headline1;
    private javax.swing.JLabel lbl_headline2;
    private javax.swing.JLabel lbl_headline3;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_signup;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField pf_Apassword;
    private javax.swing.JTextField txt_ANIC;
    // End of variables declaration//GEN-END:variables
}