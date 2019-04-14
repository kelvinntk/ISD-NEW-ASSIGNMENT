/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Enity.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;
import javax.validation.ConstraintViolationException;

/**
 *
 * @author Kelvin Ng Tiong Kiat
 */
@WebServlet(name = "staffServlet", urlPatterns = {"/staffServlet"})
public class staffServlet extends HttpServlet {
    @PersistenceContext
    EntityManager em;
    @Resource
    UserTransaction utx;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
            HttpSession session = request.getSession(false);
            Staff staff = (Staff) session.getAttribute("staff");
            
            String newName = request.getParameter("name");
            String newEmail = request.getParameter("email");
            String newPass = request.getParameter("pass");
        
        try {
            Query staffquery = em.createNamedQuery("Staff.findAll");
            List <Staff> staffList = staffquery.getResultList();
            
            staff.setStaffname(newName);
            staff.setStaffemail(newEmail);
            staff.setStaffpass(newPass);
            
            utx.begin();
            em.merge(staff);
            utx.commit();
            
            staffquery = em.createNamedQuery("Staff.findAll");
            staffList = staffquery.getResultList();
            session.setAttribute("staff", staff);
            
            response.sendRedirect("staffhome.jsp");
            
        } catch (ConstraintViolationException e){
            System.out.println(e.getConstraintViolations());
        } catch(Exception ex){
            System.out.println("ERROR");
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
