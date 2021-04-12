/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhanlt.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import javax.naming.NamingException;
import nhanlt.dto.User;
import nhanlt.helper.MyConnection;

/**
 *
 * @author DELL
 */
public class UserDao implements Serializable {

    public User checkLogin(String name, String pass) throws SQLException, ClassNotFoundException, NamingException {
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        User user = null;
        try {
            con = MyConnection.makeConnection();
            //2. Create sql string
            if (con != null) {
                String sql = "select * from Users where Username = ? and Password = ?";
                // 3. Create statement

                pstm = con.prepareStatement(sql);
                pstm.setString(1, name);
                pstm.setString(2, pass);
                // 4. Excute query
                rs = pstm.executeQuery();

                while (rs.next()) {
                    String username = rs.getString("Username");
                    String password = rs.getString("Password");
                    String fullname = rs.getString("Fullname");
                    String phone = rs.getString("Phone");
                    String role = rs.getString("RoleID");
                    Boolean active = rs.getBoolean("Active");
                    user = new User(username, password, fullname, phone, role, active);
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return user;
    }

    public boolean registerAccount(User user) throws SQLException, NamingException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement pstm = null;
        String sql = "Insert into Users(Username, Password, Fullname, Phone, RoleID, Active)\n"
                + " values (?,?,?,?,?,?)";
        try {
            con = MyConnection.makeConnection();

            if (con != null) {
                pstm = con.prepareStatement(sql);

                pstm.setString(1, user.getUsername());
                pstm.setString(2, user.getPassword());
                pstm.setString(3, user.getFullname());
                pstm.setString(4, user.getPhone());
                pstm.setString(5, user.getRoleID());
                pstm.setBoolean(6, user.isActive());

                int row = pstm.executeUpdate();
                System.out.println(row);
                if (row > 0) {
                    return true;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(" Register Dao"+e.getMessage());
        } finally {
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public boolean deleteUser(String id) throws SQLException, NamingException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement pstm = null;
        String sql = "DELETE FROM Books WHERE BookID=?";
        try {
            con = MyConnection.makeConnection();
            System.out.println("id ben dao" + id);
            if (con != null) {
                pstm = con.prepareStatement(sql);

                pstm.setString(1, id);

                int row = pstm.executeUpdate();
                if (row > 0) {
                    return true;
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(e.getMessage());
            System.out.println(e.getMessage());
        } finally {
            if (pstm != null) {
                pstm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }
//
//    public boolean updateInfomationUser(User user) throws SQLException, NamingException, ClassNotFoundException {
//        Connection con = null;
//        PreparedStatement pstm = null;
//        String sql = "Update Users set Name=?, Author=?,PublishYear=?, ShortDescription=?, CategoryID=? WHERE BookID=?";
//        try {
//            con = MyConnection.makeConnection();
//            if (con != null) {
//                pstm = con.prepareStatement(sql);
//
//                pstm.setString(1, book.getName());
//                pstm.setString(2, book.getAuthor());
//                pstm.setString(3, book.getYear());
//                pstm.setString(4, book.getDescription());
//                pstm.setString(5, book.getCategoryId());
//                pstm.setString(6, book.getId());
//                int row = pstm.executeUpdate();
//
//                return true;
//
//            }
//        } catch (SQLException e) {
//            Logger.getLogger(e.getMessage());
//        } finally {
//            if (pstm != null) {
//                pstm.close();
//            }
//            if (con != null) {
//                con.close();
//            }
//        }
//        return false;
//    }

}
