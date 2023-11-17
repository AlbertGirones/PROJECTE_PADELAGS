
package Views;

import Controllers.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class adminUsersDashboard extends javax.swing.JFrame {

    public adminUsersDashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
        DefaultTableModel modelo = new DefaultTableModel();
        tblUsers.setModel(modelo);
        PrincipalController.loadTblUser(modelo);
        if (tblUsers.getColumnModel().getColumnCount() > 0) {
            tblUsers.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblUsers.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblUsers.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblUsers.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblUsers.getColumnModel().getColumn(4).setPreferredWidth(170);
            tblUsers.getColumnModel().getColumn(5).setPreferredWidth(50);
            tblUsers.getColumnModel().getColumn(6).setPreferredWidth(25);
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

        jPanel2 = new javax.swing.JPanel();
        JLabelLogo = new javax.swing.JLabel();
        btnBackUser = new javax.swing.JButton();
        BtnCloseSessionAdmin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSearchUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        btnInsertUserForm = new javax.swing.JButton();
        btnUpdateUserForm = new javax.swing.JButton();
        btnResetPasswdUserForm = new javax.swing.JButton();
        btnActivateUserForm = new javax.swing.JButton();
        btnDeactivateUserForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(575, 455));

        JLabelLogo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Images\\logoPadelAGWhite.png"));

        btnBackUser.setForeground(new java.awt.Color(30, 30, 30));
        btnBackUser.setText("Tornar ...");
        btnBackUser.setBorder(null);
        btnBackUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackUserActionPerformed(evt);
            }
        });

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
                .addComponent(btnBackUser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BtnCloseSessionAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnCloseSessionAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBackUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(758, 1400));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 30, 30));
        jLabel2.setText("LLISTAT D'USUARIS");

        txtSearchUser.setForeground(new java.awt.Color(30, 30, 30));
        txtSearchUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSearchUser.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchUserCaretUpdate(evt);
            }
        });
        txtSearchUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchUserKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchUserKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Filtra per DNI:");

        tblUsers.setForeground(new java.awt.Color(30, 30, 30));
        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nom", "Cognom", "DNI", "Correu", "Telèfon", "Estat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsers.setGridColor(new java.awt.Color(255, 255, 255));
        tblUsers.setIntercellSpacing(new java.awt.Dimension(10, 0));
        tblUsers.setSelectionBackground(new java.awt.Color(255, 255, 225));
        jScrollPane1.setViewportView(tblUsers);
        if (tblUsers.getColumnModel().getColumnCount() > 0) {
            tblUsers.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblUsers.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblUsers.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblUsers.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblUsers.getColumnModel().getColumn(4).setPreferredWidth(170);
            tblUsers.getColumnModel().getColumn(5).setPreferredWidth(50);
            tblUsers.getColumnModel().getColumn(6).setPreferredWidth(25);
        }

        btnInsertUserForm.setBackground(new java.awt.Color(0, 0, 153));
        btnInsertUserForm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnInsertUserForm.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertUserForm.setText("Afegir");
        btnInsertUserForm.setBorder(null);
        btnInsertUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertUserFormActionPerformed(evt);
            }
        });

        btnUpdateUserForm.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdateUserForm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdateUserForm.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateUserForm.setText("Modificar");
        btnUpdateUserForm.setBorder(null);
        btnUpdateUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserFormActionPerformed(evt);
            }
        });

        btnResetPasswdUserForm.setBackground(new java.awt.Color(0, 0, 153));
        btnResetPasswdUserForm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnResetPasswdUserForm.setForeground(new java.awt.Color(255, 255, 255));
        btnResetPasswdUserForm.setText("Resetejar Passwd");
        btnResetPasswdUserForm.setBorder(null);
        btnResetPasswdUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPasswdUserFormActionPerformed(evt);
            }
        });

        btnActivateUserForm.setBackground(new java.awt.Color(0, 0, 153));
        btnActivateUserForm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActivateUserForm.setForeground(new java.awt.Color(255, 255, 255));
        btnActivateUserForm.setText("Activar");
        btnActivateUserForm.setBorder(null);
        btnActivateUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivateUserFormActionPerformed(evt);
            }
        });

        btnDeactivateUserForm.setBackground(new java.awt.Color(0, 0, 153));
        btnDeactivateUserForm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDeactivateUserForm.setForeground(new java.awt.Color(255, 255, 255));
        btnDeactivateUserForm.setText("Desactivar");
        btnDeactivateUserForm.setBorder(null);
        btnDeactivateUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeactivateUserFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(550, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInsertUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateUserForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnResetPasswdUserForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeactivateUserForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActivateUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(255, 255, 255)))
                .addContainerGap(551, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchUser, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnActivateUserForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeactivateUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdateUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsertUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnResetPasswdUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1826, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1826, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackUserActionPerformed
        PrincipalController.returnUserPanel();
        clean();
        loadTable();
        styleTbl();
    }//GEN-LAST:event_btnBackUserActionPerformed

    private void btnDeactivateUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeactivateUserFormActionPerformed
        if (tblUsers.getSelectedRow() == -1)
        JOptionPane.showMessageDialog(null, "No s'ha seleccionat cap fila");
        else {
            DefaultTableModel modelTable = (DefaultTableModel) tblUsers.getModel();
            int selectedRow = tblUsers.getSelectedRow();
            int idUser =  (int) modelTable.getValueAt(selectedRow, 0);
            PrincipalController.deactivateUser(idUser);
            loadTable();
            styleTbl();
        }
    }//GEN-LAST:event_btnDeactivateUserFormActionPerformed

    private void btnActivateUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivateUserFormActionPerformed
        if (tblUsers.getSelectedRow() == -1)
        JOptionPane.showMessageDialog(null, "No s'ha seleccionat cap fila");
        else {
            DefaultTableModel modelTable = (DefaultTableModel) tblUsers.getModel();
            int selectedRow = tblUsers.getSelectedRow();
            int idUser =  (int) modelTable.getValueAt(selectedRow, 0);
            PrincipalController.activateUser(idUser);
            loadTable();
            styleTbl();
        }
    }//GEN-LAST:event_btnActivateUserFormActionPerformed

    private void btnResetPasswdUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPasswdUserFormActionPerformed
        if (tblUsers.getSelectedRow() == -1)
        JOptionPane.showMessageDialog(null, "No s'ha seleccionat cap fila");
        else {
            DefaultTableModel modelTable = (DefaultTableModel) tblUsers.getModel();
            int selectedRow = tblUsers.getSelectedRow();
            int idUser =  (int) modelTable.getValueAt(selectedRow, 0);
            PrincipalController.resetPasswdUser(idUser);
            clean();
            loadTable();
            styleTbl();
        }
    }//GEN-LAST:event_btnResetPasswdUserFormActionPerformed

    private void btnUpdateUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserFormActionPerformed
        if (tblUsers.getSelectedRow() == -1)
        JOptionPane.showMessageDialog(null, "No s'ha seleccionat cap fila");
        else {
            DefaultTableModel modelTable = (DefaultTableModel) tblUsers.getModel();
            int selectedRow = tblUsers.getSelectedRow();
            int idUser =  (int) modelTable.getValueAt(selectedRow, 0);
            String nom = (String) modelTable.getValueAt(selectedRow, 1);
            String cognom = (String) modelTable.getValueAt(selectedRow, 2);
            String correu = (String) modelTable.getValueAt(selectedRow, 4);
            String telefon = (String) modelTable.getValueAt(selectedRow, 5);
            PrincipalController.showUpdateFormUserPanel(idUser, nom, cognom, correu, telefon);
            clean();
            loadTable();
            styleTbl();
        }

    }//GEN-LAST:event_btnUpdateUserFormActionPerformed

    private void btnInsertUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertUserFormActionPerformed
        PrincipalController.showNewFormUserPanel();
        clean();
        loadTable();
        styleTbl();
    }//GEN-LAST:event_btnInsertUserFormActionPerformed

    private void txtSearchUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchUserKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchUserKeyTyped

    private void txtSearchUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchUserKeyReleased
        DefaultTableModel modelo = new DefaultTableModel();
        tblUsers.setModel(modelo);
        String where = txtSearchUser.getText();
        PrincipalController.loadTblUserWhere(modelo, where);
        styleTbl();
    }//GEN-LAST:event_txtSearchUserKeyReleased

    private void txtSearchUserCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchUserCaretUpdate
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchUserCaretUpdate

    private void BtnCloseSessionAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCloseSessionAdminActionPerformed
        PrincipalController.returnPrincipalPageFromAdminDashboard();
        clean();
        loadTable();
        styleTbl();
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
            java.util.logging.Logger.getLogger(adminUsersDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminUsersDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminUsersDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminUsersDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminUsersDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCloseSessionAdmin;
    private transient javax.swing.JLabel JLabelLogo;
    public javax.swing.JButton btnActivateUserForm;
    public javax.swing.JButton btnBackUser;
    public javax.swing.JButton btnDeactivateUserForm;
    public javax.swing.JButton btnInsertUserForm;
    public javax.swing.JButton btnResetPasswdUserForm;
    private javax.swing.JButton btnUpdateUserForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblUsers;
    public javax.swing.JTextField txtSearchUser;
    // End of variables declaration//GEN-END:variables

    public void clean() {
        txtSearchUser.setText("");
    }
    
    public void styleTbl() {
        if (tblUsers.getColumnModel().getColumnCount() > 0) {
            tblUsers.getColumnModel().getColumn(0).setPreferredWidth(15);
            tblUsers.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblUsers.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblUsers.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblUsers.getColumnModel().getColumn(4).setPreferredWidth(170);
            tblUsers.getColumnModel().getColumn(5).setPreferredWidth(50);
            tblUsers.getColumnModel().getColumn(6).setPreferredWidth(25);
        }
    }
    
    public void loadTable() {
        DefaultTableModel modelo = new DefaultTableModel();
        tblUsers.setModel(modelo);
        PrincipalController.loadTblUserWhere(modelo, txtSearchUser.getText());
    }
}
