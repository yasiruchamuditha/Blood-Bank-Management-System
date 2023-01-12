/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.dbConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yasiru
 */
public class V_home_admin extends javax.swing.JFrame {

    /**
     * Creates new form V_home_admin
     */
    public V_home_admin() {
        initComponents();
        
        try
        {
           
        DefaultTableModel dtm=new DefaultTableModel();
        dtm.addColumn("Blood Group");
        dtm.addColumn("No_Of_Bags");
        Statement st=dbConnection.createDbConnection().createStatement();
        ResultSet rst=st.executeQuery("select * from Storage");
       while(rst.next())
            {
                String[] value=new String[2];
                value[0]=rst.getString(1);
                value[1]=rst.getString(2);
                dtm.addRow(value);
            }
          jTableStorage.setModel(dtm);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }  

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStorage = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_logo = new javax.swing.JLabel();
        lbl_wallpaper = new javax.swing.JLabel();
        jMenuBaradmin = new javax.swing.JMenuBar();
        jMenuDonation = new javax.swing.JMenu();
        jMenuTranscation = new javax.swing.JMenu();
        jMenuReport = new javax.swing.JMenu();
        jMenusetting = new javax.swing.JMenu();
        jMenuLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        setSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableStorage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTableStorage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jTableStorage.setRowHeight(50);
        jTableStorage.setRowSelectionAllowed(false);
        jTableStorage.setSelectionBackground(new java.awt.Color(255, 204, 204));
        jScrollPane1.setViewportView(jTableStorage);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 520, 430));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Current Blood Storage Count");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 19, 350, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("National Blood Bank @ National Blood Transfusion Service");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 430, -1));

        lbl_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Logo_size_3.png"))); // NOI18N
        getContentPane().add(lbl_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, -1, -1));

        lbl_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/adminHome.jpg"))); // NOI18N
        getContentPane().add(lbl_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 660));

        jMenuDonation.setText(" Donation  ");
        jMenuDonation.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuDonation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuDonationMouseClicked(evt);
            }
        });
        jMenuBaradmin.add(jMenuDonation);

        jMenuTranscation.setText("   Transcation  ");
        jMenuTranscation.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuTranscation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuTranscationMouseClicked(evt);
            }
        });
        jMenuBaradmin.add(jMenuTranscation);

        jMenuReport.setText("  Reports  -    Admin Purposes Only ");
        jMenuReport.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuReportMouseClicked(evt);
            }
        });
        jMenuBaradmin.add(jMenuReport);

        jMenusetting.setText("   Setting  ");
        jMenusetting.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenusetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenusettingMouseClicked(evt);
            }
        });
        jMenuBaradmin.add(jMenusetting);

        jMenuLogout.setText("   LogOut   ");
        jMenuLogout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLogoutMouseClicked(evt);
            }
        });
        jMenuBaradmin.add(jMenuLogout);

        setJMenuBar(jMenuBaradmin);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuDonationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDonationMouseClicked
        // TODO add your handling code here:
        V_Donation d=new V_Donation();
        d.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jMenuDonationMouseClicked

    private void jMenuTranscationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuTranscationMouseClicked
        // TODO add your handling code here:
        V_Transcation t=new V_Transcation();
        t.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuTranscationMouseClicked

    private void jMenusettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenusettingMouseClicked
        // TODO add your handling code here:
        SecurityQuestion2 d=new SecurityQuestion2();
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenusettingMouseClicked

    private void jMenuReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuReportMouseClicked
        // TODO add your handling code here:
        report r=new report();
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuReportMouseClicked

    private void jMenuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogoutMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jMenuLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(V_home_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_home_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_home_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_home_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_home_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBaradmin;
    private javax.swing.JMenu jMenuDonation;
    private javax.swing.JMenu jMenuLogout;
    private javax.swing.JMenu jMenuReport;
    private javax.swing.JMenu jMenuTranscation;
    private javax.swing.JMenu jMenusetting;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStorage;
    private javax.swing.JLabel lbl_logo;
    private javax.swing.JLabel lbl_wallpaper;
    // End of variables declaration//GEN-END:variables
}