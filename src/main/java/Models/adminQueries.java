
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class adminQueries extends Conexion {
    
    public boolean login(Admin adm){
        PreparedStatement ps = null;
        Connection con = getConnection();
        ResultSet rs = null;
        
        String sql = "SELECT id_admin, nick, passwd FROM admin WHERE nick = ?  AND passwd = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, adm.getNick());
            ps.setString(2, adm.getPasswd());
            rs = ps.executeQuery();
            
            if(rs.next()){
                if(adm.getPasswd().equals(rs.getString(3))){
                    
                    adm.setId_admin(rs.getInt(1));
                    adm.setNick(rs.getString(2));
                    return true;
                } else {
                    return false;
                }            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(adminQueries.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
        public static adminQueries instance;
        public String user;
        public boolean loggedIn;

        public adminQueries() {
            // Evita que se pueda instanciar directamente
        }

        public static adminQueries getInstance() {
            if (instance == null) {
                instance = new adminQueries();
            }
            return instance;
        }

        public void login(String user) {
            this.user = user;
            loggedIn = true;
        }

        public void logout() {
            user = null;
            loggedIn = false;
        }

        public boolean isLoggedIn() {
            return loggedIn;
        }

        public String getUsername() {
            return user;
        }    
}
