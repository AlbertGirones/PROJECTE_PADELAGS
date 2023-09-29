
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class courtQueries extends Conexion {

    public List listCourts(Court model) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        ResultSet rs;
        
        List<Court>data=new ArrayList<>();
        String sql = "SELECT id_court, name, ubication, status FROM court";
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Court court = new Court();
                court.setId_court(rs.getInt(1));
                court.setName(rs.getString(2));
                court.setUbication(rs.getString(3));
                court.isStatus(rs.getBoolean(4));
                data.add(court);
                
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return data;
    }
    
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
