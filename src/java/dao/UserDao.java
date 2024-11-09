/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hacom
 */
public class UserDao extends DBcontext {

    public List<User> getAll() {
        List<User> list = new ArrayList<>();
        String sql = "SELECT * FROM rentcar.user;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                User u = new User(rs.getInt("id_user"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("name"),
                        rs.getString("date_of_bird"),
                        rs.getInt("role"),
                        rs.getInt("status"));
                list.add(u);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    //insert user
    public void insert(User u) {
        String sql = "INSERT INTO user (username, password, name, date_of_bird, role) \n"
                + "VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            st.setString(1, u.getUsername());
            st.setString(2, u.getPassword());
            st.setString(3, u.getName());
            st.setString(4, u.getDate());
            st.setInt(5, u.getRole());

            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //tim 1 user khi co id
    public User getUserById(int id) {
        String sql = "SELECT * FROM user WHERE id_user = ?;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                User u = new User(rs.getInt("id_user"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("name"),
                        rs.getString("date_of_bird"),
                        rs.getInt("role"),
                        rs.getInt("status"));
                return u;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    //delete user
    public void delete(int id) {
        String sql = "DELETE FROM user WHERE id_user = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //update user
    public void update(User u) {
        String sql = "UPDATE user\n"
                + "SET username=?, password=?, name=?, date_of_bird=?,role=?,status=?\n"
                + "WHERE id_user = ?;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, u.getUsername());
            st.setString(2, u.getPassword());
            st.setString(3, u.getName());
            st.setString(4, u.getDate());
            st.setInt(5, u.getRole());
            st.setInt(6, u.getStatus());
            st.setInt(7, u.getId_user());
            st.executeUpdate();
        } catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public int count(){
        int count = 0;
        String sql = "select count(*) from user";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                count = rs.getInt(1); // Lấy kết quả của COUNT
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return count;
    }
    
//    public String getUser(int id) {
//        String user = "";
//        String sql = "SELECT * FROM user WHERE id_user = ?;";
//        try {
//            PreparedStatement st = connection.prepareStatement(sql);
//            st.setInt(1, id);
//            ResultSet rs = st.executeQuery();
//            if (rs.next()) {
//                user = rs.getString(1);
//            }
//        } catch (SQLException e) {
//            System.out.println(e);
//        }
//        return user;
//    }

    public static void main(String[] args) {
        UserDao c = new UserDao();
        List<User> list = c.getAll();
        for (User x : list) {
            System.out.println(x);
        }
    }
}
