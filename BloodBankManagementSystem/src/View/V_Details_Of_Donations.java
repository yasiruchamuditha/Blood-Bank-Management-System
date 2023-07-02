/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 * @author Yasiru
 * contact me : https://linktr.ee/yasiruchamuditha for more information.
 */
public class V_Details_Of_Donations extends javax.swing.JFrame {

    /**
     * Creates new form V_Details_Of_Donations
     */
    public V_Details_Of_Donations() {
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
        lbl_body = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1400, 700));
        setMinimumSize(new java.awt.Dimension(1400, 700));
        setPreferredSize(new java.awt.Dimension(1400, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBody.setBackground(new java.awt.Color(255, 204, 255));
        panelBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_body.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbl_body.setText("<html> <h1><center><font color=red>Donate Blood</font></center></h1> <h2>Who can donate blood?<h2> <p> The person must fulfill several criteria to be accepted as a blood donor. These criteria are set forth to ensure the safety of the donor as well as the quality of donated blood. </p>  <h2>Donor Selection Criteria</h2> <p> Age above 18 years and below 60 years. If previously donated, at least 4 months should be elapsed since the date of previous donation. Hemoglobin level should be more than 12g/dL. (this blood test is done prior to each blood donation) Free from any serious disease condition or pregnancy. Should have a valid identity card or any other document to prove the identity. Free from \"Risk Behaviours\". Risk Behaviours  Homosexuals. Sex workers and their clients. Drug addicts. Engaging in sex with any of the above. Having more than one sexual partner  </p> <h2>Type of Donors</h2> <p> Voluntory non remunerated donors. (donate for the sake of others and do not expect any benefit. their blood is considered safe and healthy) Replacement donors. (donate to replace the units used for their friends or family members) Paid donors. (receive payment for donation Directed donors. (donate only for a specific patient's requirement) Replacement and Paid donors are no longer accepted by NBTS. Replacement donation was carried out until recently in some blood banks due to the shortage of blood stocks. Asking patients for replacement donors will lead to more pressure on the relatives, who are already in stress and this in turn results in illegal paid donations. Directed donations are used in certain conditions such as in rare blood groups. NBTS achieved the mighty figure of 100% voluntory non-remunerated blood donor base.  </p> </html>");
        panelBody.add(lbl_body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 660));

        getContentPane().add(panelBody, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 660));

        jMenu1.setText("  Back  ");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        V_Home_page hp=new V_Home_page();
        hp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(V_Details_Of_Donations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Details_Of_Donations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Details_Of_Donations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Details_Of_Donations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Details_Of_Donations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_body;
    private javax.swing.JPanel panelBody;
    // End of variables declaration//GEN-END:variables
}
