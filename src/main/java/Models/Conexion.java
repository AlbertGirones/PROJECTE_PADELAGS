package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    Connection con = null;
    
    String base = "proj1padelags";
    String user = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/" + base;
    
    public Connection getConnection() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch(ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
        return con;
    }
    
}
