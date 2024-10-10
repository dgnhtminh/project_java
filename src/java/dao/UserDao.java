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
public class UserDao extends DBcontext{
    public List<User> getAll() {
        List<User> list = new ArrayList<>();
        String sql = "SELECT * FROM rentcar.user;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
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
    public static void main(String[] args) {
        UserDao c = new UserDao();
        List<User> list = c.getAll();
        for(User x : list) {
            System.out.println(x);
        }
    }
}
