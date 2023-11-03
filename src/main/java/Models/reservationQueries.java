
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class reservationQueries extends Conexion {
        
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
                System.out.println(ps1);

        resultSet = ps1.executeQuery();
        int pista = 0;
        while(resultSet != null && resultSet.next()){
            pista = resultSet.getInt("id_court");
            System.out.println(pista);
        }
        return pista;
    }
}
