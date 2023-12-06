/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author ia
 */
public class User implements fungsi{
    private int iduser;
    private String nama, username, password, role;

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPass(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User() {
    
    }

    public User(int id_user, String nama, String username, String pass, String role) {
        this.iduser = iduser;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    public User getById(int id) {
        User user = new User();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user WHERE id_user = '" + id + "' AND role = 'user'");

        try {
            while (rs.next()) {
                user = new User();
                user.setIduser(rs.getInt("iduser"));
                user.setNama(rs.getString("nama"));
                user.setUsername(rs.getString("username"));
                user.setPass(rs.getString("password"));
                user.setRole(rs.getString("role"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    public ArrayList<User> getAll() {
        ArrayList<User> ListUser = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user WHERE role = 'user'");

        try {
            while (rs.next()) {
                User user = new User();
                user.setIduser(rs.getInt("id_user"));
                user.setNama(rs.getString("nama"));
                user.setUsername(rs.getString("username"));
                user.setPass(rs.getString("pass"));
                user.setRole(rs.getString("role"));

                ListUser.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListUser;
    }

    public ArrayList<User> search(String keyword) {
        ArrayList<User> ListUser = new ArrayList();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM user "
                + "WHERE nama LIKE '%" + keyword + "%' "
                + "OR username LIKE '%" + keyword + "%' "
                + "OR role LIKE '%" + keyword + "%' ");

        try {
            while (rs.next()) {
                User user = new User();
                user.setIduser(rs.getInt("iduser"));
                user.setNama(rs.getString("nama"));
                user.setUsername(rs.getString("username"));
                user.setPass(rs.getString("pass"));
                user.setRole(rs.getString("role"));

                ListUser.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListUser;
    }

    public void save() {
        if (getById(iduser).getIduser()== 0) {
            String SQL = "INSERT INTO user (nama, username, pass, role) VALUES("
                    + "'" + this.nama + "', "
                    + "'" + this.username + "', "
                    + "'" + this.password + "', "
                    + "'" + "user" + "'"
                    + ")";
            this.iduser = DBHelper.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE user SET "
                    + "     nama = '" + this.nama + "', "
                    + "     username = '" + this.username + "', "
                    + "     pass = '" + this.password + "', "
                    + "     role = '" + "user" + "' "
                    + "     WHERE id_user = '" + this.iduser + "'";
            this.iduser = DBHelper.insertQueryGetId(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM user WHERE id_user = '" + this.iduser + "'";
        DBHelper.executeQuery(SQL);
    }
}
