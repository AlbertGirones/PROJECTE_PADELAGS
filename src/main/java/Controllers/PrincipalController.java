
package Controllers;

import Models.*;
import Views.*;
import javax.swing.table.DefaultTableModel;

public class PrincipalController {
    
    // SET PRINCIPAL
    
    public static principalPage principalPg = new principalPage();
    public static adminDashboard adminPanel = new adminDashboard();
    
    // SET COURTS
    
    public static Court model = new Court();
    public static courtQueries sqlModel = new courtQueries();
    public static adminCourtsDashboard CourtPanel = new adminCourtsDashboard();
    
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
    
    public static void returnCourtPanel() {
        CourtPanel.setVisible(false);
        adminPanel.setTitle("Administració");
        adminPanel.setVisible(true);
    }
    
    // COURTS METHODS
    
    public static void loadTblCourt(DefaultTableModel modelo) {
        boolean consulta = sqlModel.loadTbl(modelo);
    }
    
    public static void loadTblCourtWhere(DefaultTableModel modelo, String where) {
        String name = where;
        boolean consulta = sqlModel.loadTblWhere(modelo, name);
    }
    
    // RESERVATION METHODS
    
    // USERS METHODS
    
    // GENERAL METHODS
    
}
