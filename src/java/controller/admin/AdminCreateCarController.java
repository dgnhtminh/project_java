/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller.admin;

import dao.CarDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Car;

/**
 *
 * @author pc
 */
public class AdminCreateCarController extends HttpServlet {

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
        request.getRequestDispatcher("admin/createCar.jsp").forward(request, response);
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
        request.getRequestDispatcher("admin/createCar.jsp").forward(request, response);
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
        
        String carname = request.getParameter("carname");
        String seats_raw = request.getParameter("seats");
        String fuel = request.getParameter("fuel");
        String transmission = request.getParameter("transmission");
        String luggage_raw = request.getParameter("luggage");
        String img = request.getParameter("img");
        String description = request.getParameter("description");
        String rate_raw = request.getParameter("rate");
        String status_raw = request.getParameter("status");
        String color = request.getParameter("color");
        String price_raw = request.getParameter("price");
        String year_of_manufacture_raw = request.getParameter("year_of_manufacture");
        String current_address = request.getParameter("current_address");
        String car_type_id_raw = request.getParameter("car_type_id");
        String car_brand_id_raw = request.getParameter("car_brand_id");
        String rent_id_raw = request.getParameter("rent_id");
        String district_id_raw = request.getParameter("district_id");
        int seats, luggage, rate, status, price, year_of_manufacture, car_type_id, car_brand_id, rent_id, district_id;
        CarDao udb = new CarDao();
        try{
            seats = Integer.parseInt(seats_raw);
            luggage = Integer.parseInt(luggage_raw);
            rate = Integer.parseInt(rate_raw);
            status = Integer.parseInt(status_raw);
            price = Integer.parseInt(price_raw);
            year_of_manufacture = Integer.parseInt(year_of_manufacture_raw);
            car_type_id = Integer.parseInt(car_type_id_raw);
            car_brand_id = Integer.parseInt(car_brand_id_raw);
            rent_id = Integer.parseInt(rent_id_raw);
            district_id = Integer.parseInt(district_id_raw);
            
            Car uNew = new Car(1, carname, seats, fuel, transmission, luggage, img, description, rate, status, color, price, year_of_manufacture, current_address, car_type_id, car_brand_id, rent_id, district_id);
            udb.insert(uNew);
            response.sendRedirect("admin-car");
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
