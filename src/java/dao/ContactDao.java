/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Contact;

/**
 *
 * @author pc
 */
public class ContactDao extends DBcontext {

    public List<Contact> getAll() {
        List<Contact> list = new ArrayList<>();
        String sql = "SELECT * FROM rentcar.contact;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Contact c = new Contact(rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("subject"),
                        rs.getString("message"),
                        rs.getInt("status"),
                        rs.getString("time_sent")
                );
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    //insert contact
    public void insert(Contact u) {
        String sql = "INSERT INTO contact (username, email, subject, message, status, time_sent) \n"
                + "VALUES(?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            st.setString(1, u.getUsername());
            st.setString(2, u.getEmail());
            st.setString(3, u.getSubject());
            st.setString(4, u.getMessage());
            st.setInt(5, u.getStatus());
            st.setString(6, u.getTime_sent());

            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //tim 1 contact khi co id
    public Contact getContactById(int id) {
        String sql = "SELECT * FROM contact WHERE id = ?;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Contact u = new Contact(rs.getInt("id"),
                        rs.getString("username"),
                        rs.getString("email"),
                        rs.getString("subject"),
                        rs.getString("message"),
                        rs.getInt("status"),
                        rs.getString("time_sent"));
                return u;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    //delete Contact
    public void delete(int id) {
        String sql = "DELETE FROM contact WHERE id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //update Contact
    public void update(Contact u) {
        String sql = "UPDATE contact\n"
                + "SET username=?, email=?, subject=?, message=?,status=?,time_sent=?\n"
                + "WHERE id = ?;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, u.getUsername());
            st.setString(2, u.getEmail());
            st.setString(3, u.getSubject());
            st.setString(4, u.getMessage());
            st.setInt(5, u.getStatus());
            st.setString(6, u.getTime_sent());
            st.setInt(7, u.getId());
            
            st.executeUpdate();
        } catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public int count(){
        int count = 0;
        String sql = "select count(*) from contact";
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
    
    public static void main(String[] args) {
        ContactDao c = new ContactDao();
        List<Contact> list = c.getAll();
        for (Contact x : list) {
            System.out.println(x);
        }
    }
}
