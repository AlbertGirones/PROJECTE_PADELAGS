
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class courtQueries extends Conexion {

    public boolean insert(Court crt) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "INSERT INTO 'court' ('id_court', 'name', 'ubication', `status`) VALUES ('', ?, ?, 1)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, crt.getName());
            ps.setString(2, crt.getUbication());
            // FALTA INSERTAR LA FOTO
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
}
