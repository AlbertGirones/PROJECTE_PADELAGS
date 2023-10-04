
package Models;

import java.sql.SQLException;

public class userQueries extends Conexion {
    
//    public List listUsers (User model) {
//    
//        PreparedStatement ps = null;
//        Connection con = getConnection();
//        ResultSet rs;
//        
//        ListUserdata = new ArrayList();
//        String sql = SELECT id_user, name, surname, dni, mail, phone, role, passwd, photo, iffailed, ifactive FROM user;
//        
//        try {
//            ps = con.prepareStatement(sql);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                User user = new User(User.id_user,  User.name,  User.surname, User.dni,  User.mail,  User.phone, User.role, User.passwd, User.photo);
//                user.setId_user(rs.getInt(1));
//                user.setName(rs.getString(2));
//                user.setSurname(rs.getString(3));
//                user.setDni(rs.getString(4));
//                user.setMail(rs.getString(5));
//                user.setPhone(rs.getString(6));
//                user.setRole(rs.getString(7));
//                user.setPasswd(rs.getString(8));
//                user.setPhoto(rs.getString(9));
//
//                data.add(user);
//                
//            }
//        } catch (SQLException e) {
//            System.err.println(e);
//        }
//        return data;
//}
//        
//    public boolean insert(User usr){
//        
//        PreparedStatement ps = null;
//        Connection con = getConnection();
//        
//        String sql = INSERT INTO user (name, surname, dni, mail, phone, role, passwd, photo, iffailed, ifactive) VALUES (, , , , , , , 0, 1);
//        
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setString(1, usr.getName());
//            ps.setString(2, usr.getSurname());
//            ps.setString(3, usr.getDni());
//            ps.setString(4, usr.getMail());
//            ps.setString(5, usr.getPhone());
//            ps.setString(6, usr.getRole());
//            ps.setString(7, usr.getPasswd());
//            ps.setString(8, usr.getPhoto());
//            ps.execute();
//            return true;
//        }catch(SQLException e){
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
//    
//    public boolean deactivate(User usr) {
//        PreparedStatement ps = null;
//        Connection con = getConnection();
//        
//        String sql = UPDATE user SET ifactive=0 WHERE dni=;
//        
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setString(1, usr.getDni());
//            ps.execute();
//            return true;
//        } catch (SQLException e) {
//            System.err.println(e);
//            return false;
//        } finally {
//            try {
//                con.close();
//            } catch (SQLException e){
//                System.err.println(e);
//            }
//        }
//    }
//    
//    public boolean activate(User usr) {
//        PreparedStatement ps = null;
//        Connection con = getConnection();
//        
//        String sql = UPDATE user SET ifactive=1 WHERE dni=;
//        
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setString(1, usr.getDni());
//            ps.execute();
//            return true;
//        } catch (SQLException e) {
//            System.err.println(e);
//            return false;
//        } finally {
//            try {
//                con.close();
//            } catch (SQLException e){
//                System.err.println(e);
//            }
//        }
//    }
    
}
