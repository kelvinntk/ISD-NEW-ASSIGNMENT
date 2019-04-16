package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;
import Enity.*;
import javax.validation.ConstraintViolationException;

/**
 *
 * @author Kelvin Ng Tiong Kiat
 */
@WebServlet(name = "registerServlet", urlPatterns = {"/registerServlet"})
public class registerServlet extends HttpServlet {

    @PersistenceContext
    EntityManager em;
    @Resource
    UserTransaction utx;   

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        // get parameters from JSP
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String rePass = request.getParameter("rePass");
        String phone = request.getParameter("phone");
        
        Student student = new Student();
        Staff staff = new Staff();
        Manager manager = new Manager();
        
        try {   
            student = (Student) em.find(Student.class, id);
            staff = (Staff) em.find(Staff.class, id);
            manager = (Manager) em.find(Manager.class, id);
            //validation
            if (student == null && staff == null && manager == null){
                        if (id.indexOf("STUD") >=0 ){
                            student = new Student();
                            student.setStudid(id);
                            student.setStudname(name);
                            student.setStudemail(email);
                            student.setStudpassword(pass);
                            student.setStudpassword(rePass);
                            student.setStudphone(phone);
                            student.setCredpoint(0);
                            // add student to database
                            utx.begin();
                            em.persist(student);
                            utx.commit();
                            response.sendRedirect("login.jsp?success=DONE");
                        } 
                        else if(id.indexOf("STAFF") >=0 ){
                            staff = new Staff();
                            staff.setStaffid(id);
                            staff.setStaffname(name);
                            staff.setStaffemail(email);
                            staff.setStaffpass(pass);  
                            
                            utx.begin();
                            em.persist(staff);
                            utx.commit();
                            response.sendRedirect("login.jsp?success=DONE");
                        }
                        else if(id.indexOf("MNG") >=0 ){
                            manager = new Manager();
                            manager.setManagerid(id);
                            manager.setManagername(name);
                            manager.setManageremail(email);
                            manager.setManagerpass(pass);  
                            
                            utx.begin();
                            em.persist(manager);
                            utx.commit();
                            response.sendRedirect("login.jsp?success=DONE");
                        }
            } else{
                request.setAttribute("errorMsg", "<span style=\"color: #ea5454\">This ID already Exists</span>");
                request.getRequestDispatcher("Register.jsp").forward(request, response);
                return;
            } 
            
        } catch (ConstraintViolationException e){
                System.out.println(e.getConstraintViolations());
                
        } catch (Exception ex) {
            System.out.print("ERROR");
            ex.printStackTrace();
        }
     // redirect
        
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
