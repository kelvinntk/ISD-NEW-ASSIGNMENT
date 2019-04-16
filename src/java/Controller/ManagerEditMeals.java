/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Enity.*;
import java.io.*;
import java.util.List;
import javax.annotation.*;
import javax.persistence.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.transaction.*;

/**
 *
 * @author User
 */
@WebServlet(name ="ManagerEditMeals", urlPatterns = {"/ManagerEditMeals"})
public class ManagerEditMeals extends HttpServlet {
   @PersistenceContext
    EntityManager em;
    @Resource
    UserTransaction utx;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String mealid = request.getParameter("mealid");
        String mealname = request.getParameter("mealname");
        String mealdesc = request.getParameter("mealdesc");
        int mealprice = Integer.parseInt(request.getParameter("mealprice"));
        String mealimage = request.getParameter("mealimage");
        String mealcategory = request.getParameter("mealcategory");
        HttpSession session = request.getSession();
        
        
        try {
            Meal meal = new Meal();
            meal.setMealid(mealid);
            meal.setMealname(mealname);
            meal.setMealdesc(mealdesc);
            meal.setMealprice(mealprice);
            meal.setMealimage(mealimage);
            meal.setMealcategory(mealcategory);
            utx.begin();
            em.merge(meal);
            utx.commit();
            
          Query query = em.createNamedQuery("Meal.findAll");
          List<Meal> mealList = query.getResultList();
          session.setAttribute("mealList", mealList);
        } catch(Exception ex) {}
         request.getRequestDispatcher("EditMeal.jsp?status=success").forward(request,response);
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
