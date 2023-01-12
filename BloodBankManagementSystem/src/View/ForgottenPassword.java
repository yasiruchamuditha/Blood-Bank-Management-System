/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.*;
import Controller.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasiru
 */
public class ForgottenPassword extends javax.swing.JFrame {

    /**
     * Creates new form ForgottenPassword
     */
    public ForgottenPassword() {
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

        lbl_headline = new javax.swing.JLabel();
        lbl_NIC = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        lbl_confirmPassword = new javax.swing.JLabel();
        txt_NIC = new javax.swing.JTextField();
        txt_password = new javax.swing.JTextField();
        txt_ConfirmPassword = new javax.swing.JTextField();
        btn_submit = new javax.swing.JButton();
        lbl_logo = new javax.swing.JLabel();
        lbl_footer = new javax.swing.JLabel();
        lbl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_headline.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_headline.setText("Forgotten Password");
        getContentPane().add(lbl_headline, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 360, 70));

        lbl_NIC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_NIC.setText("NIC");
        getContentPane().add(lbl_NIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 40, -1));

        lbl_password.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_password.setText("New Password");
        getContentPane().add(lbl_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 110, -1));

        lbl_confirmPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_confirmPassword.setText("Re Enter New Password");
        getContentPane().add(lbl_confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 170, -1));
        getContentPane().add(txt_NIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 490, 50));
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 490, 50));
        getContentPane().add(txt_ConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 490, 50));

        btn_submit.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn_submit.setText("SUBMIT");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, 240, 70));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Logo_size_3.png"))); // NOI18N
        getContentPane().add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, 50, 60));

        lbl_footer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_footer.setText("National Blood Bank @ National Blood Transfusion Service");
        getContentPane().add(lbl_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, 450, 40));

        lbl_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/securityquestions.png"))); // NOI18N
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        String NIC,Password,ConfirmPassword,UserType;
        boolean result;
        NIC=txt_NIC.getText();
        Password=txt_password.getText();
        ConfirmPassword=txt_ConfirmPassword.getText();
        if(Password.equals(ConfirmPassword))
        {
           // C_ForgottenPassword  p=new C_ForgottenPassword();
            result=C_ForgottenPassword.ForgottenPassword(NIC, Password);
             if(result==true)
             {
                 JOptionPane.showMessageDialog(null, "Password Updated ,Please Log In");
                 V_MainLogin_window m=new V_MainLogin_window();
                 m.setVisible(true);
                 this.setVisible(false);
             }
             else
             {
                 JOptionPane.showMessageDialog(null, "Some issue Occured,Please Try Again");
                 V_MainLogin_window m=new V_MainLogin_window();
                 m.setVisible(true);
                 this.setVisible(false);
             }
          
        }
        else
        {
            JOptionPane.showMessageDialog(null, "ReEnter Correct New Password");
        }
    }//GEN-LAST:event_btn_submitActionPerformed

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
            java.util.logging.Logger.getLogger(ForgottenPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgottenPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgottenPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgottenPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgottenPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
    private javax.swing.JLabel lbl_NIC;
    private javax.swing.JLabel lbl_confirmPassword;
    private javax.swing.JLabel lbl_footer;
    private javax.swing.JLabel lbl_headline;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JTextField txt_ConfirmPassword;
    private javax.swing.JTextField txt_NIC;
    private javax.swing.JTextField txt_password;
    // End of variables declaration//GEN-END:variables
}
