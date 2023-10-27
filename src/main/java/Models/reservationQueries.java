
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
        
            // sql = SELECT id_reservation, id_user, id_court, hours, ifpay, status, U.dni, U.name FROM reservation R JOIN (SELECT id_user, dni, name FROM user) AS U ON R.user = U.id_user;
            
            String sql = "SELECT id_court, name, ubication, status FROM court";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int columnsCount = rsMd.getColumnCount();
                                 
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
