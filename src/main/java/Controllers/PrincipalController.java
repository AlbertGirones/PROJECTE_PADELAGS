
package Controllers;

import Models.*;
import Views.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
    
    public void showCourtPanel (JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
        List<Court>list=sqlModel.listCourts(model);
        Object[]object=new Object[4];
        for (int i=0; i<list.size();i++) {
            object[0]=list.get(i).getId_court();
            object[1]=list.get(i).getName();
            object[2]=list.get(i).getUbication();
            modelo.addRow(object);      
            
        }
        CourtPanel.tblCourts.setModel(modelo);
        CourtPanel.setVisible(true);
        CourtPanel.setTitle("Gestió pistes");
        adminPanel.setVisible(false);
    }
    
    public static void returnCourtPanel() {
        CourtPanel.setVisible(false);
    }
    
    // COURTS METHODS
    
    // RESERVATION METHODS
    
    // USERS METHODS
    
    // GENERAL METHODS
    
}
