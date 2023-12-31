package Controllers;

import Models.*;
import Views.*;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PrincipalController {
  
    // SET PRINCIPAL
    public static principalPage principalPg = new principalPage();
    public static adminDashboard adminPanel = new adminDashboard();
    public static userProfileDashboard userPanel = new userProfileDashboard();
    public static userTrueReservation trueReservationUser = new userTrueReservation();

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
    
    public static Reservation model4 = new Reservation();
    public static reservationQueries sqlModel4 = new reservationQueries();
    public static adminReservationListCourt ReservationListCourt = new adminReservationListCourt();
    public static ReservationListCourtXCourtXDate ReservationListCourtXCourtXDate = new ReservationListCourtXCourtXDate();
    
    
    // SET USERS
    public static User model2 = new User();
    public static userQueries sqlModel2 = new userQueries();
    public static adminUsersDashboard UserPanel = new adminUsersDashboard();
    public static adminNewUsersForm NewformUser = new adminNewUsersForm();
    public static adminUpdateUserForm UpdateFormUser = new adminUpdateUserForm();
    public static userMyReservationsDashboard MyReservationsDashboard = new userMyReservationsDashboard();
    public static userReservationsDashboard ReservationsDashboard = new userReservationsDashboard();
    public static userChangePassword ChangePasswordUser = new userChangePassword();

    // SET ADMIN
    public static Admin model3 = new Admin();
    public static adminQueries sqlModel3 = new adminQueries();

    
    
    // INI
    public void iniciar() {
        principalPg.setVisible(true);
        principalPg.setTitle("Pagina principal");
    }

    // SHOW AND CLOSES
    
    public static void showAdminLogin() {
        adminLoginPanel.setVisible(true);
        adminLoginPanel.setTitle("Administració");
        principalPg.setVisible(false);
    }

    public static void showCourtPanel() {
        CourtPanel.setVisible(true);
        CourtPanel.setTitle("Gestió pistes");
        adminPanel.setVisible(false);
    }

    public static void showNewFormCourtPanel() {
        NewformCourt.txtNameInsertCourtForm.setText("");
        NewformCourt.txtUbicationInsertCourtForm.setText("");
        NewformCourt.txtNameInsertCourtForm.setBackground(Color.WHITE);
        NewformCourt.txtUbicationInsertCourtForm.setBackground(Color.WHITE);
        
        NewformCourt.setVisible(true);
        CourtPanel.setTitle("Insertar pista");
        CourtPanel.setVisible(false);
    }
    
    public static void showModifyFormCourtPanel(int idCourt, String name, String ubication) {
        model.setId_court(idCourt);
        model.setName(name);
        model.setUbication(ubication);
        ModifyFormCourt.txtNameModifyCourtForm.setBackground(Color.WHITE);
        ModifyFormCourt.txtUbicationModifyCourtForm.setBackground(Color.WHITE);
        ModifyFormCourt.txtNameModifyCourtForm.setText(name);
        ModifyFormCourt.txtUbicationModifyCourtForm.setText(ubication);
        ModifyFormCourt.setVisible(true);
        ModifyFormCourt.setTitle("Modificar pista");
        CourtPanel.setVisible(false);
    }

    public static void showUserLogin() {
        userLoginPanel.setVisible(true);
        userLoginPanel.setTitle("Panell d'usuari");
        principalPg.setVisible(false);
    }
    
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
    
    public static void showUpdateFormUserPanel(int idUser, String nom, String cognom, String correu, String telefon){
        model2.setId_user(idUser);
        model2.setName(nom);
        model2.setSurname(cognom);
        model2.setMail(correu);
        model2.setPhone(telefon);
        UpdateFormUser.txtNameUpdateUserForm.setText(nom);
        UpdateFormUser.txtSurnameUpdateUserForm.setText(cognom);
        UpdateFormUser.txtMailUpdateUserForm.setText(correu);
        UpdateFormUser.txtPhoneUpdateUserForm.setText(telefon);
        UpdateFormUser.txtNameUpdateUserForm.setBackground(Color.WHITE);
        UpdateFormUser.txtSurnameUpdateUserForm.setBackground(Color.WHITE);
        UpdateFormUser.txtMailUpdateUserForm.setBackground(Color.WHITE);
        UpdateFormUser.txtPhoneUpdateUserForm.setBackground(Color.WHITE);
        UpdateFormUser.setVisible(true);
        UserPanel.setTitle("Inserir usuari");
        UserPanel.setVisible(false);     
    }
    
    public static void showReservationPanel() {
        ReservationListCourt.setVisible(true);
        ReservationListCourt.setTitle("Gestió reserves");
        adminPanel.setVisible(false);
    }
    
    public static void showMyReservationsFromProfilePage() {
        userPanel.setVisible(false);
        int id = model2.getId_user();
        String name = model2.getName();
        MyReservationsDashboard.jLabel1.setText(name);
        DefaultTableModel modelo = new DefaultTableModel();
        MyReservationsDashboard.tblMyReservations.setModel(modelo);
        sqlModel4.loadTblMyReservationsFromUser(modelo, id);
        MyReservationsDashboard.setTitle("Les meves reserves");
        MyReservationsDashboard.setVisible(true);
    }
    
    public static void showReservationsFromProfilePage() {
        userPanel.setVisible(false);
        ReservationsDashboard.jLabel1.setText(""+model2.getId_user());
        ReservationsDashboard.jLabel2.setText(model2.getName()+" "+model2.getSurname());
        ReservationsDashboard.setTitle("Pistes disponibles");
        ReservationsDashboard.setVisible(true);
    }
    
    public static void showMyReservationsFromReservationsPage() {
        ReservationsDashboard.setVisible(false);
        int id = model2.getId_user();
        String name = model2.getName();
        MyReservationsDashboard.jLabel1.setText(name);
        DefaultTableModel modelo = new DefaultTableModel();
        MyReservationsDashboard.tblMyReservations.setModel(modelo);
        sqlModel4.loadTblMyReservationsFromUser(modelo, id);
        MyReservationsDashboard.setTitle("Les meves reserves");
        MyReservationsDashboard.setVisible(true);
    }
    
    public static void showProfileFromReservationsPage() {
        ReservationsDashboard.setVisible(false);
        userPanel.setTitle("El meu perfil");
        userPanel.setVisible(true);
    }
    
    public static void showProfileFromMyReservationsPage() {
        MyReservationsDashboard.setVisible(false);
        userPanel.setTitle("El meu perfil");
        userPanel.setVisible(true);
    }
    
    public static void showReservationsMyReservationsPage() {
        MyReservationsDashboard.setVisible(false);
        ReservationsDashboard.jLabel1.setText(""+model2.getId_user());
        ReservationsDashboard.jLabel2.setText(model2.getName()+" "+model2.getSurname());
        ReservationsDashboard.setTitle("Pistes disponibles");
        ReservationsDashboard.setVisible(true);
    }
    
    public static void showReservationsFromTrueReservationsPage() {
        trueReservationUser.setVisible(false);
        ReservationsDashboard.setTitle("Pistes disponibles");
        ReservationsDashboard.setVisible(true);
    }
    
    public static void showChangePassword() {
        userPanel.setVisible(false);
        ChangePasswordUser.setTitle("Canvi de contrasenya");
        ChangePasswordUser.setVisible(true);
    }

    // RETURNS
    
    public static void returnPrincipalPageFromUser() {
        userLoginPanel.setVisible(false);
        principalPg.setTitle("Pagina principal");
        principalPg.setVisible(true);
    }
    
    public static void returnPrincipalPageFromAdmin() {
        adminLoginPanel.setVisible(false);
        principalPg.setTitle("Pagina principal");
        principalPg.setVisible(true);
    }
    
    public static void returnPrincipalPageFromUserDashoard() {
        ChangePasswordUser.setVisible(false);
        principalPg.setTitle("Pagina principal");
        principalPg.setVisible(true);
    }
    
    public static void returnPrincipalPageFromProfilePage() {
        userPanel.setVisible(false);
        principalPg.setTitle("Pagina principal");
        principalPg.setVisible(true);
    }
    
    public static void returnPrincipalPageFromReservationsPage() {
        ReservationsDashboard.setVisible(false);
        principalPg.setTitle("Pagina principal");
        principalPg.setVisible(true);
    }
    
    public static void returnPrincipalPageFromMyReservationsPage() {
        MyReservationsDashboard.setVisible(false);
        principalPg.setTitle("Pagina principal");
        principalPg.setVisible(true);
    }
    
    public static void returnPrincipalPageFromAdminDashboard() {
        adminPanel.setVisible(false);
        principalPg.setTitle("Pagina principal");
        principalPg.setVisible(true);
    }
    
    public static void returnCourtPanel() {
        CourtPanel.setVisible(false);
        adminPanel.setTitle("Administració");
        adminPanel.setVisible(true);
    }

    public static void returnNewFormCourtPanel() {
        NewformCourt.setVisible(false);
        CourtPanel.setTitle("Gestió pistes");
        CourtPanel.setVisible(true);
        CourtPanel.loadTable();
    }
    
    public static void returnModifyFormCourtPanel() {
        ModifyFormCourt.setVisible(false);
        CourtPanel.setTitle("Gestió pistes");
        CourtPanel.setVisible(true);
        CourtPanel.loadTable();
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
        UserPanel.loadTable();
    }
    
    public static void returnModifyFormUserPanel() {
        UpdateFormUser.setVisible(false);
        UserPanel.setTitle("Gestió Usuaris");
        UserPanel.setVisible(true);
        UserPanel.loadTable();
    }
    
    public static void returnReservationPanel() {
        ReservationListCourt.setVisible(false);
        adminPanel.setTitle("Administració");
        adminPanel.setVisible(true);
    }
    
    public static void returnListCourt() {
        ReservationListCourtXCourtXDate.setVisible(false);
        ReservationListCourt.setTitle("Gestió reserves");
        ReservationListCourt.setVisible(true);
    }
    
    public static void returnShowProfileFromMyReservationsPage() {
        ChangePasswordUser.setVisible(false);
        userPanel.setTitle("Perfil de l'usuari");
        userPanel.setVisible(true);
    }
   
    
    
    // LOGIN METHODSs
    
    public static void loginUser(String user, String password){
        
        if(!user.equals("") && !password.equals("")){
            
            model2.setDni(user);
            model2.setPasswd(password);
            boolean consulta = sqlModel2.login(model2);
    
            if(consulta == true){
                userPanel.dni.setText(model2.getDni());
                userPanel.nom.setText(model2.getName());
                userPanel.cognom.setText(model2.getSurname());
                userPanel.correu.setText(model2.getMail());
                userPanel.telefon.setText(model2.getPhone());
                userLoginPanel.setVisible(false);
                userPanel.setTitle("Panell de l'usuari");
                userPanel.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Dades incorrectes");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Introdueix dades si us plau!");
        }
    }
    
    public static void loginAdmin(String user, String password){
        
        if(!user.equals("") && !password.equals("")){
                        
            model3.setNick(user);
            model3.setPasswd(password);
            boolean consulta = sqlModel3.login(model3);
    
            if(consulta == true){
                
                // VARIABLES DE SEXSION
                
                adminLoginPanel.setVisible(false);
                adminPanel.setTitle("Panell de l'administrador");
                adminPanel.setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Dades incorrectes");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Introdueix dades si us plau!");
        }
    }
    
    // COURTS METHODS
    public static void loadTblCourt(DefaultTableModel modelo) {
        sqlModel.loadTbl(modelo);
    }

    public static void loadTblCourtWhere(DefaultTableModel modelo, String where) {
        String name = where;
        sqlModel.loadTblWhere(modelo, name);
    }

    public static void insertCourt(String name, String ubication) {

        if (name.trim().equalsIgnoreCase("") || ubication.trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Introdueix valors!", "Panell administrador | Alta pista", JOptionPane.WARNING_MESSAGE);
            returnNewFormCourtPanel();
        } else {
            model.setName(name);
            model.setUbication(ubication);
            boolean consulta = sqlModel.insert(model);
            if (consulta == true) {
                JOptionPane.showMessageDialog(null, "Pista creada correctament", "Panell administrador | Alta pista", JOptionPane.WARNING_MESSAGE);
                returnNewFormCourtPanel();
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear pista, pista existent", "Panell administrador | Alta pista", JOptionPane.WARNING_MESSAGE);
            }
        }

    }

    public static void modifyCourt(String name, String ubication) {
        if (name.trim().equalsIgnoreCase("") || ubication.trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Introdueix valors!", "", JOptionPane.WARNING_MESSAGE);
            returnModifyFormCourtPanel();
        } else {
            model.setName(name);
            model.setUbication(ubication);
            boolean consulta = sqlModel.modify(model);
            if (consulta == true) {
                JOptionPane.showMessageDialog(null, "Pista modificada correctament", "Panell administrador | Actualitzar pista", JOptionPane.WARNING_MESSAGE);
                returnModifyFormCourtPanel();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar pista, pista existent", "Panell administrador | Actualitzar pista", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public static void activateCourt(int idCourt) {
        boolean consulta = sqlModel.activate(idCourt);
        if (consulta == true) {
            JOptionPane.showMessageDialog(null, "Pista activada correctament", "Panell administrador | Activació pista", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al activar pista", "Panell administrador | Activació pista", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static void deactivateCourt(int idCourt) {
        boolean consulta = sqlModel.deactivate(idCourt);
        sqlModel4.cancelAllReservations(idCourt);
        if (consulta == true) {
            JOptionPane.showMessageDialog(null, "Pista desactivada correctament", "Panell administrador | Baixa pista", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al desactivar pista", "Panell administrador | Baixa pista", JOptionPane.WARNING_MESSAGE);
        }
        
    }
    
    public static void ListOfCourtsXDate(String date) {
        ReservationListCourt.setVisible(true);
        ReservationListCourt.setTitle("Gestió reserves | Pistes");
        ReservationListCourt.setVisible(false);
    }
    
    public static void loadListOfCourts(DefaultListModel modelo, String selectedDate) {
        sqlModel.getCourtsList(modelo, selectedDate);
    }
    
    public static void loadListOfCourtsWhere(DefaultListModel modelo, String where, String selectedDate) {
        sqlModel.getCourtsListWhere(modelo, where, selectedDate);
    }
    
    // RESERVATION METHODS
    
    public static void showReservationsXCourtWDate(String name, String date) {
        ReservationListCourtXCourtXDate.setVisible(true);
        ReservationListCourtXCourtXDate.setTitle("Gestió reserves | Pistes/Dia");
        ReservationListCourt.setVisible(false);
        ReservationListCourtXCourtXDate.nameOfReservation.setText(name);
        ReservationListCourtXCourtXDate.dateOfReservation.setText(date);
        DefaultTableModel modelo = new DefaultTableModel();
        ReservationListCourtXCourtXDate.tblReservations.setModel(modelo);
        sqlModel4.getReservationXCourtWDate(modelo, name, date);
    }
    
    public static void payReservation(int idReservation) {
        boolean consulta = sqlModel4.payReservation(idReservation);
        if (consulta == true) {
            JOptionPane.showMessageDialog(null, "Reserva pagada correctament", "Panell administrador | Pagament reserva", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al pagar la reserva", "Panell administrador | Pagament reserva", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static void cancelReservation(int idReservation) {
        boolean consulta = sqlModel4.cancelReservation(idReservation);
        if (consulta == true) {
            JOptionPane.showMessageDialog(null, "Reserva cancelada correctament", "Panell administrador | Cancelar reserva", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al cancelar la reserva", "Panell administrador | Cancelar reserva", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static void showInsertReservation(String name, String selectedDate, String hora) throws SQLException {
        sqlModel4.insert(name, selectedDate, hora);
        JOptionPane.showMessageDialog(null, "Reserva feta correctament", "Panell administrador | Realitzar reserva", JOptionPane.WARNING_MESSAGE);
    }
    
    public static void insertReservation(String name, String ubication) {

        if (name.trim().equalsIgnoreCase("") || ubication.trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Introdueix valors!", "Panell administrador | Realitzar reserva", JOptionPane.WARNING_MESSAGE);
            returnNewFormCourtPanel();
        } else {
            model.setName(name);
            model.setUbication(ubication);
            boolean consulta = sqlModel.insert(model);
            if (consulta == true) {
                JOptionPane.showMessageDialog(null, "Pista creada correctament", "Panell administrador | Realitzar reserva", JOptionPane.WARNING_MESSAGE);
                returnNewFormCourtPanel();
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear pista, pista existent", "Panell administrador | Realitzar reserva", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    // USERS METHODS
    
    public static void loadTblUser(DefaultTableModel modelo) {
        sqlModel2.loadTbl(modelo);
    }

    public static void loadTblUserWhere(DefaultTableModel modelo, String where) {
        String dni = where;
        sqlModel2.loadTblWhere(modelo, dni);
    }

    public static void insertUser(String name, String surname, String dni, String mail, String phone, String passwd) {

        if (name.trim().equalsIgnoreCase("") || surname.trim().equalsIgnoreCase("") || dni.trim().equalsIgnoreCase("") || mail.trim().equalsIgnoreCase("") || phone.trim().equalsIgnoreCase("") || passwd.trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Introdueix valors!", "Panell administrador | Alta usuari", JOptionPane.WARNING_MESSAGE);
            returnNewFormUserPanel();
        } else {
            
            model2.setName(name);
            model2.setSurname(surname);
            model2.setDni(dni);
            model2.setMail(mail);
            model2.setPhone(phone);
            model2.setPasswd(passwd);

            boolean consulta = sqlModel2.insert(model2);
            if (consulta == true) {
                JOptionPane.showMessageDialog(null, "Usuari creat correctament", "Panell administrador | Alta usuari", JOptionPane.WARNING_MESSAGE);
                returnNewFormUserPanel();
            } else {
                JOptionPane.showMessageDialog(null, "Error al crear usuari, usuari existent", "Panell administrador | Alta usuari", JOptionPane.WARNING_MESSAGE);
            }
        }

    }
    
    public static void updatePasswdUser(String passwd) {
        if (passwd.trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Introdueix valors!", "El meu perfil | Contrasenya", JOptionPane.WARNING_MESSAGE);
            returnShowProfileFromMyReservationsPage();

        } else {
            model2.setPasswd(passwd);

            boolean consulta = sqlModel2.updatePasswd(model2);
            if (consulta == true) {
                JOptionPane.showMessageDialog(null, "Contrasenya actualitzada correctament", "El meu perfil | Contrasenya", JOptionPane.WARNING_MESSAGE);
                returnShowProfileFromMyReservationsPage();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualitzar el password.", "El meu perfil | Contrasenya", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void modifyUser(String name, String surname, String mail, String phone) {
        if (name.trim().equalsIgnoreCase("") || surname.trim().equalsIgnoreCase("") || mail.trim().equalsIgnoreCase("") || phone.trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Introdueix valors!", "Panell administrador | Actualitzar usuari", JOptionPane.WARNING_MESSAGE);
            returnModifyFormUserPanel();
        } else {
            model2.setName(name);
            model2.setSurname(surname);
            model2.setMail(mail);
            model2.setPhone(phone);
            
            boolean consulta = sqlModel2.update(model2);
            if (consulta == true) {
                JOptionPane.showMessageDialog(null, "Usuari actualitzat correctament", "Panell administrador | Actualitzar usuari", JOptionPane.WARNING_MESSAGE);
                returnModifyFormUserPanel();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualitzar usuari, usuari existent", "Panell administrador | Actualitzar usuari", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    public static void resetPasswdUser(int idUser) {
        boolean consulta = sqlModel2.resetPassword(idUser);
        if (consulta == true) {
            JOptionPane.showMessageDialog(null, "Contrasenya de l'usuari resetejada correctament", "Panell administrador | Reset contrasenya", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al resetejar la contrasenya de l'usuari", "Panell administrador | Reset contrasenya", JOptionPane.WARNING_MESSAGE);
        }
    }

    
    public static void activateUser(int idUser) {
        boolean consulta = sqlModel2.activate(idUser);
        if (consulta == true) {
            JOptionPane.showMessageDialog(null, "Usuari activat correctament", "Panell administrador | Activació usuari", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al activar usuari", "Panell administrador | Activació usuari", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void deactivateUser(int idUser) {
        boolean consulta = sqlModel2.deactivate(idUser);
        if (consulta == true) {
            JOptionPane.showMessageDialog(null, "Usuari desactivat correctament", "Panell administrador | Baixa usuari", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al desactivar l'usuari", "Panell administrador | Baixa usuari", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // GENERAL METHODS
    
    public static void loadListOfCourtDisponible(DefaultListModel modelo, String where, String selectedDate) {
        sqlModel4.getCourtsDisponibleWhere(modelo, where, selectedDate);
    }
    
    public static void doReservationFromUser(String nameCourt, String selectedDate, String idUser, String nameUser, String where) throws SQLException {
        int court = sqlModel4.obtainID(nameCourt);
        int id = Integer.parseInt(idUser);
        int consulta = sqlModel4.searchReservationWithDateANHour(court, where, selectedDate);
        int consulta2 = sqlModel4.searchReservationFROMUSERWithDateANHour(idUser, where, selectedDate);
        if (consulta == 0) {
            if(consulta2 == 0){
                sqlModel4.insertReservationFormUser(id, court, where, selectedDate);
                trueReservationUser.setVisible(true);
                trueReservationUser.setTitle("Resum reserva");
                trueReservationUser.txtDay.setText(selectedDate);
                trueReservationUser.txtHour.setText(where);
                trueReservationUser.txtNameCourt.setText(nameCourt);
                trueReservationUser.txtUser.setText(nameUser);
                ReservationsDashboard.setVisible(false);
            }
            else {
                JOptionPane.showMessageDialog(null, "Actualment tens una reserva activa el "+selectedDate+" de "+where+" !", "dd", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Has modificat la franja horaria!", "Departament de seguretat", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static void loadTableOFMyReservations() {
        int id = model2.getId_user();
        String name = model2.getName();
        MyReservationsDashboard.jLabel1.setText(name);
        DefaultTableModel modelo = new DefaultTableModel();
        MyReservationsDashboard.tblMyReservations.setModel(modelo);
        sqlModel4.loadTblMyReservationsFromUser(modelo, id);
    }

}
