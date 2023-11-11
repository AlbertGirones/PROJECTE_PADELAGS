/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controllers.PrincipalController;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author geri
 */
public class ReservationListCourtXCourtXDate extends javax.swing.JFrame {

    /**
     * Creates new form ReservationListCourtXCourtXDate
     */
    public ReservationListCourtXCourtXDate() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservations = new javax.swing.JTable();
        btnCancelReservation = new javax.swing.JButton();
        btnPayReservation = new javax.swing.JButton();
        nameOfReservation = new javax.swing.JLabel();
        dateOfReservation = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JLabelLogo = new javax.swing.JLabel();
        btnBackReservationListCourt = new javax.swing.JButton();
        BtnCloseSessionAdmin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(758, 1400));

        tblReservations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Horari", "ID Reserva", "DNI Reserva", "Pagament"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReservations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReservationsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReservations);
        if (tblReservations.getColumnModel().getColumnCount() > 0) {
            tblReservations.getColumnModel().getColumn(0).setResizable(false);
        }

        btnCancelReservation.setBackground(new java.awt.Color(0, 0, 153));
        btnCancelReservation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelReservation.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelReservation.setText("Cancel·lar");
        btnCancelReservation.setBorder(null);
        btnCancelReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelReservationActionPerformed(evt);
            }
        });

        btnPayReservation.setBackground(new java.awt.Color(0, 0, 153));
        btnPayReservation.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPayReservation.setForeground(new java.awt.Color(255, 255, 255));
        btnPayReservation.setText("Pagar");
        btnPayReservation.setBorder(null);
        btnPayReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayReservationActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(30, 30, 30));
        jLabel1.setText("Nom Reserva");

        jLabel3.setForeground(new java.awt.Color(30, 30, 30));
        jLabel3.setText("Data Reserva");

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(575, 84));

        JLabelLogo.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Images\\logoPadelAGWhite.png"));

        btnBackReservationListCourt.setBackground(new java.awt.Color(255, 255, 255));
        btnBackReservationListCourt.setForeground(new java.awt.Color(30, 30, 30));
        btnBackReservationListCourt.setText("Tornar...");
        btnBackReservationListCourt.setBorder(null);
        btnBackReservationListCourt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackReservationListCourtActionPerformed(evt);
            }
        });

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
                .addGap(21, 21, 21)
                .addComponent(JLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBackReservationListCourt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnCloseSessionAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBackReservationListCourt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnCloseSessionAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(30, 30, 30));
        jLabel4.setText("LLISTAT DE RESERVES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1826, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(665, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameOfReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(dateOfReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnPayReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnCancelReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(664, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameOfReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateOfReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPayReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
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

    private void btnCancelReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelReservationActionPerformed
        if (tblReservations.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        else {
            DefaultTableModel modelTable = (DefaultTableModel) tblReservations.getModel();
            int selectedRow = tblReservations.getSelectedRow();
            int idReservation =  (int) modelTable.getValueAt(selectedRow, 1);
            PrincipalController.cancelReservation(idReservation);
            String name = nameOfReservation.getText();
            String date = dateOfReservation.getText();
            PrincipalController.showReservationsXCourtWDate(name, date);
        }
    }//GEN-LAST:event_btnCancelReservationActionPerformed

    private void btnPayReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayReservationActionPerformed
        if (tblReservations.getSelectedRow() == -1)
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna fila");
        else {
            DefaultTableModel modelTable = (DefaultTableModel) tblReservations.getModel();
            int selectedRow = tblReservations.getSelectedRow();
            int idReservation =  (int) modelTable.getValueAt(selectedRow, 1);
            PrincipalController.payReservation(idReservation);
            String name = nameOfReservation.getText();
            String date = dateOfReservation.getText();
            PrincipalController.showReservationsXCourtWDate(name, date);
        }
    }//GEN-LAST:event_btnPayReservationActionPerformed

    private void btnBackReservationListCourtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackReservationListCourtActionPerformed
        PrincipalController.returnListCourt();
    }//GEN-LAST:event_btnBackReservationListCourtActionPerformed

    private void tblReservationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReservationsMouseClicked
        DefaultTableModel modelTable = (DefaultTableModel) tblReservations.getModel();
        int selectedRow = tblReservations.getSelectedRow();
        String statusReserva =  (String) modelTable.getValueAt(selectedRow, 4);
        checkCancelReserva(statusReserva);
        checkPayReserva(statusReserva);
    }//GEN-LAST:event_tblReservationsMouseClicked

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
            java.util.logging.Logger.getLogger(ReservationListCourtXCourtXDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationListCourtXCourtXDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationListCourtXCourtXDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationListCourtXCourtXDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationListCourtXCourtXDate().setVisible(true);
            }
        });
    }

    private void checkPayReserva(String statusReserva) {
        String reservationDate = dateOfReservation.getText();
        Date fechaReserva = java.sql.Date.valueOf(reservationDate);
        LocalDate fechaActual = LocalDate.now();
        Date fechaActualDate = java.sql.Date.valueOf(fechaActual);
        
        if (fechaReserva.compareTo(fechaActualDate) <= 0 && statusReserva.equals("No pagada")){
            btnPayReservation.setEnabled(true);
        }
        else{
            btnPayReservation.setEnabled(false);
        }
       
    }
    
    private void checkCancelReserva(String statusReserva) {
        String reservationDate = dateOfReservation.getText();
        Date fechaReserva = java.sql.Date.valueOf(reservationDate);
        LocalDate fechaActual = LocalDate.now();
        Date fechaActualDate = java.sql.Date.valueOf(fechaActual);
        
        if (fechaReserva.compareTo(fechaActualDate) >= 0 && statusReserva.equals("No pagada")) {
            btnCancelReservation.setEnabled(true);
        }
        else {
            btnCancelReservation.setEnabled(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCloseSessionAdmin;
    private transient javax.swing.JLabel JLabelLogo;
    public javax.swing.JButton btnBackReservationListCourt;
    public javax.swing.JButton btnCancelReservation;
    public javax.swing.JButton btnPayReservation;
    public javax.swing.JLabel dateOfReservation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel nameOfReservation;
    public javax.swing.JTable tblReservations;
    // End of variables declaration//GEN-END:variables
}
