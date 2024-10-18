/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.admin;

import dao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *
 * @author pc
 */
public class AdminCreateUserController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("admin/createUser.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        request.getRequestDispatcher("admin/createUser.jsp").forward(request, response);
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String name = request.getParameter("name");
//        String date_of_bird = request.getParameter("date_of_bird");
//        String role_raw = request.getParameter("role");
////        String status_raw = request.getParameter("status");
//        int role;
//        UserDao udb = new UserDao();
//        try{
//            role = Integer.parseInt(role_raw);
////            status = Integer.parseInt(status_raw);
//            User uNew = new User(1, username, password, name, date_of_bird, role, 0);
//            udb.insert(uNew);
//            request.setAttribute("success", "Thêm mới thành công!!");
//            response.sendRedirect("admin-user");
////            request.getRequestDispatcher("admin/createUser.jsp").forward(request, response);
//        }catch(NumberFormatException e){
//            System.out.println(e);
//        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String date_of_bird = request.getParameter("date_of_bird");
        String role_raw = request.getParameter("role");
        String status_raw = request.getParameter("status");
        int role, status;
        UserDao udb = new UserDao();
        try{
            role = Integer.parseInt(role_raw);
            status = Integer.parseInt(status_raw);
            User uNew = new User(1, username, password, name, date_of_bird, role, status);
            udb.insert(uNew);
            response.sendRedirect("admin-user");
        }catch(NumberFormatException e){
            System.out.println(e);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
