/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Enity.*;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;
/**
 *
 * @author Kelvin Ng Tiong Kiat
 */
@WebServlet(name = "paymentServlet", urlPatterns = {"/paymentServlet"})
public class paymentServlet extends HttpServlet {

         @PersistenceContext
        EntityManager em;
        @Resource
        UserTransaction utx;    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String studid = request.getParameter("student");
        String totalStr = request.getParameter("total");
            
        try{         
                Student student = em.find(Student.class, studid);
                int total = Integer.parseInt(totalStr);
                // Get the latest student detailss
                if (student != null) {
                    if(student.getCredpoint() >= total){
                        // Charge the student
                        HttpSession session  = request.getSession(true);
                        session.setAttribute("student", student);
                        int currentCredit = student.getCredpoint();
                        total = currentCredit - total;
                        student.setCredpoint(total);   

                       // Add to database
                       utx.begin();
                       em.merge(student);
                       utx.commit();

                       request.setAttribute("alertMsg", "<span style=\"color: #7DE969  \"><b>Thank you for your purchase!</b></span>");
                       request.getRequestDispatcher("studenthome.jsp").forward(request, response);
                       return; 
                    } else{
                       request.setAttribute("errorMsg", "<span style=\"color:red\"><b>Insufficient credit point! Please top up!</b></span>");
                       request.getRequestDispatcher("Payment.jsp").forward(request, response);
                       return;
                    }
                }
                    
        } catch (Exception ex){
            System.out.println("ERROR");
            ex.printStackTrace();
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
