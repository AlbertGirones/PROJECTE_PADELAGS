
package Views;

import Controllers.PrincipalController;
import java.awt.Color;
import javax.swing.JOptionPane;

public class adminNewUsersForm extends javax.swing.JFrame {

    /**
     * Creates new form adminNewUsersForm
     */
    public adminNewUsersForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnBackNewUser.setBackground(null);
        btnBackNewUser.setContentAreaFilled(false);
        btnBackNewUser.setFocusPainted(false);
        txtDniInsertUserForm.setText("");
        txtNameInsertUserForm.setText("");
        txtSurnameInsertUserForm.setText("");
        txtMailInsertUserForm.setText("");
        txtPhoneInsertUserForm.setText("");
        txtPasswdInsertUserForm.setText("");        
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnInsertUserForm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNameInsertUserForm = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSurnameInsertUserForm = new javax.swing.JTextField();
        txtPasswdInsertUserForm = new javax.swing.JTextField();
        txtMailInsertUserForm = new javax.swing.JTextField();
        txtPhoneInsertUserForm = new javax.swing.JTextField();
        txtDniInsertUserForm = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JLabelLogo = new javax.swing.JLabel();
        btnBackNewUser = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(575, 445));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(30, 30, 30));
        jLabel4.setText("Correu");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(30, 30, 30));
        jLabel5.setText("Telèfon");

        btnInsertUserForm.setBackground(new java.awt.Color(0, 0, 153));
        btnInsertUserForm.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnInsertUserForm.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertUserForm.setText("Registrar");
        btnInsertUserForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnInsertUserForm.setBorderPainted(false);
        btnInsertUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertUserFormActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Nom");

        txtNameInsertUserForm.setBackground(new java.awt.Color(255, 255, 255));
        txtNameInsertUserForm.setForeground(new java.awt.Color(30, 30, 30));
        txtNameInsertUserForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNameInsertUserForm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameInsertUserFormFocusLost(evt);
            }
        });
        txtNameInsertUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameInsertUserFormActionPerformed(evt);
            }
        });
        txtNameInsertUserForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameInsertUserFormKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(30, 30, 30));
        jLabel6.setText("Contrasenya");

        txtSurnameInsertUserForm.setBackground(new java.awt.Color(255, 255, 255));
        txtSurnameInsertUserForm.setForeground(new java.awt.Color(30, 30, 30));
        txtSurnameInsertUserForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSurnameInsertUserForm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSurnameInsertUserFormFocusLost(evt);
            }
        });
        txtSurnameInsertUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurnameInsertUserFormActionPerformed(evt);
            }
        });
        txtSurnameInsertUserForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSurnameInsertUserFormKeyTyped(evt);
            }
        });

        txtPasswdInsertUserForm.setBackground(new java.awt.Color(255, 255, 255));
        txtPasswdInsertUserForm.setForeground(new java.awt.Color(30, 30, 30));
        txtPasswdInsertUserForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPasswdInsertUserForm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswdInsertUserFormFocusLost(evt);
            }
        });
        txtPasswdInsertUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswdInsertUserFormActionPerformed(evt);
            }
        });
        txtPasswdInsertUserForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswdInsertUserFormKeyTyped(evt);
            }
        });

        txtMailInsertUserForm.setBackground(new java.awt.Color(255, 255, 255));
        txtMailInsertUserForm.setForeground(new java.awt.Color(30, 30, 30));
        txtMailInsertUserForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMailInsertUserForm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMailInsertUserFormFocusLost(evt);
            }
        });
        txtMailInsertUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMailInsertUserFormActionPerformed(evt);
            }
        });
        txtMailInsertUserForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMailInsertUserFormKeyTyped(evt);
            }
        });

        txtPhoneInsertUserForm.setBackground(new java.awt.Color(255, 255, 255));
        txtPhoneInsertUserForm.setForeground(new java.awt.Color(30, 30, 30));
        txtPhoneInsertUserForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPhoneInsertUserForm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhoneInsertUserFormFocusLost(evt);
            }
        });
        txtPhoneInsertUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneInsertUserFormActionPerformed(evt);
            }
        });
        txtPhoneInsertUserForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneInsertUserFormKeyTyped(evt);
            }
        });

        txtDniInsertUserForm.setBackground(new java.awt.Color(255, 255, 255));
        txtDniInsertUserForm.setForeground(new java.awt.Color(30, 30, 30));
        txtDniInsertUserForm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDniInsertUserForm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDniInsertUserFormFocusLost(evt);
            }
        });
        txtDniInsertUserForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniInsertUserFormActionPerformed(evt);
            }
        });
        txtDniInsertUserForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniInsertUserFormKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(30, 30, 30));
        jLabel2.setText("Cognom");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 30, 30));
        jLabel3.setText("DNI");

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(372, 84));

        JLabelLogo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Images\\logoPadelAGWhite.png"));

        btnBackNewUser.setForeground(new java.awt.Color(255, 255, 255));
        btnBackNewUser.setText("Tornar ...");
        btnBackNewUser.setBorder(null);
        btnBackNewUser.setBorderPainted(false);
        btnBackNewUser.setFocusPainted(false);
        btnBackNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackNewUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, Short.MAX_VALUE)
                .addComponent(btnBackNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(JLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnBackNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(30, 30, 30));
        jLabel7.setText("AFEGIR USUARI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNameInsertUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtSurnameInsertUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(txtDniInsertUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtPhoneInsertUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6)
                                .addComponent(btnInsertUserForm, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                .addComponent(txtPasswdInsertUserForm))
                            .addComponent(txtMailInsertUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameInsertUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSurnameInsertUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDniInsertUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhoneInsertUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMailInsertUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPasswdInsertUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInsertUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDniInsertUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniInsertUserFormActionPerformed

    }//GEN-LAST:event_txtDniInsertUserFormActionPerformed

    private void txtDniInsertUserFormFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniInsertUserFormFocusLost
        String dni = txtDniInsertUserForm.getText().trim();
        String dniPattern = "\\d{8}[A-Za-z]";

        if (dni.matches(dniPattern)) {
            txtDniInsertUserForm.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_txtDniInsertUserFormFocusLost

    private void txtPhoneInsertUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneInsertUserFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneInsertUserFormActionPerformed

    private void txtPhoneInsertUserFormFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneInsertUserFormFocusLost
        String phoneNumber = txtPhoneInsertUserForm.getText().trim();

        if (phoneNumber.matches("\\d+")) {
            txtPhoneInsertUserForm.setBackground(Color.GREEN);
        } 
    }//GEN-LAST:event_txtPhoneInsertUserFormFocusLost

    private void txtMailInsertUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMailInsertUserFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMailInsertUserFormActionPerformed

    private void txtMailInsertUserFormFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMailInsertUserFormFocusLost
        String email = txtMailInsertUserForm.getText().trim();
        String emailPattern = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";

        if (email.matches(emailPattern)) {
            txtMailInsertUserForm.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_txtMailInsertUserFormFocusLost

    private void txtPasswdInsertUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswdInsertUserFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswdInsertUserFormActionPerformed

    private void txtPasswdInsertUserFormFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswdInsertUserFormFocusLost
        String password = txtPasswdInsertUserForm.getText().trim();

        if (!password.isEmpty()) {
            txtPasswdInsertUserForm.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_txtPasswdInsertUserFormFocusLost

    private void txtSurnameInsertUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurnameInsertUserFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSurnameInsertUserFormActionPerformed

    private void txtSurnameInsertUserFormFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSurnameInsertUserFormFocusLost
        String surname = txtSurnameInsertUserForm.getText().trim();

        if (surname.matches("^[a-zA-Z]+")) {
            txtSurnameInsertUserForm.setBackground(Color.GREEN);
        } 
    }//GEN-LAST:event_txtSurnameInsertUserFormFocusLost

    private void txtNameInsertUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameInsertUserFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameInsertUserFormActionPerformed

    private void txtNameInsertUserFormFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameInsertUserFormFocusLost
        String name = txtNameInsertUserForm.getText().trim();

        if (name.matches("^[a-zA-Z]+")) {
            txtNameInsertUserForm.setBackground(Color.GREEN);
        }
    }//GEN-LAST:event_txtNameInsertUserFormFocusLost

    private void btnInsertUserFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertUserFormActionPerformed
        String name = txtNameInsertUserForm.getText();
        String surname = txtSurnameInsertUserForm.getText();
        String dni = txtDniInsertUserForm.getText();
        String mail = txtMailInsertUserForm.getText();
        String phone = txtPhoneInsertUserForm.getText();
        String passwd = txtPasswdInsertUserForm.getText();

        PrincipalController.insertUser(name, surname, dni, mail, phone, passwd);
    }//GEN-LAST:event_btnInsertUserFormActionPerformed

    private void btnBackNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackNewUserActionPerformed
        PrincipalController.returnNewFormUserPanel();
    }//GEN-LAST:event_btnBackNewUserActionPerformed

    private void txtDniInsertUserFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniInsertUserFormKeyTyped
        String dni = txtDniInsertUserForm.getText().trim();
        String dniPattern = "\\d{8}[A-Za-z]";

        if (!dni.matches(dniPattern)) {
            txtDniInsertUserForm.setBackground(Color.RED);
        }
    }//GEN-LAST:event_txtDniInsertUserFormKeyTyped

    private void txtPhoneInsertUserFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneInsertUserFormKeyTyped
        String phoneNumber = txtPhoneInsertUserForm.getText().trim();

        if (!phoneNumber.matches("\\d+")) {
            txtPhoneInsertUserForm.setBackground(Color.RED);
        } 
    }//GEN-LAST:event_txtPhoneInsertUserFormKeyTyped

    private void txtNameInsertUserFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameInsertUserFormKeyTyped
        String name = txtNameInsertUserForm.getText().trim();

        if (!name.matches("^[a-zA-Z]+")) {
            txtNameInsertUserForm.setBackground(Color.RED);
        }
    }//GEN-LAST:event_txtNameInsertUserFormKeyTyped

    private void txtSurnameInsertUserFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSurnameInsertUserFormKeyTyped
        String surname = txtSurnameInsertUserForm.getText().trim();

        if (!surname.matches("^[a-zA-Z]+")) {
            txtSurnameInsertUserForm.setBackground(Color.RED);
        } 
    }//GEN-LAST:event_txtSurnameInsertUserFormKeyTyped

    private void txtMailInsertUserFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailInsertUserFormKeyTyped
        String email = txtMailInsertUserForm.getText().trim();
        String emailPattern = "^[a-zA-Z0-9._%+-]+@gmail\\.com$";

        if (!email.matches(emailPattern)) {
            txtMailInsertUserForm.setBackground(Color.RED);
        }
    }//GEN-LAST:event_txtMailInsertUserFormKeyTyped

    private void txtPasswdInsertUserFormKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswdInsertUserFormKeyTyped
        String password = txtPasswdInsertUserForm.getText().trim();

        if (password.isEmpty()) {
            txtPasswdInsertUserForm.setBackground(Color.RED);
        }
    }//GEN-LAST:event_txtPasswdInsertUserFormKeyTyped
    
    private void habilitarBotonRegistro() {
        btnInsertUserForm.setEnabled(true);
    }

    private void deshabilitarBotonRegistro() {
        btnInsertUserForm.setEnabled(false);
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
            java.util.logging.Logger.getLogger(adminNewUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminNewUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminNewUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminNewUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminNewUsersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private transient javax.swing.JLabel JLabelLogo;
    public javax.swing.JButton btnBackNewUser;
    public javax.swing.JButton btnInsertUserForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField txtDniInsertUserForm;
    public javax.swing.JTextField txtMailInsertUserForm;
    public javax.swing.JTextField txtNameInsertUserForm;
    public javax.swing.JTextField txtPasswdInsertUserForm;
    public javax.swing.JTextField txtPhoneInsertUserForm;
    public javax.swing.JTextField txtSurnameInsertUserForm;
    // End of variables declaration//GEN-END:variables
}
