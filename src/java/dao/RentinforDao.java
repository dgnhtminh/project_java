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
import model.Rentinfor;

/**
 *
 * @author pc
 */
public class RentinforDao extends DBcontext {

    public List<Rentinfor> getAll() {
        List<Rentinfor> list = new ArrayList<>();
        String sql = "SELECT * FROM rentcar.rentinfor;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Rentinfor c = new Rentinfor(rs.getInt("rent_id"),
                        rs.getString("customer_name"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getString("customer_note"),
                        rs.getString("pick_up_date"),
                        rs.getString("pick_off_date"),
                        rs.getString("pick_up_location"),
                        rs.getString("pick_off_location"),
                        rs.getInt("id_user"),
                        rs.getString("time_sent"),
                        rs.getInt("status")
                );
                list.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    
    //insert rentinfor
    public void insert(Rentinfor u) {
        String sql = "INSERT INTO rentinfor (customer_name, phone, email, customer_note, pick_up_date, pick_off_date, pick_up_location, pick_off_location, id_user, time_sent, status) \n"
                + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            st.setString(1, u.getCustomer_name());
            st.setString(2, u.getPhone());
            st.setString(3, u.getEmail());
            st.setString(4, u.getCustomer_note());
            st.setString(5, u.getPick_up_date());
            st.setString(6, u.getPick_off_date());
            st.setString(7, u.getPick_up_location());
            st.setString(8, u.getPick_off_location());
            st.setInt(9, u.getId_user());
            st.setString(10, u.getTime_sent());
            st.setInt(11, u.getStatus());
            

            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //tim 1 rentinfor khi co id
    public Rentinfor getRentinforById(int id) {
        String sql = "SELECT * FROM rentinfor WHERE rent_id = ?;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Rentinfor u = new Rentinfor(rs.getInt("rent_id"),
                        rs.getString("customer_name"),
                        rs.getString("phone"),
                        rs.getString("email"),
                        rs.getString("customer_note"),
                        rs.getString("pick_up_date"),
                        rs.getString("pick_off_date"),
                        rs.getString("pick_up_location"),
                        rs.getString("pick_off_location"),
                        rs.getInt("id_user"),
                        rs.getString("time_sent"),
                        rs.getInt("status"));
                return u;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    //delete Rentinfor
    public void delete(int id) {
        String sql = "DELETE FROM rentinfor WHERE rent_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    //update Rentinfor
    public void update(Rentinfor u) {
        String sql = "UPDATE rentinfor\n"
                + "SET customer_name=?, phone=?, email=?, customer_note=?,pick_up_date=?,pick_off_date=?, pick_up_location=?, pick_off_location=?, id_user=?, time_sent=?, status=?\n"
                + "WHERE rent_id = ?;";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            
            st.setString(1, u.getCustomer_name());
            st.setString(2, u.getPhone());
            st.setString(3, u.getEmail());
            st.setString(4, u.getCustomer_note());
            st.setString(5, u.getPick_up_date());
            st.setString(6, u.getPick_off_date());
            st.setString(7, u.getPick_up_location());
            st.setString(8, u.getPick_off_location());
            st.setInt(9, u.getId_user());
            st.setString(10, u.getTime_sent());
            st.setInt(11, u.getStatus());
            st.setInt(12, u.getRent_id());
            
            st.executeUpdate();
        } catch(SQLException e){
            System.out.println(e);
        }
    }
}
