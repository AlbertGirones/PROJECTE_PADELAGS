/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controllers.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author geri
 */
public class adminCourtsDashboard extends javax.swing.JFrame {

    /**
     * Creates new form insertForm
     */
    public adminCourtsDashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel modelo = new DefaultTableModel();
        tblCourts.setModel(modelo);
        PrincipalController.loadTblCourt(modelo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInsertCourtForm = new javax.swing.JButton();
        btnDeactivateCourtForm = new javax.swing.JButton();
        btnActivateCourtForm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourts = new javax.swing.JTable();
        txtSearchCourt = new javax.swing.JTextField();
        btnSearchCourt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBackCourt = new javax.swing.JButton();
        btnMaintenanceCourtForm1 = new javax.swing.JButton();
        btnModifyCourtForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnInsertCourtForm.setText("Agregar");
        btnInsertCourtForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertCourtFormActionPerformed(evt);
            }
        });

        btnDeactivateCourtForm.setText("Desactivar");
        btnDeactivateCourtForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeactivateCourtFormActionPerformed(evt);
            }
        });

        btnActivateCourtForm.setText("Activar");
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
        jScrollPane1.setViewportView(tblCourts);

        txtSearchCourt.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchCourtCaretUpdate(evt);
            }
        });
        txtSearchCourt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchCourtKeyReleased(evt);
            }
        });

        btnSearchCourt.setText("Carregar");
        btnSearchCourt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCourtActionPerformed(evt);
            }
        });

        jLabel1.setText("Nom:");

        btnBackCourt.setText("Tornar ...");
        btnBackCourt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackCourtActionPerformed(evt);
            }
        });

        btnMaintenanceCourtForm1.setText("En manteniment");
        btnMaintenanceCourtForm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaintenanceCourtForm1ActionPerformed(evt);
            }
        });

        btnModifyCourtForm.setText("Modificar");
        btnModifyCourtForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyCourtFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchCourt, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearchCourt))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsertCourtForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModifyCourtForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActivateCourtForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMaintenanceCourtForm1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeactivateCourtForm))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBackCourt)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnBackCourt)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchCourt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchCourt)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInsertCourtForm)
                    .addComponent(btnDeactivateCourtForm)
                    .addComponent(btnActivateCourtForm)
                    .addComponent(btnMaintenanceCourtForm1)
                    .addComponent(btnModifyCourtForm))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeactivateCourtFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeactivateCourtFormActionPerformed
        if (tblCourts.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        else {
            DefaultTableModel modelTable = (DefaultTableModel) tblCourts.getModel();
            int selectedRow = tblCourts.getSelectedRow();
            int idCourt =  (int) modelTable.getValueAt(selectedRow, 0);
            PrincipalController.deactivateCourt(idCourt);
        }
    }//GEN-LAST:event_btnDeactivateCourtFormActionPerformed

    private void btnActivateCourtFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivateCourtFormActionPerformed
        if (tblCourts.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        else {
            DefaultTableModel modelTable = (DefaultTableModel) tblCourts.getModel();
            int selectedRow = tblCourts.getSelectedRow();
            int idCourt =  (int) modelTable.getValueAt(selectedRow, 0);
            PrincipalController.activateCourt(idCourt);
        }
    }//GEN-LAST:event_btnActivateCourtFormActionPerformed

    private void btnSearchCourtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCourtActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        tblCourts.setModel(modelo);
        PrincipalController.loadTblCourtWhere(modelo, txtSearchCourt.getText());
    }//GEN-LAST:event_btnSearchCourtActionPerformed

    private void btnBackCourtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackCourtActionPerformed
        PrincipalController.returnCourtPanel();
    }//GEN-LAST:event_btnBackCourtActionPerformed

    private void btnInsertCourtFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertCourtFormActionPerformed
        PrincipalController.showNewFormCourtPanel();
    }//GEN-LAST:event_btnInsertCourtFormActionPerformed

    private void btnMaintenanceCourtForm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaintenanceCourtForm1ActionPerformed
        if (tblCourts.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        else {
            DefaultTableModel modelTable = (DefaultTableModel) tblCourts.getModel();
            int selectedRow = tblCourts.getSelectedRow();
            int idCourt =  (int) modelTable.getValueAt(selectedRow, 0);
            PrincipalController.maintenanceCourt(idCourt);
        }
    }//GEN-LAST:event_btnMaintenanceCourtForm1ActionPerformed

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
        }
    }//GEN-LAST:event_btnModifyCourtFormActionPerformed

    private void txtSearchCourtCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchCourtCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchCourtCaretUpdate

    private void txtSearchCourtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchCourtKeyReleased
        DefaultTableModel modelo = new DefaultTableModel();
        tblCourts.setModel(modelo);
        String where = txtSearchCourt.getText();
        PrincipalController.loadTblCourtWhere(modelo, where);
    }//GEN-LAST:event_txtSearchCourtKeyReleased

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
    public javax.swing.JButton btnActivateCourtForm;
    public javax.swing.JButton btnBackCourt;
    public javax.swing.JButton btnDeactivateCourtForm;
    public javax.swing.JButton btnInsertCourtForm;
    public javax.swing.JButton btnMaintenanceCourtForm1;
    public javax.swing.JButton btnModifyCourtForm;
    public javax.swing.JButton btnSearchCourt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblCourts;
    public javax.swing.JTextField txtSearchCourt;
    // End of variables declaration//GEN-END:variables
}
