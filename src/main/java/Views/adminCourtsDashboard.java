/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controllers.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class adminCourtsDashboard extends javax.swing.JFrame {

    public adminCourtsDashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        DefaultTableModel modelo = new DefaultTableModel();
        tblCourts.setModel(modelo);
        PrincipalController.loadTblCourt(modelo);
        if (tblCourts.getColumnModel().getColumnCount() > 0) {
            tblCourts.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblCourts.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblCourts.getColumnModel().getColumn(2).setPreferredWidth(250);
            tblCourts.getColumnModel().getColumn(3).setPreferredWidth(10);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDeactivateCourtForm = new javax.swing.JButton();
        btnActivateCourtForm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourts = new javax.swing.JTable();
        txtSearchCourt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnModifyCourtForm = new javax.swing.JButton();
        btnInsertCourtForm = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnBackCourt = new javax.swing.JButton();
        JLabelLogo = new javax.swing.JLabel();
        BtnCloseSessionAdmin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(758, 1400));

        btnDeactivateCourtForm.setBackground(new java.awt.Color(0, 0, 153));
        btnDeactivateCourtForm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeactivateCourtForm.setForeground(new java.awt.Color(255, 255, 255));
        btnDeactivateCourtForm.setText("Desactivar");
        btnDeactivateCourtForm.setBorder(null);
        btnDeactivateCourtForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeactivateCourtFormActionPerformed(evt);
            }
        });

        btnActivateCourtForm.setBackground(new java.awt.Color(0, 0, 153));
        btnActivateCourtForm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActivateCourtForm.setForeground(new java.awt.Color(255, 255, 255));
        btnActivateCourtForm.setText("Activar");
        btnActivateCourtForm.setBorder(null);
        btnActivateCourtForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivateCourtFormActionPerformed(evt);
            }
        });

        tblCourts = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblCourts.setForeground(new java.awt.Color(30, 30, 30));
        tblCourts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Ubicació", "Estat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCourts.setGridColor(new java.awt.Color(30, 30, 30));
        tblCourts.setPreferredSize(new java.awt.Dimension(510, 80));
        tblCourts.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblCourts);

        txtSearchCourt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSearchCourt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchCourtCaretUpdate(evt);
            }
        });
        txtSearchCourt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchCourtActionPerformed(evt);
            }
        });
        txtSearchCourt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchCourtKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Nom:");

        btnModifyCourtForm.setBackground(new java.awt.Color(0, 0, 153));
        btnModifyCourtForm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModifyCourtForm.setForeground(new java.awt.Color(255, 255, 255));
        btnModifyCourtForm.setText("Modificar");
        btnModifyCourtForm.setBorder(null);
        btnModifyCourtForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyCourtFormActionPerformed(evt);
            }
        });

        btnInsertCourtForm.setBackground(new java.awt.Color(0, 0, 153));
        btnInsertCourtForm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInsertCourtForm.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertCourtForm.setText("Afegir");
        btnInsertCourtForm.setBorder(null);
        btnInsertCourtForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertCourtFormActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(575, 84));

        btnBackCourt.setForeground(new java.awt.Color(30, 30, 30));
        btnBackCourt.setText("Tornar ...");
        btnBackCourt.setBorder(null);
        btnBackCourt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackCourtActionPerformed(evt);
            }
        });

        JLabelLogo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Images\\logoPadelAGWhite.png"));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackCourt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnCloseSessionAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnCloseSessionAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBackCourt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 30, 30));
        jLabel2.setText("LLISTAT DE PISTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1826, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(450, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnInsertCourtForm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModifyCourtForm, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeactivateCourtForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActivateCourtForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchCourt, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(451, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchCourt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnInsertCourtForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActivateCourtForm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeactivateCourtForm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModifyCourtForm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1826, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCloseSessionAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCloseSessionAdminActionPerformed
        PrincipalController.returnPrincipalPageFromAdminDashboard();
        clean();
        loadTable();
        styleTbl();
    }//GEN-LAST:event_BtnCloseSessionAdminActionPerformed

    private void btnBackCourtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackCourtActionPerformed
        PrincipalController.returnCourtPanel();
        clean();
        loadTable();
        styleTbl();
    }//GEN-LAST:event_btnBackCourtActionPerformed

    private void btnInsertCourtFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertCourtFormActionPerformed
        PrincipalController.showNewFormCourtPanel();
        clean();
        loadTable();
        styleTbl();
    }//GEN-LAST:event_btnInsertCourtFormActionPerformed

    private void btnModifyCourtFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyCourtFormActionPerformed
        if (tblCourts.getSelectedRow() == -1)
        JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        else {
            DefaultTableModel modelTable = (DefaultTableModel) tblCourts.getModel();
            int selectedRow = tblCourts.getSelectedRow();
            int idCourt =  (int) modelTable.getValueAt(selectedRow, 0);
            String name = (String) modelTable.getValueAt(selectedRow,1);
            String ubication = (String) modelTable.getValueAt(selectedRow,2);
            PrincipalController.showModifyFormCourtPanel(idCourt, name, ubication);
            clean();
            loadTable();
            styleTbl();
        }
    }//GEN-LAST:event_btnModifyCourtFormActionPerformed

    private void txtSearchCourtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchCourtKeyReleased
        DefaultTableModel modelo = new DefaultTableModel();
        tblCourts.setModel(modelo);
        String where = txtSearchCourt.getText();
        PrincipalController.loadTblCourtWhere(modelo, where);
        styleTbl();
    }//GEN-LAST:event_txtSearchCourtKeyReleased

    private void txtSearchCourtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchCourtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchCourtActionPerformed

    private void txtSearchCourtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchCourtCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchCourtCaretUpdate

    private void btnActivateCourtFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivateCourtFormActionPerformed
        if (tblCourts.getSelectedRow() == -1)
        JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        else {
            DefaultTableModel modelTable = (DefaultTableModel) tblCourts.getModel();
            int selectedRow = tblCourts.getSelectedRow();
            int idCourt =  (int) modelTable.getValueAt(selectedRow, 0);
            PrincipalController.activateCourt(idCourt);
            loadTable();
            styleTbl();
        }
    }//GEN-LAST:event_btnActivateCourtFormActionPerformed

    private void btnDeactivateCourtFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeactivateCourtFormActionPerformed
        if (tblCourts.getSelectedRow() == -1)
        JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        else {
            DefaultTableModel modelTable = (DefaultTableModel) tblCourts.getModel();
            int selectedRow = tblCourts.getSelectedRow();
            int idCourt =  (int) modelTable.getValueAt(selectedRow, 0);
            PrincipalController.deactivateCourt(idCourt);
            loadTable();
            styleTbl();
        }
    }//GEN-LAST:event_btnDeactivateCourtFormActionPerformed

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
            java.util.logging.Logger.getLogger(adminCourtsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminCourtsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminCourtsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminCourtsDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminCourtsDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCloseSessionAdmin;
    private javax.swing.JLabel JLabelLogo;
    private javax.swing.JButton btnActivateCourtForm;
    private javax.swing.JButton btnBackCourt;
    private javax.swing.JButton btnDeactivateCourtForm;
    private javax.swing.JButton btnInsertCourtForm;
    private javax.swing.JButton btnModifyCourtForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCourts;
    private javax.swing.JTextField txtSearchCourt;
    // End of variables declaration//GEN-END:variables

    public void clean() {
        txtSearchCourt.setText("");
    }
    
    public void styleTbl() {
        if (tblCourts.getColumnModel().getColumnCount() > 0) {
            tblCourts.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblCourts.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblCourts.getColumnModel().getColumn(2).setPreferredWidth(250);
            tblCourts.getColumnModel().getColumn(3).setPreferredWidth(10);
        }
    }
    
    public void loadTable() {
        DefaultTableModel modelo = new DefaultTableModel();
        tblCourts.setModel(modelo);
        PrincipalController.loadTblCourtWhere(modelo, txtSearchCourt.getText());
    }
}
