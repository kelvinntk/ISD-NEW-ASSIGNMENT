package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.UserTransaction;
import Enity.*;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Kelvin Ng Tiong Kiat
 */
@WebServlet(name = "profileServlet", urlPatterns = {"/profileServlet"})
public class profileServlet extends HttpServlet {
    @PersistenceContext
    EntityManager em;
    @Resource
    UserTransaction utx;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
            String id = request.getParameter("id");
            String newEmail = request.getParameter("email");
            String newPass = request.getParameter("pass");
            String newPhone = request.getParameter("phone");
            
            try{
            Query studquery = em.createNamedQuery("Student.findAll");
            List <Student> studList = studquery.getResultList();
                        
            utx.begin();
            Student student = new Student();  
            student.setStudid(id);
            student.setStudemail(newEmail);
            student.setStudpassword(newPass);
            student.setStudphone(newPhone);
            em.merge(student);
            utx.commit();
            
            HttpSession session = request.getSession();
            studquery = em.createNamedQuery("Student.findAll");
            studList = studquery.getResultList();
            session.setAttribute("studList", studList);
            
            response.sendRedirect("Staff/FoodList.jsp");
                
            }catch (Exception ex){
                System.out.println("Error");
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
