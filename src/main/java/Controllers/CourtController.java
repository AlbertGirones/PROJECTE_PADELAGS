
package Controllers;

import Models.Court;
import Models.courtQueries;
import Views.insertForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CourtController implements ActionListener {
    
    private final Court model;
    private final courtQueries sqlModel;
    private final insertForm insertForm;
    
    public CourtController(Court model, courtQueries sqlModel, insertForm insertForm) {
        
        this.model = model;
        this.sqlModel = sqlModel;
        this.insertForm = insertForm;
        this.insertForm.btnInsertCourtForm.addActionListener(this);
        this.insertForm.btnDeactivateCourtForm.addActionListener(this);
        this.insertForm.btnActivateCourtForm.addActionListener(this);
        
    }

    public void iniciar() {
        insertForm.setTitle("Registrar");
        insertForm.setLocationRelativeTo(null);
        insertForm.txtNameInsertCourtForm.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == insertForm.btnInsertCourtForm) {
            model.setName(insertForm.txtNameInsertCourtForm.getText());
            model.setUbication(insertForm.txtUbicationInsertCourtForm.getText());
            boolean consulta = sqlModel.insert(model);
            if (consulta == true) {
                JOptionPane.showMessageDialog(null, "Pista creada correctament", "dd", JOptionPane.WARNING_MESSAGE);
                cleanText();
            }
            else {
                JOptionPane.showMessageDialog(null, "Error al crear pista", "dd", JOptionPane.WARNING_MESSAGE);
                cleanText();
            }
        }
        
        if (e.getSource() == insertForm.btnDeactivateCourtForm) {
            model.setName(insertForm.txtNameInsertCourtForm.getText());
            boolean consulta = sqlModel.deactivate(model);
            if (consulta == true) {
                JOptionPane.showMessageDialog(null, "Pista desactivada correctament", "dd", JOptionPane.WARNING_MESSAGE);
                cleanText();
            }
            else {
                JOptionPane.showMessageDialog(null, "Error al desactivar pista", "dd", JOptionPane.WARNING_MESSAGE);
                cleanText();
            }
        }
        
        if (e.getSource() == insertForm.btnActivateCourtForm) {
            model.setName(insertForm.txtNameInsertCourtForm.getText());
            boolean consulta = sqlModel.activate(model);
            if (consulta == true) {
                JOptionPane.showMessageDialog(null, "Pista activada correctament", "dd", JOptionPane.WARNING_MESSAGE);
                cleanText();
            }
            else {
                JOptionPane.showMessageDialog(null, "Error al activar pista", "dd", JOptionPane.WARNING_MESSAGE);
                cleanText();
            }
        }
        
    }
    
    public void cleanText() {
        insertForm.txtNameInsertCourtForm.setText(null);
        insertForm.txtUbicationInsertCourtForm.setText(null);
    }
    
}
