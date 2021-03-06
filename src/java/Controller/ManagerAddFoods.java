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
@WebServlet(name ="ManagerAddFoods", urlPatterns = {"/ManagerAddFoods"})
public class ManagerAddFoods extends HttpServlet {
   @PersistenceContext
    EntityManager em;
    @Resource
    UserTransaction utx;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Query foodquery = em.createNamedQuery("Food.findAll");
            List<Food> foodList = foodquery.getResultList();
        
        String foodname = request.getParameter("foodname");
        int calories = Integer.parseInt(request.getParameter("calories"));
        String foodid = "";
        Food food = new Food();
       HttpSession session = request.getSession();
        foodid = "F" + String.format("%03d",foodList.size() + 1);
           
             
       try{  
            
              food.setFoodid(foodid);
              food.setFoodname(foodname);
              food.setCalories(calories);   
              utx.begin();
              em.persist(food);
              utx.commit();   
              Query query = em.createNamedQuery("Food.findAll");
              foodList = foodquery.getResultList();
                            session.setAttribute("foodList", foodList);
                           
            
                          
        } catch(Exception ex) {}
              request.getRequestDispatcher("AddFood.jsp?status=success").forward(request, response);           
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
