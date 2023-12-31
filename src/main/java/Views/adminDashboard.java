package Views;

import Controllers.PrincipalController;
import javax.swing.JTable;

public class adminDashboard extends javax.swing.JFrame {

    public JTable JTable;
    
    public adminDashboard() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRedirectUserDashboard = new javax.swing.JButton();
        btnRedirectReservationDashboard = new javax.swing.JButton();
        btnRedirectCourtDashboard = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BtnCloseSessionAdmin = new javax.swing.JButton();
        JLabelLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(758, 1400));

        btnRedirectUserDashboard.setBackground(new java.awt.Color(0, 0, 153));
        btnRedirectUserDashboard.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRedirectUserDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnRedirectUserDashboard.setText("Gestionar usuaris");
        btnRedirectUserDashboard.setBorder(null);
        btnRedirectUserDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedirectUserDashboardActionPerformed(evt);
            }
        });

        btnRedirectReservationDashboard.setBackground(new java.awt.Color(0, 0, 153));
        btnRedirectReservationDashboard.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRedirectReservationDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnRedirectReservationDashboard.setText("Gestionar reserves");
        btnRedirectReservationDashboard.setBorder(null);
        btnRedirectReservationDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedirectReservationDashboardActionPerformed(evt);
            }
        });

        btnRedirectCourtDashboard.setBackground(new java.awt.Color(0, 0, 153));
        btnRedirectCourtDashboard.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRedirectCourtDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnRedirectCourtDashboard.setText("Gestionar pistes");
        btnRedirectCourtDashboard.setBorder(null);
        btnRedirectCourtDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedirectCourtDashboardActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Menú Administrador");

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(575, 84));

        BtnCloseSessionAdmin.setBackground(new java.awt.Color(255, 255, 255));
        BtnCloseSessionAdmin.setForeground(new java.awt.Color(30, 30, 30));
        BtnCloseSessionAdmin.setText("Tancar Sessió");
        BtnCloseSessionAdmin.setBorder(null);
        BtnCloseSessionAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCloseSessionAdminActionPerformed(evt);
            }
        });

        JLabelLogo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Images\\logoPadelAGWhite.png"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(JLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1558, Short.MAX_VALUE)
                .addComponent(BtnCloseSessionAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(BtnCloseSessionAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1826, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(794, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRedirectCourtDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRedirectUserDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRedirectReservationDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(793, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(btnRedirectUserDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRedirectReservationDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRedirectCourtDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 245, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1826, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRedirectReservationDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedirectReservationDashboardActionPerformed
        PrincipalController.showReservationPanel();
    }//GEN-LAST:event_btnRedirectReservationDashboardActionPerformed

    private void btnRedirectCourtDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedirectCourtDashboardActionPerformed
        PrincipalController.showCourtPanel();
    }//GEN-LAST:event_btnRedirectCourtDashboardActionPerformed

    private void btnRedirectUserDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedirectUserDashboardActionPerformed
        PrincipalController.showUserPanel();
    }//GEN-LAST:event_btnRedirectUserDashboardActionPerformed

    private void BtnCloseSessionAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCloseSessionAdminActionPerformed
        PrincipalController.returnPrincipalPageFromAdminDashboard();
    }//GEN-LAST:event_BtnCloseSessionAdminActionPerformed

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
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCloseSessionAdmin;
    private transient javax.swing.JLabel JLabelLogo;
    public javax.swing.JButton btnRedirectCourtDashboard;
    public javax.swing.JButton btnRedirectReservationDashboard;
    public javax.swing.JButton btnRedirectUserDashboard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
