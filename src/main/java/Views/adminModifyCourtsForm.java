
package Views;

import Controllers.PrincipalController;
import java.awt.Color;

public class adminModifyCourtsForm extends javax.swing.JFrame {

    public adminModifyCourtsForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        txtNameModifyCourtForm.setText("");
        txtUbicationModifyCourtForm.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNameModifyCourtForm = new javax.swing.JTextField();
        txtUbicationModifyCourtForm = new javax.swing.JTextField();
        btnInsertCourtForm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnReturnCourtPanel = new javax.swing.JButton();
        JLabelLogo = new javax.swing.JLabel();
        BtnCloseSessionAdmin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(758, 1400));

        txtNameModifyCourtForm.setBackground(new java.awt.Color(255, 255, 255));
        txtNameModifyCourtForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNameModifyCourtForm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameModifyCourtFormFocusLost(evt);
            }
        });
        txtNameModifyCourtForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameModifyCourtFormActionPerformed(evt);
            }
        });
        txtNameModifyCourtForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameModifyCourtFormKeyTyped(evt);
            }
        });

        txtUbicationModifyCourtForm.setBackground(new java.awt.Color(255, 255, 255));
        txtUbicationModifyCourtForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtUbicationModifyCourtForm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUbicationModifyCourtFormFocusLost(evt);
            }
        });
        txtUbicationModifyCourtForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicationModifyCourtFormActionPerformed(evt);
            }
        });
        txtUbicationModifyCourtForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUbicationModifyCourtFormKeyTyped(evt);
            }
        });

        btnInsertCourtForm.setBackground(new java.awt.Color(0, 0, 153));
        btnInsertCourtForm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInsertCourtForm.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertCourtForm.setText("Modificar");
        btnInsertCourtForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInsertCourtForm.setBorderPainted(false);
        btnInsertCourtForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertCourtFormActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Nom");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 30, 30));
        jLabel2.setText("Ubicació");

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        btnReturnCourtPanel.setBackground(new java.awt.Color(255, 255, 255));
        btnReturnCourtPanel.setForeground(new java.awt.Color(30, 30, 30));
        btnReturnCourtPanel.setText("Tornar ...");
        btnReturnCourtPanel.setBorder(null);
        btnReturnCourtPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnCourtPanelActionPerformed(evt);
            }
        });

        JLabelLogo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Images\\logoPadelAGWhite.png"));

        BtnCloseSessionAdmin.setBackground(new java.awt.Color(255, 255, 255));
        BtnCloseSessionAdmin.setForeground(new java.awt.Color(30, 30, 30));
        BtnCloseSessionAdmin.setText("Tancar Sessió");
        BtnCloseSessionAdmin.setBorder(null);
        BtnCloseSessionAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCloseSessionAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(JLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1470, Short.MAX_VALUE)
                .addComponent(btnReturnCourtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnCloseSessionAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnReturnCourtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnCloseSessionAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 30, 30));
        jLabel3.setText("ACTUALITZAR PISTA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(txtNameModifyCourtForm)
                        .addComponent(txtUbicationModifyCourtForm)
                        .addComponent(btnInsertCourtForm, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameModifyCourtForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUbicationModifyCourtForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnInsertCourtForm, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(304, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1826, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnCourtPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnCourtPanelActionPerformed
        PrincipalController.returnModifyFormCourtPanel();
    }//GEN-LAST:event_btnReturnCourtPanelActionPerformed

    private void txtNameModifyCourtFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameModifyCourtFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameModifyCourtFormActionPerformed

    private void txtUbicationModifyCourtFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicationModifyCourtFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicationModifyCourtFormActionPerformed

    private void btnInsertCourtFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertCourtFormActionPerformed
        String name = txtNameModifyCourtForm.getText();
        String ubication = txtUbicationModifyCourtForm.getText();
        PrincipalController.modifyCourt(name, ubication);
    }//GEN-LAST:event_btnInsertCourtFormActionPerformed

    private void txtNameModifyCourtFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameModifyCourtFormKeyTyped
        String name = txtNameModifyCourtForm.getText().trim();
        String namePattern = "^Pista [A-Za-z\\s]+$";

        if (!name.matches(namePattern)) {
            txtNameModifyCourtForm.setBackground(Color.RED);
        }
        checkData();
    }//GEN-LAST:event_txtNameModifyCourtFormKeyTyped

    private void txtNameModifyCourtFormFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameModifyCourtFormFocusLost
        String name = txtNameModifyCourtForm.getText().trim();
        String namePattern = "^Pista [A-Za-z\\s]+$";

        if (name.matches(namePattern)) {
            txtNameModifyCourtForm.setBackground(Color.GREEN);
        }
        checkData();
    }//GEN-LAST:event_txtNameModifyCourtFormFocusLost

    private void txtUbicationModifyCourtFormFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUbicationModifyCourtFormFocusLost
        String ubication = txtUbicationModifyCourtForm.getText().trim();
        String ubicationPattern = "^Sector \\d+$";

        if (ubication.matches(ubicationPattern)) {
            txtUbicationModifyCourtForm.setBackground(Color.GREEN);
        }
        checkData();
    }//GEN-LAST:event_txtUbicationModifyCourtFormFocusLost

    private void txtUbicationModifyCourtFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUbicationModifyCourtFormKeyTyped
        String ubication = txtUbicationModifyCourtForm.getText().trim();
        String ubicationPattern = "^Sector \\d+$";

        if (!ubication.matches(ubicationPattern)) {
            txtUbicationModifyCourtForm.setBackground(Color.RED);
        }
        checkData();
    }//GEN-LAST:event_txtUbicationModifyCourtFormKeyTyped

    private void BtnCloseSessionAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCloseSessionAdminActionPerformed
        PrincipalController.returnPrincipalPageFromAdminDashboard();
    }//GEN-LAST:event_BtnCloseSessionAdminActionPerformed
    
    private void checkData() {
        String name = txtNameModifyCourtForm.getText().trim();
        String namePattern = "^Pista [A-Za-z\\s]+$";
        String ubication = txtUbicationModifyCourtForm.getText().trim();
        String ubicationPattern = "^Sector \\d+$";
        
        if (!name.matches(namePattern) || !ubication.matches(ubicationPattern)) {
            btnInsertCourtForm.setEnabled(false);
        }
        else {
            btnInsertCourtForm.setEnabled(true);
        }
    }
    
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
            java.util.logging.Logger.getLogger(adminModifyCourtsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminModifyCourtsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminModifyCourtsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminModifyCourtsForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminModifyCourtsForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCloseSessionAdmin;
    private transient javax.swing.JLabel JLabelLogo;
    public javax.swing.JButton btnInsertCourtForm;
    public javax.swing.JButton btnReturnCourtPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtNameModifyCourtForm;
    public javax.swing.JTextField txtUbicationModifyCourtForm;
    // End of variables declaration//GEN-END:variables
}
