/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import Model.*;
/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class V_MainLogin_window extends javax.swing.JFrame {

    public V_MainLogin_window() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Headline = new javax.swing.JLabel();
        lbl_donordisplay = new javax.swing.JLabel();
        lbl_Organizationdisplay = new javax.swing.JLabel();
        lbl_Medicalstuffdisplay = new javax.swing.JLabel();
        lbl_admindisplay = new javax.swing.JLabel();
        lbl_footer = new javax.swing.JLabel();
        lbl_Mainloginwallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Headline.setFont(new java.awt.Font("Segoe Script", 1, 65)); // NOI18N
        lbl_Headline.setText("Welcome");
        getContentPane().add(lbl_Headline, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 360, -1));

        lbl_donordisplay.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_donordisplay.setText("I AM DONOR...........");
        lbl_donordisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_donordisplayMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_donordisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 620, 100));

        lbl_Organizationdisplay.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_Organizationdisplay.setText("I AM ORGANIZATION....");
        lbl_Organizationdisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_OrganizationdisplayMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_Organizationdisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 620, 90));

        lbl_Medicalstuffdisplay.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_Medicalstuffdisplay.setText("I AM MEDICAL STAFF........");
        lbl_Medicalstuffdisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_MedicalstuffdisplayMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_Medicalstuffdisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 620, 100));

        lbl_admindisplay.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_admindisplay.setText("I AM ADMIN.........");
        lbl_admindisplay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_admindisplayMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_admindisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 540, 620, 100));

        lbl_footer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbl_footer.setText("National Blood Bank @National Blood Transfusion Service");
        getContentPane().add(lbl_footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 670, 670, 20));

        lbl_Mainloginwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Mainlogin_window_wallpaper.jpg"))); // NOI18N
        getContentPane().add(lbl_Mainloginwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_donordisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_donordisplayMouseClicked
        // TODO add your handling code here:
        SelectedUser su=new SelectedUser();
        su.selectIUsertype("Donor");
        V_Donor_login_page DL=new V_Donor_login_page();
        DL.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lbl_donordisplayMouseClicked

    private void lbl_MedicalstuffdisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_MedicalstuffdisplayMouseClicked
        // TODO add your handling code here:
        SelectedUser su=new SelectedUser();
        su.selectIUsertype("MedicalStaff");
        V_Medical_Staff_login_page ML=new V_Medical_Staff_login_page();
        ML.setVisible(true);
        this.setVisible(false);    
    }//GEN-LAST:event_lbl_MedicalstuffdisplayMouseClicked

    private void lbl_OrganizationdisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_OrganizationdisplayMouseClicked
        // TODO add your handling code here:
        SelectedUser su=new SelectedUser();
        su.selectIUsertype("Organization");
        V_Organization_login OL=new V_Organization_login();
        OL.setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_lbl_OrganizationdisplayMouseClicked

    private void lbl_admindisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_admindisplayMouseClicked
        // TODO add your handling code here:
        SelectedUser su=new SelectedUser();
        su.selectIUsertype("Admin");
        V_Admin_logIn_page AL=new V_Admin_logIn_page();
        AL.setVisible(true);
        this.setVisible(false); 
    }//GEN-LAST:event_lbl_admindisplayMouseClicked

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
            java.util.logging.Logger.getLogger(V_MainLogin_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_MainLogin_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_MainLogin_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_MainLogin_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_MainLogin_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_Headline;
    private javax.swing.JLabel lbl_Mainloginwallpaper;
    private javax.swing.JLabel lbl_Medicalstuffdisplay;
    private javax.swing.JLabel lbl_Organizationdisplay;
    private javax.swing.JLabel lbl_admindisplay;
    private javax.swing.JLabel lbl_donordisplay;
    private javax.swing.JLabel lbl_footer;
    // End of variables declaration//GEN-END:variables
}
