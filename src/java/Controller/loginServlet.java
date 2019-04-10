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
import javax.transaction.UserTransaction;

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
        try {
            //get input details
            String email = request.getParameter("email");
            String pass = request.getParameter("pass");
            
            if(loginID.indexOf("STD") >=0){
                Query query = em.createNamedQuery("Student.findAll");
                List<Student> studentList = query.getResultList();

                for(int i=0 ; i<studentList.size() ; i++){
                    Student stud = studentList.get(i);
                    if(stud.getStudid().equals(loginID) && stud.getStudpassword().equals(password)){
                        Student std = em.find(Student.class ,loginID);
                        HttpSession session = request.getSession();
                        session.setAttribute("student",std);
                        
                        Query foodquery = em.createNamedQuery("Food.findAll");
                        Query mealquery = em.createNamedQuery("Meal.findAll");
                        
                        
                        response.sendRedirect("HeaderFooter/loading.jsp?status=studentloggingin");
                    }  
                    
                }
                response.sendRedirect("LoginRegister/Login.jsp?status=loginfailed");
            }

            
        }catch (Exception ex){
            //ntg
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
