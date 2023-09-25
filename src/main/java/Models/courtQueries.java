
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class courtQueries extends Conexion {

    public boolean insert(Court crt) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "INSERT INTO court (name, ubication, photo, status) VALUES (?, ?, 'hola.jpg', 1)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, crt.getName());
            // ps.setString(2,crt.getHours());
            ps.setString(2, crt.getUbication());
            // ps.setString(4,crt.getPhoto());
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
    
    public boolean deactivate(Court crt) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "UPDATE court SET status=0 WHERE name=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, crt.getName());
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
    
    public boolean activate(Court crt) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "UPDATE court SET status=1 WHERE name=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, crt.getName());
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
