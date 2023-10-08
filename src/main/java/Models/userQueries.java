
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class userQueries extends Conexion {
    
    public boolean loadTbl(DefaultTableModel modelo) {
        
        try {
            PreparedStatement ps = null;
            Connection con = getConnection();
            ResultSet rs = null;
        
            String sql = "SELECT id_user, name, surname, dni, mail, phone, ifactive FROM user";
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int columnsCount = rsMd.getColumnCount();
            
            modelo.addColumn("ID");
            modelo.addColumn("Nom");
            modelo.addColumn("Cognom");
            modelo.addColumn("DNI");
            modelo.addColumn("Correu");
            modelo.addColumn("Telèfon");
            modelo.addColumn("Estat");

            
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
    
    public boolean loadTblWhere(DefaultTableModel modelo, String dni) {
        
        String where = "";
        
        if(!"".equals(dni))
        {
            where = "WHERE dni LIKE '%"+ dni + "%'";
        }
        
        try {
            PreparedStatement ps = null;
            Connection con = getConnection();
            ResultSet rs = null;
        
            String sql = "SELECT id_user, name, surname, dni, mail, phone, ifactive FROM user " + where;
            
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int columnsCount = rsMd.getColumnCount();
               
            modelo.addColumn("ID");
            modelo.addColumn("Nom");
            modelo.addColumn("Cognom");
            modelo.addColumn("DNI");
            modelo.addColumn("Correu");
            modelo.addColumn("Telèfon");
            modelo.addColumn("Estat");
            
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
    
    public boolean insert(User usr) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "INSERT INTO user (name, surname, dni, mail, phone, passwd, ifactive) VALUES (?, ?, ?, ?, ?, ?, 1)";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getName());
            ps.setString(2, usr.getSurname());
            ps.setString(3, usr.getDni());
            ps.setString(4, usr.getMail());
            ps.setString(5, usr.getPhone());
            ps.setString(6,usr.getPasswd());

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
    
    public boolean update(User usr) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "UPDATE user SET name=?, surname=?, mail=?, phone=? WHERE id_user=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getName());
            ps.setString(2, usr.getSurname());
            ps.setString(3, usr.getMail());
            ps.setString(4, usr.getPhone());
            ps.setInt(5, usr.getId_user());
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
    
    public boolean deactivate(int idUser) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "UPDATE user SET ifactive=0 WHERE id_user=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idUser);
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
    
    public boolean activate(int idUser) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "UPDATE user SET ifactive=1 WHERE id_user=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idUser);
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
    
    public boolean resetPassword(int idUser) {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        
        String sql = "UPDATE user SET passwd='123' WHERE id_user=?";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idUser);
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
    
    public boolean login(User usr){
        PreparedStatement ps = null;
        Connection con = getConnection();
        ResultSet rs = null;
        
        String sql = "SELECT id_user, dni, passwd FROM user WHERE dni = ?  AND passwd = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getDni());
            ps.setString(2, usr.getPasswd());
            rs = ps.executeQuery();
            
            if(rs.next()){
                if(usr.getPasswd().equals(rs.getString(3))){
                    
                    usr.setId_user(rs.getInt(1));
                    usr.setDni(rs.getString(2));
                    return true;
                } else {
                    return false;
                }            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(userQueries.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
