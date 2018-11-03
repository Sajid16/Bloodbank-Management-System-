/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sajid
 */
public class Search extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                String jdbcURL = "jdbc:mysql://localhost:3306/bloodbank?zeroDateTimeBehavior=convertToNull";
                String user = "root";
                String password = "";
                Connection con = null;
                con = DriverManager.getConnection(
                        jdbcURL, user, password);
                Statement stmt = con.createStatement();

                String S = request.getParameter("search");

                //String userQuery = "select Name,Address from infotbl where Blood="+request.getParameter("search");

                //stmt.executeUpdate(userQuery);
                
                ResultSet rs = stmt.executeQuery("select Name,Address from infotbl where Blood="+request.getParameter("search"));
                /*int i = stmt.executeUpdate(userQuery);
 
            if(i>10){
                response.sendRedirect("Test.html");
            }*/
                out.println("here");
                while (rs.next()) {

                    /*if (Uname.equals(rs.getString(1)) && Upass.equals(rs.getString(2))) {
                        out.println(Uname);
                        out.println(Upass);
                        RequestDispatcher rqDispatcher = request.getRequestDispatcher("/Info.jsp");
                        rqDispatcher.include(request, response);
                    } else {
                        //RequestDispatcher rqDispatcher = request.getAlert("");
                        //rqDispatcher.include(request, response);
                        //alert("Something went wrong! Check please......");
                        out.println("something went wrong");*/
                    String a= rs.getString(1);
                    String b= rs.getString(2);
                    //String c= rs.getString(3);
                    
                    out.println(a);
                    out.println(b);
                    //out.println(c);
                    
                    }

            } catch (ClassNotFoundException e) {
                out.println("Class not found");
            }
        } catch (SQLException e) {

        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
