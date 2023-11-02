
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
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
            where = "WHERE name LIKE '%"+ name + "%'";
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
    
    public boolean insert(Court crt) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "INSERT INTO court (name, ubication, photo, status) VALUES (?, ?, 'predeterminada.jpg', 'Activa')";
        
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
    
    public boolean modify(Court crt) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "UPDATE court SET name=?, ubication=? WHERE id_court=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, crt.getName());
            ps.setString(2, crt.getUbication());
            ps.setInt(3, crt.getId_court());
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
    
    public boolean activate(int idCourt) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "UPDATE court SET status='Activa' WHERE id_court=?";
        
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
    
    public boolean maintenance(int idCourt) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "UPDATE court SET status='En manteniment' WHERE id_court=?";
        
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
    
    public boolean deactivate(int idCourt) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "UPDATE court SET status='No activa' WHERE id_court=?";
        
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
    
    public boolean getCourtsList(DefaultListModel modelo, String selectedDate) {
        try {
            PreparedStatement ps = null;
            Connection con = getConnection();
            ResultSet rs = null;
            int filas = 0;
        
            String sql = "SELECT DISTINCT court.name FROM court INNER JOIN reservation ON reservation.court = court.id_court AND court.status = 'Activa' AND reservation.date = ?";
            
            ps = con.prepareStatement(sql);
            ps.setString(1, selectedDate);
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
    
    public boolean getCourtsListWhere(DefaultListModel modelo, String where, String selectedDate) {
        
        if ("Sense horari".equals(where)){
            try {
            PreparedStatement ps = null;
            Connection con = getConnection();
            ResultSet rs = null;
            String sql = "SELECT DISTINCT court.name FROM court INNER JOIN reservation ON reservation.court = court.id_court AND court.status = 'Activa' AND reservation.date = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, selectedDate);
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
        else {
            try {
            PreparedStatement ps = null;
            Connection con = getConnection();
            ResultSet rs = null;
            String sql = "SELECT name FROM court WHERE status = 'Activa' AND id_court NOT IN (SELECT court FROM reservation WHERE date = ? AND hours = ?)";
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
    }
    
}
