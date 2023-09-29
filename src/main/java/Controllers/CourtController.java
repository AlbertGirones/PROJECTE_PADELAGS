
package Controllers;

import Models.Court;
import Models.courtQueries;
import Views.adminCourtsDashboard;
import Views.adminDashboard;
import javax.swing.JOptionPane;

public class CourtController {

    public static Court model = new Court();
    public static courtQueries sqlModel = new courtQueries();
    
    public static adminDashboard adminPanel = new adminDashboard();
    public static adminCourtsDashboard CourtPanel = new adminCourtsDashboard();
      
    public static void showCourtPanel () {
        CourtPanel.setVisible(true);
        CourtPanel.setTitle("Gestió pistes");
        adminPanel.setVisible(false);
        
    }
    
    public static void returnCourtPanel() {
        CourtPanel.setVisible(false);
    }
    
    
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        
//        if (e.getSource() == CourtPanel.btnInsertCourtForm) {
//            model.setName(CourtPanel.txtNameInsertCourtForm.getText());
//            model.setUbication(CourtPanel.txtUbicationInsertCourtForm.getText());
//            boolean consulta = sqlModel.insert(model);
//            if (consulta == true) {
//                JOptionPane.showMessageDialog(null, "Pista creada correctament", "dd", JOptionPane.WARNING_MESSAGE);
//                cleanText();
//            }
//            else {
//                JOptionPane.showMessageDialog(null, "Error al crear pista", "dd", JOptionPane.WARNING_MESSAGE);
//                cleanText();
//            }
//        }
//        
//        if (e.getSource() == CourtPanel.btnDeactivateCourtForm) {
//            model.setName(CourtPanel.txtNameInsertCourtForm.getText());
//            boolean consulta = sqlModel.deactivate(model);
//            if (consulta == true) {
//                JOptionPane.showMessageDialog(null, "Pista desactivada correctament", "dd", JOptionPane.WARNING_MESSAGE);
//                cleanText();
//            }
//            else {
//                JOptionPane.showMessageDialog(null, "Error al desactivar pista", "dd", JOptionPane.WARNING_MESSAGE);
//                cleanText();
//            }
//        }
//        
//        if (e.getSource() == CourtPanel.btnActivateCourtForm) {
//            model.setName(CourtPanel.txtNameInsertCourtForm.getText());
//            boolean consulta = sqlModel.activate(model);
//            if (consulta == true) {
//                JOptionPane.showMessageDialog(null, "Pista activada correctament", "dd", JOptionPane.WARNING_MESSAGE);
//                cleanText();
//            }
//            else {
//                JOptionPane.showMessageDialog(null, "Error al activar pista", "dd", JOptionPane.WARNING_MESSAGE);
//                cleanText();
//            }
//        }
//        
//    }
    
}
