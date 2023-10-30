
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class reservationQueries extends Conexion {
        
    public boolean getReservationXCourtWDate(DefaultTableModel modelo, String name, String date) {
        
        try {
            PreparedStatement ps = null;
            Connection con = getConnection();
            ResultSet rs = null;
        
            String sql = "SELECT reservation.hours, reservation.id_reservation, user.dni, user.name, reservation.ifpay FROM court INNER JOIN reservation ON court.id_court = reservation.id_court INNER JOIN user ON reservation.user = user.id_user WHERE court.name = 'Pista Gerard' AND reservation.date = '2023-10-31'";            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
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
    
}
