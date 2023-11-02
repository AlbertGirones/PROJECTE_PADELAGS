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

        nameOfReservation = new javax.swing.JLabel();
        dateOfReservation = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservations = new javax.swing.JTable();
        btnCancelReservation = new javax.swing.JButton();
        btnPayReservation = new javax.swing.JButton();
        btnBackReservationListCourt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        btnCancelReservation.setText("Cancel");
        btnCancelReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelReservationActionPerformed(evt);
            }
        });

        btnPayReservation.setText("Pagar");
        btnPayReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayReservationActionPerformed(evt);
            }
        });

        btnBackReservationListCourt.setText("Volver ...");
        btnBackReservationListCourt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackReservationListCourtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameOfReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateOfReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBackReservationListCourt)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPayReservation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelReservation))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnBackReservationListCourt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameOfReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateOfReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelReservation)
                    .addComponent(btnPayReservation))
                .addContainerGap(76, Short.MAX_VALUE))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackReservationListCourtActionPerformed

    private void tblReservationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReservationsMouseClicked
        DefaultTableModel modelTable = (DefaultTableModel) tblReservations.getModel();
        int selectedRow = tblReservations.getSelectedRow();
        String statusReserva =  (String) modelTable.getValueAt(selectedRow, 4);
        checkCancelReserva(statusReserva);
        checkPayReserva(statusReserva);
    }//GEN-LAST:event_tblReservationsMouseClicked

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
        System.out.println(fechaReserva);
        LocalDate fechaActual = LocalDate.now();
        Date fechaActualDate = java.sql.Date.valueOf(fechaActual);
        System.out.println(fechaActual);
                
        System.out.println(fechaActualDate.compareTo(fechaReserva) > 0);
        System.out.println(statusReserva.equals("Pagada"));
        
        if (fechaReserva.compareTo(fechaActualDate) <= 0 && statusReserva.equals("No pagada")){
            btnPayReservation.setEnabled(true);
        }
        else{
            btnPayReservation.setEnabled(false);
        }
       
    }
    
    private void checkCancelReserva(String statusReserva) {
        if (statusReserva.equals("No pagada")) {
            btnCancelReservation.setEnabled(true);
        }
        else {
            btnCancelReservation.setEnabled(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBackReservationListCourt;
    public javax.swing.JButton btnCancelReservation;
    public javax.swing.JButton btnPayReservation;
    public javax.swing.JLabel dateOfReservation;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel nameOfReservation;
    public javax.swing.JTable tblReservations;
    // End of variables declaration//GEN-END:variables
}
