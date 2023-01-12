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
public class Security_Questions extends javax.swing.JFrame {

    /**
     * Creates new form Security_Questions
     */
    public Security_Questions() {
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
        lbl_q1 = new javax.swing.JLabel();
        lbl_q2 = new javax.swing.JLabel();
        lbl_q3 = new javax.swing.JLabel();
        btn_submit = new javax.swing.JButton();
        txt_NIC = new javax.swing.JTextField();
        txt_q1 = new javax.swing.JTextField();
        txt_q2 = new javax.swing.JTextField();
        txt_q3 = new javax.swing.JTextField();
        lbl_logo = new javax.swing.JLabel();
        lbl_footer = new javax.swing.JLabel();
        lbl_displaymessage = new javax.swing.JLabel();
        lbl_BACK = new javax.swing.JLabel();
        lbl_wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_headline.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_headline.setForeground(new java.awt.Color(255, 255, 255));
        lbl_headline.setText("Security Questions");
        getContentPane().add(lbl_headline, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 8, 330, 40));

        lbl_NIC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_NIC.setForeground(new java.awt.Color(255, 255, 255));
        lbl_NIC.setText("NIC ");
        getContentPane().add(lbl_NIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 80, 20));

        lbl_q1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_q1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_q1.setText("Your First Pet Name ?");
        getContentPane().add(lbl_q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 150, 20));

        lbl_q2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_q2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_q2.setText("Your First School?");
        getContentPane().add(lbl_q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 130, 20));

        lbl_q3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_q3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_q3.setText("Your Mothers Middle Name?");
        getContentPane().add(lbl_q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 200, 20));

        btn_submit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_submit.setText("SUBMIT");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 220, 50));

        txt_NIC.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txt_NIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 370, 40));

        txt_q1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txt_q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 370, 40));

        txt_q2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txt_q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 370, 40));

        txt_q3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txt_q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 370, 40));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Logo_size_3.png"))); // NOI18N
        getContentPane().add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 50, 50));

        lbl_footer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_footer.setForeground(new java.awt.Color(255, 255, 255));
        lbl_footer.setText("National Blood Bank @ National Blood Transfusion Service");
        getContentPane().add(lbl_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 430, -1));

        lbl_displaymessage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_displaymessage.setForeground(new java.awt.Color(255, 255, 255));
        lbl_displaymessage.setText("You can use the Questions to verify your account to change Password.");
        getContentPane().add(lbl_displaymessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 490, -1));

        lbl_BACK.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbl_BACK.setText("BACK");
        lbl_BACK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_BACKMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_BACK, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 540, 110, 60));

        lbl_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/securityquestions.png"))); // NOI18N
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        String NIC,Question1,Question2,Question3;
        boolean result;
        NIC=txt_NIC.getText();
        Question1=txt_q1.getText();
        Question2=txt_q2.getText();
        Question3=txt_q3.getText();
        //C_Security c=new C_Security();
        result=C_Security.SecurityQuestions(NIC,Question1,Question2,Question3);
        if(result==true)
        {
            JOptionPane.showMessageDialog(null, "Succesfully Submited..");
            V_Home_page h=new V_Home_page();
            h.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please try again later..");
            V_Home_page h=new V_Home_page();
            h.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_btn_submitActionPerformed

    private void lbl_BACKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_BACKMouseClicked
        // TODO add your handling code here:
        V_Home_page h=new V_Home_page();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_BACKMouseClicked

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
            java.util.logging.Logger.getLogger(Security_Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Security_Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Security_Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Security_Questions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Security_Questions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_submit;
    private javax.swing.JLabel lbl_BACK;
    private javax.swing.JLabel lbl_NIC;
    private javax.swing.JLabel lbl_displaymessage;
    private javax.swing.JLabel lbl_footer;
    private javax.swing.JLabel lbl_headline;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_q1;
    private javax.swing.JLabel lbl_q2;
    private javax.swing.JLabel lbl_q3;
    private javax.swing.JLabel lbl_wallpaper;
    private javax.swing.JTextField txt_NIC;
    private javax.swing.JTextField txt_q1;
    private javax.swing.JTextField txt_q2;
    private javax.swing.JTextField txt_q3;
    // End of variables declaration//GEN-END:variables
}
