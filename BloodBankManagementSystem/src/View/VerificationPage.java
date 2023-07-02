/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.*;
import Controller.*;
import javax.swing.JOptionPane;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class VerificationPage extends javax.swing.JFrame {

    /**
     * Creates new form VerificationPage
     */
    public VerificationPage() {
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

        lbl_verification = new javax.swing.JLabel();
        lbl_display = new javax.swing.JLabel();
        lbl_q1 = new javax.swing.JLabel();
        lbl_q2 = new javax.swing.JLabel();
        lbl_q3 = new javax.swing.JLabel();
        txt_q1 = new javax.swing.JTextField();
        txt_q2 = new javax.swing.JTextField();
        txt_q3 = new javax.swing.JTextField();
        btnVerify = new javax.swing.JButton();
        lbl_NIC = new javax.swing.JLabel();
        txt_NIC = new javax.swing.JTextField();
        lbl_logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_verification.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_verification.setText("Verification");
        getContentPane().add(lbl_verification, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 210, 40));

        lbl_display.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_display.setText("Please provide correct Security Question Answers to Verify Your account");
        getContentPane().add(lbl_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        lbl_q1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_q1.setText("Your First Pet Name ?");
        getContentPane().add(lbl_q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        lbl_q2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_q2.setText("Your First School?");
        getContentPane().add(lbl_q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        lbl_q3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_q3.setText("Your Mothers Middle Name?");
        getContentPane().add(lbl_q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        txt_q1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txt_q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 400, 40));

        txt_q2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txt_q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 400, 40));

        txt_q3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txt_q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 400, 40));

        btnVerify.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnVerify.setText("Verify");
        btnVerify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerifyActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 180, 60));

        lbl_NIC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_NIC.setText("NIC");
        getContentPane().add(lbl_NIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));
        getContentPane().add(txt_NIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 400, 40));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/securityquestions.png"))); // NOI18N
        getContentPane().add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerifyActionPerformed
        // TODO add your handling code here:
        String q1,q2,q3,NIC;
        boolean result;
        NIC=txt_NIC.getText();
        q1=txt_q1.getText();
        q2=txt_q2.getText();
        q3=txt_q3.getText();
        C_verification c=new C_verification();
       result= C_verification.verification(NIC, q1, q2, q3);
       if(result==true)
       {
           JOptionPane.showMessageDialog(null, "successfull answerd");
           ForgottenPassword p=new ForgottenPassword();
           p.setVisible(true);
           this.setVisible(false);
       }
       else
       {
               JOptionPane.showMessageDialog(null, "not succesfull answerd");
               V_MainLogin_window m=new V_MainLogin_window();
               m.setVisible(true);
               this.setVisible(false);
       }
    }//GEN-LAST:event_btnVerifyActionPerformed

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
            java.util.logging.Logger.getLogger(VerificationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerificationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerificationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerificationPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerificationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerify;
    private javax.swing.JLabel lbl_NIC;
    private javax.swing.JLabel lbl_display;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_q1;
    private javax.swing.JLabel lbl_q2;
    private javax.swing.JLabel lbl_q3;
    private javax.swing.JLabel lbl_verification;
    private javax.swing.JTextField txt_NIC;
    private javax.swing.JTextField txt_q1;
    private javax.swing.JTextField txt_q2;
    private javax.swing.JTextField txt_q3;
    // End of variables declaration//GEN-END:variables
}
