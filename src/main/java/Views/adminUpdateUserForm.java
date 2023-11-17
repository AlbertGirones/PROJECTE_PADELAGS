
package Views;

import Controllers.PrincipalController;
import Models.User;
import java.awt.Color;
import javax.swing.JOptionPane;

public class adminUpdateUserForm extends javax.swing.JFrame {

    public adminUpdateUserForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNameUpdateUserForm = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSurnameUpdateUserForm = new javax.swing.JTextField();
        txtMailUpdateUserForm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPhoneUpdateUserForm = new javax.swing.JTextField();
        btnUpdateUserForm = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        JLabelLogo = new javax.swing.JLabel();
        btnBackUpdateUser = new javax.swing.JButton();
        BtnCloseSessionAdmin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(758, 1400));

        txtNameUpdateUserForm.setForeground(new java.awt.Color(30, 30, 30));
        txtNameUpdateUserForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNameUpdateUserForm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameUpdateUserFormFocusLost(evt);
            }
        });
        txtNameUpdateUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameUpdateUserFormActionPerformed(evt);
            }
        });
        txtNameUpdateUserForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameUpdateUserFormKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Nom");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 30, 30));
        jLabel2.setText("Cognom");

        txtSurnameUpdateUserForm.setForeground(new java.awt.Color(30, 30, 30));
        txtSurnameUpdateUserForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSurnameUpdateUserForm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSurnameUpdateUserFormFocusLost(evt);
            }
        });
        txtSurnameUpdateUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurnameUpdateUserFormActionPerformed(evt);
            }
        });
        txtSurnameUpdateUserForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSurnameUpdateUserFormKeyTyped(evt);
            }
        });

        txtMailUpdateUserForm.setForeground(new java.awt.Color(30, 30, 30));
        txtMailUpdateUserForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMailUpdateUserForm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMailUpdateUserFormFocusLost(evt);
            }
        });
        txtMailUpdateUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailUpdateUserFormActionPerformed(evt);
            }
        });
        txtMailUpdateUserForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMailUpdateUserFormKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(30, 30, 30));
        jLabel4.setText("Correu");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(30, 30, 30));
        jLabel5.setText("Telèfon");

        txtPhoneUpdateUserForm.setForeground(new java.awt.Color(30, 30, 30));
        txtPhoneUpdateUserForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPhoneUpdateUserForm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhoneUpdateUserFormFocusLost(evt);
            }
        });
        txtPhoneUpdateUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneUpdateUserFormActionPerformed(evt);
            }
        });
        txtPhoneUpdateUserForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneUpdateUserFormKeyTyped(evt);
            }
        });

        btnUpdateUserForm.setBackground(new java.awt.Color(0, 0, 153));
        btnUpdateUserForm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUpdateUserForm.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateUserForm.setText("Actualitzar");
        btnUpdateUserForm.setBorder(null);
        btnUpdateUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUserFormActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        JLabelLogo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Images\\logoPadelAGWhite.png"));

        btnBackUpdateUser.setForeground(new java.awt.Color(30, 30, 30));
        btnBackUpdateUser.setText("Tornar ...");
        btnBackUpdateUser.setBorder(null);
        btnBackUpdateUser.setBorderPainted(false);
        btnBackUpdateUser.setFocusPainted(false);
        btnBackUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackUpdateUserActionPerformed(evt);
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
                .addGap(21, 21, 21)
                .addComponent(JLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1471, Short.MAX_VALUE)
                .addComponent(btnBackUpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BtnCloseSessionAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BtnCloseSessionAdmin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBackUpdateUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 30, 30));
        jLabel3.setText("ACTUALITZA L'USUARI");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNameUpdateUserForm)
                    .addComponent(txtSurnameUpdateUserForm)
                    .addComponent(txtMailUpdateUserForm)
                    .addComponent(txtPhoneUpdateUserForm)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUpdateUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameUpdateUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSurnameUpdateUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(7, 7, 7)
                .addComponent(txtMailUpdateUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhoneUpdateUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1826, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameUpdateUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameUpdateUserFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameUpdateUserFormActionPerformed

    private void txtPhoneUpdateUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneUpdateUserFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneUpdateUserFormActionPerformed

    private void btnUpdateUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUserFormActionPerformed
        String name = txtNameUpdateUserForm.getText();
        String surname = txtSurnameUpdateUserForm.getText();
        String mail = txtMailUpdateUserForm.getText();
        String phone = txtPhoneUpdateUserForm.getText();

        PrincipalController.modifyUser(name, surname, mail, phone);
    }//GEN-LAST:event_btnUpdateUserFormActionPerformed

    private void txtSurnameUpdateUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurnameUpdateUserFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSurnameUpdateUserFormActionPerformed

    private void txtMailUpdateUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailUpdateUserFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailUpdateUserFormActionPerformed

    private void txtNameUpdateUserFormFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameUpdateUserFormFocusLost
        String name = txtNameUpdateUserForm.getText().trim();
    
        if (name.matches("^[a-zA-Z]+")) {
            txtNameUpdateUserForm.setBackground(Color.GREEN);
        }
        ActivateUpdateButton();
    }//GEN-LAST:event_txtNameUpdateUserFormFocusLost

    private void txtSurnameUpdateUserFormFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSurnameUpdateUserFormFocusLost
        String surname = txtSurnameUpdateUserForm.getText().trim();
    
        if (surname.matches("^[a-zA-Z]+")) {
            txtSurnameUpdateUserForm.setBackground(Color.GREEN);
        }
        ActivateUpdateButton();
    }//GEN-LAST:event_txtSurnameUpdateUserFormFocusLost

    private void txtMailUpdateUserFormFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailUpdateUserFormFocusLost
        String email = txtMailUpdateUserForm.getText().trim();
        String emailPattern = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";

        if (email.matches(emailPattern)) {
            txtMailUpdateUserForm.setBackground(Color.GREEN);
        }
        ActivateUpdateButton();
    }//GEN-LAST:event_txtMailUpdateUserFormFocusLost

    private void txtPhoneUpdateUserFormFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneUpdateUserFormFocusLost
        String phoneNumber = txtPhoneUpdateUserForm.getText().trim();
    
        if (phoneNumber.matches("\\d+")) {
            txtPhoneUpdateUserForm.setBackground(Color.GREEN);
        }
        ActivateUpdateButton();
    }//GEN-LAST:event_txtPhoneUpdateUserFormFocusLost

    private void txtNameUpdateUserFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameUpdateUserFormKeyTyped
        String name = txtNameUpdateUserForm.getText().trim();

        if (!name.matches("^[a-zA-Z]+")) {
            txtNameUpdateUserForm.setBackground(Color.RED);
        }
        ActivateUpdateButton();
    }//GEN-LAST:event_txtNameUpdateUserFormKeyTyped

    private void txtSurnameUpdateUserFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSurnameUpdateUserFormKeyTyped
    String surname = txtSurnameUpdateUserForm.getText().trim();

        if (!surname.matches("^[a-zA-Z]+")) {
            txtSurnameUpdateUserForm.setBackground(Color.RED);
        }
        ActivateUpdateButton();
    }//GEN-LAST:event_txtSurnameUpdateUserFormKeyTyped

    private void txtMailUpdateUserFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailUpdateUserFormKeyTyped
        String email = txtMailUpdateUserForm.getText().trim();
        String emailPattern = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";

        if (!email.matches(emailPattern)) {
            txtMailUpdateUserForm.setBackground(Color.RED);
        }
        ActivateUpdateButton();
    }//GEN-LAST:event_txtMailUpdateUserFormKeyTyped

    private void txtPhoneUpdateUserFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneUpdateUserFormKeyTyped
        String phoneNumber = txtPhoneUpdateUserForm.getText().trim();

        if (!phoneNumber.matches("\\d+")) {
            txtPhoneUpdateUserForm.setBackground(Color.RED);
        }
        ActivateUpdateButton();
    }//GEN-LAST:event_txtPhoneUpdateUserFormKeyTyped

    private void btnBackUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackUpdateUserActionPerformed
        PrincipalController.returnModifyFormUserPanel();
        txtNameUpdateUserForm.setBackground(Color.WHITE);
        txtSurnameUpdateUserForm.setBackground(Color.WHITE);
        txtMailUpdateUserForm.setBackground(Color.WHITE);
        txtPhoneUpdateUserForm.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnBackUpdateUserActionPerformed

    private void BtnCloseSessionAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCloseSessionAdminActionPerformed
        PrincipalController.returnPrincipalPageFromAdminDashboard();
    }//GEN-LAST:event_BtnCloseSessionAdminActionPerformed

    private void ActivateUpdateButton(){
        String name = txtNameUpdateUserForm.getText().trim();
        String surname = txtSurnameUpdateUserForm.getText().trim();
        String email = txtMailUpdateUserForm.getText().trim();
        String phoneNumber = txtPhoneUpdateUserForm.getText().trim();

        if(!name.matches("^[a-zA-Z]+") || !surname.matches("^[a-zA-Z]+") || !email.matches("^[a-zA-Z0-9._%+-]+@gmail\\.com$") || !phoneNumber.matches("\\d+")){
            btnUpdateUserForm.setEnabled(false);
        }
        else{
            btnUpdateUserForm.setEnabled(true);
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
            java.util.logging.Logger.getLogger(adminUpdateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminUpdateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminUpdateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminUpdateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminUpdateUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCloseSessionAdmin;
    private transient javax.swing.JLabel JLabelLogo;
    public javax.swing.JButton btnBackUpdateUser;
    private javax.swing.JButton btnUpdateUserForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtMailUpdateUserForm;
    public javax.swing.JTextField txtNameUpdateUserForm;
    public javax.swing.JTextField txtPhoneUpdateUserForm;
    public javax.swing.JTextField txtSurnameUpdateUserForm;
    // End of variables declaration//GEN-END:variables
}
