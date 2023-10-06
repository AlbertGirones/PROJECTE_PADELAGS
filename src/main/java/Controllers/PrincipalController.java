package Controllers;

import Models.*;
import Views.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PrincipalController {

    // INSTANCES
    private static PrincipalController instance;
    private Admin admin;
    
    // SET PRINCIPAL
    public static principalPage principalPg = new principalPage();
    public static adminDashboard adminPanel = new adminDashboard();
    public static userDashboard userPanel = new userDashboard();

    // SET LOGIN
    public static userLogin userLoginPanel = new userLogin();
    public static adminLogin adminLoginPanel = new adminLogin();

    // SET COURTS
    public static Court model = new Court();
    public static courtQueries sqlModel = new courtQueries();
    public static adminCourtsDashboard CourtPanel = new adminCourtsDashboard();
    public static adminNewCourtsForm NewformCourt = new adminNewCourtsForm();
    public static adminModifyCourtsForm ModifyFormCourt = new adminModifyCourtsForm();

    // SET RESERVATIONS
    
    // SET USERS
    public static User model2 = new User();
    public static userQueries sqlModel2 = new userQueries();
    public static adminUsersDashboard UserPanel = new adminUsersDashboard();
    public static adminNewUsersForm NewformUser = new adminNewUsersForm();


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

    public static void showCourtPanel() {
        CourtPanel.setVisible(true);
        CourtPanel.setTitle("Gestió pistes");
        adminPanel.setVisible(false);
    }

    public static void showNewFormCourtPanel() {
        NewformCourt.setVisible(true);
        CourtPanel.setTitle("Insertar pista");
        CourtPanel.setVisible(false);
    }
    
    public static void showModifyFormCourtPanel(int idCourt, String name, String ubication) {
        model.setId_court(idCourt);
        model.setName(name);
        model.setUbication(ubication);
        ModifyFormCourt.setVisible(true);
        ModifyFormCourt.setTitle("Modificar pista");
        CourtPanel.setVisible(false);
    }

//    public static void showAdminLogin() {
//        adminLoginPanel.setVisible(true);
//        adminLoginPanel.setTitle("Administració");
//        principalPg.setVisible(false);
//    }
//
//    public static void showUserLogin() {
//        userLoginPanel.setVisible(true);
//        userLoginPanel.setTitle("Panell d'usuari");
//        principalPg.setVisible(false);
//    }
    
    public static void showUserPanel() {
        UserPanel.setVisible(true);
        UserPanel.setTitle("Gestió d'usuaris");
        adminPanel.setVisible(false);
    }

    public static void showNewFormUserPanel() {
        NewformUser.setVisible(true);
        UserPanel.setTitle("Inserir usuari");
        UserPanel.setVisible(false);
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
    
    public static void returnModifyFormCourtPanel() {
        ModifyFormCourt.setVisible(false);
        CourtPanel.setTitle("Gestió pistes");
        CourtPanel.setVisible(true);
    }
    
    public static void returnUserPanel() {
        UserPanel.setVisible(false);
        adminPanel.setTitle("Administració");
        adminPanel.setVisible(true);
    }

    public static void returnNewFormUserPanel() {
        NewformUser.setVisible(false);
        UserPanel.setTitle("Gestió usuaris");
        UserPanel.setVisible(true);
    }

    // SESSION INSTANCES
    
//    public static PrincipalController getInstance() {
//        if (instance == null) {
//            instance = new PrincipalController();
//        }
//        return instance;
//    }
//
//    public void iniciarSesion(Admin admin) {
//        this.admin = admin;
//    }
//
//    public Admin obtenerAdmin() {
//        return admin;
//    }
//
//    public void cerrarSesion() {
//        admin = null;
//    }

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
        } else {
            model.setName(name);
            model.setUbication(ubication);
            boolean consulta = sqlModel.insert(model);
            if (consulta == true) {
                JOptionPane.showMessageDialog(null, "Pista creada correctament", "", JOptionPane.WARNING_MESSAGE);
                NewformCourt.setVisible(false);
                CourtPanel.setTitle("Gestió pistes");
                CourtPanel.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear pista, pista existent", "", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

    public static void modifyCourt(String name, String ubication) {
        if (name.trim().equalsIgnoreCase("") || ubication.trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Introdueix valors!", "", JOptionPane.WARNING_MESSAGE);
            ModifyFormCourt.setVisible(false);
            CourtPanel.setTitle("Gestió pistes");
            CourtPanel.setVisible(true);
        } else {
            model.setName(name);
            model.setUbication(ubication);
            boolean consulta = sqlModel.modify(model);
            if (consulta == true) {
                JOptionPane.showMessageDialog(null, "Pista modificada correctament", "", JOptionPane.WARNING_MESSAGE);
                ModifyFormCourt.setVisible(false);
                CourtPanel.setTitle("Gestió pistes");
                CourtPanel.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar pista, pista existent", "", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public static void activateCourt(int idCourt) {
        boolean consulta = sqlModel.activate(idCourt);
        if (consulta == true) {
            JOptionPane.showMessageDialog(null, "Pista activada correctament", "dd", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al activar pista", "dd", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static void maintenanceCourt(int idCourt) {
        boolean consulta = sqlModel.maintenance(idCourt);
        if (consulta == true) {
            JOptionPane.showMessageDialog(null, "Pista en manteniment", "dd", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al establir el manteniment en la pista", "dd", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void deactivateCourt(int idCourt) {
        boolean consulta = sqlModel.deactivate(idCourt);
        if (consulta == true) {
            JOptionPane.showMessageDialog(null, "Pista desactivada correctament", "dd", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al desactivar pista", "dd", JOptionPane.WARNING_MESSAGE);
        }
    }

    // RESERVATION METHODS
    
    // USERS METHODS
    
    public static void loadTblUser(DefaultTableModel modelo) {
        boolean consulta = sqlModel2.loadTbl(modelo);
    }

    public static void loadTblUserWhere(DefaultTableModel modelo, String where) {
        String dni = where;
        boolean consulta = sqlModel2.loadTblWhere(modelo, dni);
    }

    public static void insertUser(String name, String surname, String dni, String mail, String phone, String passwd) {

        if (name.trim().equalsIgnoreCase("") || surname.trim().equalsIgnoreCase("") || dni.trim().equalsIgnoreCase("") || mail.trim().equalsIgnoreCase("") || phone.trim().equalsIgnoreCase("") || passwd.trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Introdueix valors!", "", JOptionPane.WARNING_MESSAGE);
            NewformUser.setVisible(false);
            UserPanel.setTitle("Gestió usuaris");
            UserPanel.setVisible(true);
        } else {
            model2.setName(name);
            model2.setSurname(surname);
            model2.setDni(dni);
            model2.setMail(mail);
            model2.setPhone(phone);
            model2.setPasswd(passwd);

            boolean consulta = sqlModel2.insert(model2);
            if (consulta == true) {
                JOptionPane.showMessageDialog(null, "Usuari creat correctament", "", JOptionPane.WARNING_MESSAGE);
                NewformUser.setVisible(false);
                UserPanel.setTitle("Gestió usuaris");
                UserPanel.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear usuari, usuari existent", "", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

//    public static updateCourt() {
//        
//    }
    
    public static void activateUser(int idUser) {
        boolean consulta = sqlModel2.activate(idUser);
        if (consulta == true) {
            JOptionPane.showMessageDialog(null, "Usuari activat correctament", "dd", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al activar usuari", "dd", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void deactivateUser(int idUser) {
        boolean consulta = sqlModel2.deactivate(idUser);
        if (consulta == true) {
            JOptionPane.showMessageDialog(null, "Usuari desactivat correctament", "dd", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al desactivar l'usuari", "dd", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // GENERAL METHODS
}
