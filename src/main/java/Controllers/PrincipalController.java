
package Controllers;

import Models.*;
import Views.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrincipalController {
    
    // SET PRINCIPAL
    
    public static principalPage principalPg = new principalPage();
    public static adminDashboard adminPanel = new adminDashboard();
    
    // SET LOGIN
    
    // SET COURTS
    
    public static Court model = new Court();
    public static courtQueries sqlModel = new courtQueries();
    public static adminCourtsDashboard CourtPanel = new adminCourtsDashboard();
    public static adminNewCourtsForm NewformCourt = new adminNewCourtsForm();
    
    // SET RESERVATIONS
    
    // SET USERS
        
    // INI
    
    public void iniciar() {
        principalPg.setVisible(true);
        principalPg.setTitle("Pagina principal");
    }
    
    // SHOW AND CLOSES
    
    public static void showAdminLogin() {
        adminPanel.setVisible(true);
        adminPanel.setTitle("Administració");
        principalPg.setVisible(false);
    }
    
    public static void showCourtPanel () {
        CourtPanel.setVisible(true);
        CourtPanel.setTitle("Gestió pistes");
        adminPanel.setVisible(false);
    }
    
    public static void showNewFormCourtPanel() {
        NewformCourt.setVisible(true);
        CourtPanel.setTitle("Insertar pista");
        CourtPanel.setVisible(false);
    }
    
    // RETURNS
    
    public static void returnCourtPanel() {
        CourtPanel.setVisible(false);
        adminPanel.setTitle("Administració");
        adminPanel.setVisible(true);
    }
    
    public static void returnNewFormCourtPanel() {
        NewformCourt.setVisible(false);
        CourtPanel.setTitle("Gestió pistes");
        CourtPanel.setVisible(true);
    }
    
    
    
    // COURTS METHODS
    
    public static void loadTblCourt(DefaultTableModel modelo) {
        boolean consulta = sqlModel.loadTbl(modelo);
    }
    
    public static void loadTblCourtWhere(DefaultTableModel modelo, String where) {
        String name = where;
        boolean consulta = sqlModel.loadTblWhere(modelo, name);
    }
    
    public static void insertCourt(String name, String ubication) {
        
        if (name.trim().equalsIgnoreCase("") || ubication.trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Introdueix valors!", "", JOptionPane.WARNING_MESSAGE);
            NewformCourt.setVisible(false);
            CourtPanel.setTitle("Gestió pistes");
            CourtPanel.setVisible(true);
        }
        else {
            model.setName(name);
            model.setUbication(ubication);
            boolean consulta = sqlModel.insert(model);
            if (consulta == true) {
            JOptionPane.showMessageDialog(null, "Pista creada correctament", "", JOptionPane.WARNING_MESSAGE);
            NewformCourt.setVisible(false);
            CourtPanel.setTitle("Gestió pistes");
            CourtPanel.setVisible(true);
            }
            else {
            JOptionPane.showMessageDialog(null, "Error al crear pista, pista existent", "", JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }
    
//    public static updateCourt() {
//        
//    }
    
    public static void activateCourt(int idCourt) {
        boolean consulta = sqlModel.activate(idCourt);
        if (consulta == true) {
            JOptionPane.showMessageDialog(null, "Pista activada correctament", "dd", JOptionPane.WARNING_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Error al activar pista", "dd", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static void deactivateCourt(int idCourt) {
        boolean consulta = sqlModel.deactivate(idCourt);
        if (consulta == true) {
            JOptionPane.showMessageDialog(null, "Pista desactivada correctament", "dd", JOptionPane.WARNING_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Error al desactivar pista", "dd", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // RESERVATION METHODS
    
    // USERS METHODS
    
    // GENERAL METHODS
    
}
