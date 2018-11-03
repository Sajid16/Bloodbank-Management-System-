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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sajid
 */
public class LogIn extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.lang.ClassNotFoundException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
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

                String Uname = request.getParameter("uname");
                String Upass = request.getParameter("upass");

                String userQuery = "select * from hospitalregistration";

                //stmt.executeUpdate(userQuery);
                ResultSet rs = stmt.executeQuery(userQuery);
                /*int i = stmt.executeUpdate(userQuery);
 
            if(i>10){
                response.sendRedirect("Test.html");
            }*/
                HttpSession session = request.getSession();
                Integer accessCount;
                synchronized (session) {
                    accessCount = (Integer) session.getAttribute("accessCount");
                    if (accessCount == null) {
                        accessCount = 0; // autobox int to Integer
                    } else {
                        accessCount = new Integer(accessCount + 1);
                    }
                    session.setAttribute("accessCount", accessCount);
                    session.setAttribute("uname",Uname);
                }
                System.out.println(accessCount);
                System.out.println(session.getAttribute("uname"));
                while (rs.next()) {

                    if (Uname.equals(rs.getString(1)) && Upass.equals(rs.getString(2))) {
                        out.println(Uname);
                        out.println(Upass);
                        RequestDispatcher rqDispatcher = request.getRequestDispatcher("/Info.jsp");
                        rqDispatcher.include(request, response);
                    } else {
                        //RequestDispatcher rqDispatcher = request.getAlert("");
                        //rqDispatcher.include(request, response);
                        //alert("Something went wrong! Check please......");
                        out.println("something went wrong");
                    }

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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
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

    private void alert(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
