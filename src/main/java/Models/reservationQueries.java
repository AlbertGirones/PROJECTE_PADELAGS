
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class reservationQueries extends Conexion {
    
    public static User model2 = new User();
        
    public boolean getReservationXCourtWDate(DefaultTableModel modelo, String name, String date) {
        
        try {
            PreparedStatement ps = null;
            Connection con = getConnection();
            String sql = "SELECT reservation.hours, reservation.id_reservation, user.dni, user.name, reservation.ifpay FROM court INNER JOIN reservation ON court.id_court = reservation.court INNER JOIN user ON reservation.user = user.id_user WHERE court.name = ? AND reservation.date = ? ORDER BY reservation.hours ASC";            
            ps = con.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2, date);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int columnsCount = rsMd.getColumnCount();
            
            modelo.addColumn("Horari");
            modelo.addColumn("ID Reserva");
            modelo.addColumn("DNI");
            modelo.addColumn("Nom client");
            modelo.addColumn("Pagament");
                                 
            while (rs.next()) {
                
                Object [] rows = new Object[columnsCount];
                
                for (int i=0; i<columnsCount; i++)
                {
                    rows[i] = rs.getObject(i + 1);
                }
                modelo.addRow(rows);
            }
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
        }
        return false;
        
    }
    
    public boolean payReservation(int idReservation) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "UPDATE reservation SET ifpay='Pagada' WHERE id_reservation=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idReservation);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    
    public boolean cancelReservation(int idReservation) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "DELETE FROM reservation WHERE id_reservation  = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idReservation);
            ps.execute();
            return true;
        }
        catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public void insert(String name, String selectedDate, String hora) throws SQLException {
        
        PreparedStatement ps = null;        
        ResultSet resultSet = null;
        Connection con = getConnection();
        
        String sql = "INSERT INTO reservation (user, court, hours, date, ifpay) VALUES ('1', ?, ?, ?, 'No pagada')";
        ps = con.prepareStatement(sql);

        String court = (String) name;
        int courtId = obtainID(court);
        
        String date = (String) selectedDate;              
        
        ps.setInt(1, courtId);
        ps.setString(2, hora);
        ps.setString(3, date);
        ps.executeUpdate();
    }
    
    public int obtainID(String court) throws SQLException{
        PreparedStatement ps1 = null;
        
        ResultSet resultSet = null;
        Connection con = getConnection();

        String sql2 = "SELECT id_court FROM court WHERE name = ?";
        ps1 = con.prepareStatement(sql2);
        
        ps1.setString(1, court);

        resultSet = ps1.executeQuery();
        int pista = 0;
        while(resultSet != null && resultSet.next()){
            pista = resultSet.getInt("id_court");
        }
        return pista;
    }
    
    public boolean getCourtsDisponibleWhere (DefaultListModel modelo, String where, String selectedDate) {
        try {
        PreparedStatement ps = null;
        Connection con = getConnection();
        ResultSet rs = null;
        String sql = "SELECT c.name FROM court c LEFT JOIN reservation r ON c.id_court = r.court AND r.date = ? AND r.hours = ? WHERE c.status = 'Activa' AND r.id_reservation IS NULL";
        ps = con.prepareStatement(sql);
        ps.setString(1, selectedDate);
        ps.setString(2, where);
        rs = ps.executeQuery();

        while (rs.next()) {
            String name = rs.getString("name");
            modelo.addElement(name);
        }
        return true;

        } catch (SQLException e) {
            System.err.println(e);
        }
        return false;
    }
    
    public int searchReservationWithDateANHour(int court, String where, String selectedDate) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String sql = "SELECT id_reservation FROM reservation WHERE court = ? AND hours = ? AND date = ?";
        ps = con.prepareStatement(sql);
        ps.setInt(1, court);
        ps.setString(2, where);
        ps.setString(3, selectedDate);
        rs = ps.executeQuery();

        int reserva = 0;
        while(rs != null && rs.next()){
            reserva = rs.getInt("id_reservation");
        }
        return reserva;
    }
    
    public int searchReservationFROMUSERWithDateANHour(String idUser, String where, String selectedDate) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();

        String sql = "SELECT id_reservation FROM reservation WHERE user = ? AND hours = ? AND date = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1, idUser);
        ps.setString(2, where);
        ps.setString(3, selectedDate);
        rs = ps.executeQuery();

        int reserva = 0;
        while(rs != null && rs.next()){
            reserva = rs.getInt("id_reservation");
        }
        return reserva;
    }
    
    public boolean insertReservationFormUser(int id, int court, String where, String selectedDate) {
        PreparedStatement ps = null;
        Connection con = getConnection();

        String sql = "INSERT INTO reservation (user, court, hours, date, ifpay) VALUES (?, ?, ?, ?, 'No pagada')";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, court);
            ps.setString(3, where);
            ps.setString(4, selectedDate);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean loadTblMyReservationsFromUser(DefaultTableModel modelo, int idUser) {
        try {
            PreparedStatement ps = null;
            Connection con = getConnection();
            ResultSet rs = null;

            String sql = "SELECT r.id_reservation, r.date, r.hours, c.name, c.ubication, r.ifpay FROM reservation r INNER JOIN court c ON r.court = c.id_court WHERE r.user = ?";

            ps = con.prepareStatement(sql);
            ps.setInt(1, idUser);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int columnsCount = rsMd.getColumnCount();

            modelo.addColumn("ID Reserva");
            modelo.addColumn("Dia");
            modelo.addColumn("Hora");
            modelo.addColumn("Pista");
            modelo.addColumn("Ubicació");
            modelo.addColumn("Pagament");

            while (rs.next()) {

                Object [] rows = new Object[columnsCount];

                for (int i=0; i<columnsCount; i++){
                    rows[i] = rs.getObject(i + 1);
                }
                modelo.addRow(rows);
            }
            return true;
        } catch (SQLException e) {
            System.err.println(e);
        }
        return false;
    }
    
    public boolean cancelAllReservations(int idCourt) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "DELETE FROM reservation WHERE court = ?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idCourt);
            ps.execute();
            return true;
        }
        catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
     
}
