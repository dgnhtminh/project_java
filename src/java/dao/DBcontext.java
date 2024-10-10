/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class DBcontext {
    protected Connection connection;
    public DBcontext() {
        
        try {
            String url = "jdbc:mysql://localhost:3306/rentcar";
            String user = "root";
            String password = "Minhduong1608";
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        
    }
//    
//    public static void main(String[] args) {
//        Connection conn = getJDBCConnection();
//        
//        if(conn != null){
//            System.out.println("Thanh cong");
//        } else{
//            System.out.println("That bai");
//        }
//    }
}
