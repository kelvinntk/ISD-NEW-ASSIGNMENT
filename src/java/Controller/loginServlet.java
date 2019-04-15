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
/**
 *
 * @author Kelvin Ng Tiong Kiat
 */
@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

    @PersistenceContext
    EntityManager em;
    @Resource
    UserTransaction utx;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
         // get email and password
        String id = request.getParameter("id");
        String pass = request.getParameter("pass");

        // check if combination exists
        Student student = new Student();
        Staff staff = new Staff();
        Manager manager = new Manager();
       try {
            //find id info from db
            student = (Student) em.find(Student.class, id);
            staff = (Staff) em.find(Staff.class, id);
            manager = (Manager) em.find(Manager.class, id);
            
            if (student != null) {
                if (student.getStudpassword().equals(pass)) {
                    HttpSession session  = request.getSession(true);
                    session.setAttribute("student", student);
                    request.getRequestDispatcher("studenthome.jsp").forward(request, response);
                }
                // if doesnt exist, go back to login page
                else {
                response.sendRedirect("login.jsp?loginstatus=studloginfail");
                }
          } 
            else  if (staff != null) {
                if (staff.getStaffpass().equals(pass)) {
                    HttpSession session  = request.getSession(true);
                    session.setAttribute("staff", staff);
                    request.getRequestDispatcher("staffhome.jsp").forward(request, response);
                }
                else {
                // if doesnt exist, go back to login page
                request.getRequestDispatcher("login.jsp?loginstatus=staffloginfail").forward(request, response);
                }
          } 
            else if (manager != null){
                 if (manager.getManagerpass().equals(pass)) {
                    HttpSession session  = request.getSession(true);
                    session.setAttribute("manager", manager);
                    request.getRequestDispatcher("managerhome.jsp").forward(request, response);
                }
                else {
                // if doesnt exist, go back to login page
                request.getRequestDispatcher("login.jsp?loginstatus=staffloginfail").forward(request, response);
                }
            }
            else{
                request.getRequestDispatcher("login.jsp?loginstatus=invalidID").forward(request, response);
            }
          } catch (Exception ex) {
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
