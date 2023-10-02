
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class courtQueries extends Conexion {

    public boolean loadTbl(DefaultTableModel modelo) {
        
        try {
            PreparedStatement ps = null;
            Connection con = getConnection();
            ResultSet rs = null;
        
            String sql = "SELECT id_court, name, ubication, status FROM court";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int columnsCount = rsMd.getColumnCount();
            
            modelo.addColumn("ID");
            modelo.addColumn("Nom");
            modelo.addColumn("Ubicació");
            modelo.addColumn("Status");
            
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
    
    public boolean loadTblWhere(DefaultTableModel modelo, String name) {
        
        String where = "";
        
        if(!"".equals(name))
        {
            where = "WHERE name = '"+ name + "'";
        }
        
        try {
            PreparedStatement ps = null;
            Connection con = getConnection();
            ResultSet rs = null;
        
            String sql = "SELECT id_court, name, ubication, status FROM court " + where;
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int columnsCount = rsMd.getColumnCount();
            
            modelo.addColumn("ID");
            modelo.addColumn("Nom");
            modelo.addColumn("Ubicació");
            modelo.addColumn("Status");
            
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
    
//    public boolean insert(Court crt) {
//        
//        PreparedStatement ps = null;
//        Connection con = getConnection();
//        
//        String sql = "INSERT INTO court (name, ubication, photo, status) VALUES (?, ?, 'hola.jpg', 1)";
//        
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setString(1, crt.getName());
//            // ps.setString(2,crt.getHours());
//            ps.setString(2, crt.getUbication());
//            // ps.setString(4,crt.getPhoto());
//            // FALTA INSERTAR LA FOTO
//            ps.execute();
//            return true;
//        } catch (SQLException e) {
//            System.err.println(e);
//            return false;
//        } finally {
//            try {
//                con.close();
//            } catch (SQLException e) {
//                System.err.println(e);
//            }
//        }
//    }
    
    public boolean deactivate(int idCourt) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "UPDATE court SET status=0 WHERE id_court=?";
        
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
    
    public boolean activate(int idCourt) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "UPDATE court SET status=1 WHERE id_court=?";
        
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
