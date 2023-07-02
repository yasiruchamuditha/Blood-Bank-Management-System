/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class V_Home_page extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public V_Home_page() {
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

        panelBody = new javax.swing.JPanel();
        lbl_header = new javax.swing.JLabel();
        lbl_footer1 = new javax.swing.JLabel();
        lbl_director = new javax.swing.JLabel();
        lbl_Directorname = new javax.swing.JLabel();
        lbl_footer2 = new javax.swing.JLabel();
        lbl_directorfooter = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        jMenuBar_Home = new javax.swing.JMenuBar();
        jMenuAbout = new javax.swing.JMenu();
        jMenuDetailsofDonation = new javax.swing.JMenu();
        jMenuDetailsofBlood = new javax.swing.JMenu();
        jMenuContactus = new javax.swing.JMenu();
        jMenuSETTING = new javax.swing.JMenu();
        jMenuAPPOINTMENT = new javax.swing.JMenu();
        jMenuItemDonor = new javax.swing.JMenuItem();
        jMenuItemOrganization = new javax.swing.JMenuItem();
        jMenuLogOut = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBody.setBackground(new java.awt.Color(255, 51, 51));
        panelBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/HeaderWallpaper.jpg"))); // NOI18N
        panelBody.add(lbl_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 900, 410));

        lbl_footer1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_footer1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_footer1.setText("National Blood Bank @National Blood Transfusion Service");
        panelBody.add(lbl_footer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 690, 410, -1));

        lbl_director.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Director.png"))); // NOI18N
        panelBody.add(lbl_director, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 310, 280));

        lbl_Directorname.setFont(new java.awt.Font("Goudy Old Style", 1, 24)); // NOI18N
        lbl_Directorname.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Directorname.setText("Dr. Lakshman Edirisinghe");
        panelBody.add(lbl_Directorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 300, 250, 30));

        lbl_footer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/footer.jpg"))); // NOI18N
        panelBody.add(lbl_footer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, 260));

        lbl_directorfooter.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        lbl_directorfooter.setForeground(new java.awt.Color(255, 255, 255));
        lbl_directorfooter.setText("Director - National Blood Transfusion Service");
        panelBody.add(lbl_directorfooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 340, -1, -1));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Logo_size_1.png"))); // NOI18N
        panelBody.add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 440, -1, -1));

        getContentPane().add(panelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 720));

        jMenuBar_Home.setAlignmentX(1.0F);
        jMenuBar_Home.setAlignmentY(1.0F);
        jMenuBar_Home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuBar_Home.setMinimumSize(new java.awt.Dimension(70, 30));
        jMenuBar_Home.setPreferredSize(new java.awt.Dimension(70, 50));

        jMenuAbout.setText("  About Us  ");
        jMenuAbout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAboutMouseClicked(evt);
            }
        });
        jMenuBar_Home.add(jMenuAbout);

        jMenuDetailsofDonation.setText(" Details of Donations");
        jMenuDetailsofDonation.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuDetailsofDonation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuDetailsofDonationMouseClicked(evt);
            }
        });
        jMenuBar_Home.add(jMenuDetailsofDonation);

        jMenuDetailsofBlood.setText("  Details of Blood   ");
        jMenuDetailsofBlood.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuDetailsofBlood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuDetailsofBloodMouseClicked(evt);
            }
        });
        jMenuBar_Home.add(jMenuDetailsofBlood);

        jMenuContactus.setText("   Contact Us   ");
        jMenuContactus.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuContactus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuContactusMouseClicked(evt);
            }
        });
        jMenuBar_Home.add(jMenuContactus);

        jMenuSETTING.setText("  Setting   ");
        jMenuSETTING.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuSETTING.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSETTINGMouseClicked(evt);
            }
        });
        jMenuBar_Home.add(jMenuSETTING);

        jMenuAPPOINTMENT.setText(" Appointment  For Donation");
        jMenuAPPOINTMENT.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        jMenuItemDonor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuItemDonor.setText("Donor");
        jMenuItemDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDonorActionPerformed(evt);
            }
        });
        jMenuAPPOINTMENT.add(jMenuItemDonor);

        jMenuItemOrganization.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuItemOrganization.setText("Organization");
        jMenuItemOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOrganizationActionPerformed(evt);
            }
        });
        jMenuAPPOINTMENT.add(jMenuItemOrganization);

        jMenuBar_Home.add(jMenuAPPOINTMENT);

        jMenuLogOut.setText("  LogOut ");
        jMenuLogOut.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLogOutMouseClicked(evt);
            }
        });
        jMenuLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLogOutActionPerformed(evt);
            }
        });
        jMenuBar_Home.add(jMenuLogOut);

        setJMenuBar(jMenuBar_Home);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAboutMouseClicked
        // TODO add your handling code here:
        V_About_us au=new V_About_us();
        au.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuAboutMouseClicked

    private void jMenuDetailsofDonationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDetailsofDonationMouseClicked
        // TODO add your handling code here:
        V_Details_Of_Donations dd=new V_Details_Of_Donations();
        dd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuDetailsofDonationMouseClicked

    private void jMenuDetailsofBloodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDetailsofBloodMouseClicked
        // TODO add your handling code here:
        V_Details_of_Blood db=new V_Details_of_Blood();
        db.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuDetailsofBloodMouseClicked

    private void jMenuContactusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuContactusMouseClicked
        // TODO add your handling code here:
        V_ContactUs cu=new V_ContactUs();
        cu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuContactusMouseClicked

    private void jMenuItemDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDonorActionPerformed
        // TODO add your handling code here:
        V_Appointment_Donor ad=new V_Appointment_Donor();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemDonorActionPerformed

    private void jMenuItemOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOrganizationActionPerformed
        // TODO add your handling code here:
        V_Appointment_Organization ao=new V_Appointment_Organization();
        ao.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemOrganizationActionPerformed

    private void jMenuLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLogOutActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuLogOutActionPerformed

    private void jMenuLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogOutMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jMenuLogOutMouseClicked

    private void jMenuSETTINGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSETTINGMouseClicked
        // TODO add your handling code here:
        Security_Questions sc=new Security_Questions();
        sc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuSETTINGMouseClicked

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
            java.util.logging.Logger.getLogger(V_Home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Home_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new V_Home_page().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAPPOINTMENT;
    private javax.swing.JMenu jMenuAbout;
    private javax.swing.JMenuBar jMenuBar_Home;
    private javax.swing.JMenu jMenuContactus;
    private javax.swing.JMenu jMenuDetailsofBlood;
    private javax.swing.JMenu jMenuDetailsofDonation;
    private javax.swing.JMenuItem jMenuItemDonor;
    private javax.swing.JMenuItem jMenuItemOrganization;
    private javax.swing.JMenu jMenuLogOut;
    private javax.swing.JMenu jMenuSETTING;
    private javax.swing.JLabel lbl_Directorname;
    private javax.swing.JLabel lbl_director;
    private javax.swing.JLabel lbl_directorfooter;
    private javax.swing.JLabel lbl_footer1;
    private javax.swing.JLabel lbl_footer2;
    private javax.swing.JLabel lbl_header;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JPanel panelBody;
    // End of variables declaration//GEN-END:variables
}
