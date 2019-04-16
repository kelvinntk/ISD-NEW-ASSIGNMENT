/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Enity.*;
import Enity.Meal;
import Enity.MealFood;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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

/**
 *
 * @author Kelvin Ng Tiong Kiat
 */
@WebServlet(name = "StudentOrderMeal", urlPatterns = {"/StudentOrderMeal"})
public class StudentOrderMeal extends HttpServlet {
    @PersistenceContext
    EntityManager em;
    @Resource
    UserTransaction utx;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try  {
            HttpSession session = request.getSession(true);
            String orderStartDate = request.getParameter("startdate");
            String orderEndDate = request.getParameter("enddate");
            String mealcategory = request.getParameter("mealcategory");
            String mealid = request.getParameter("mealid");
            String studid = request.getParameter("studid");
            
            
            Student stud = em.find(Student.class,studid);
            Meal meal = em.find(Meal.class,mealid);
            Calendar c = Calendar.getInstance();
            
            Date startDate = new SimpleDateFormat("yyyy-MM-dd").parse(orderStartDate);  
            Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse(orderEndDate);
            
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDateTime now = LocalDateTime.now();  
            
            Date todaysDate = new SimpleDateFormat("yyyy-MM-dd").parse(dtf.format(now));
            int daysBeforeOrders = (int)(startDate.getTime() - todaysDate.getTime())/(1000*60*60*24);
            
            int days = (int)(endDate.getTime() - startDate.getTime())/(1000*60*60*24);
            boolean sameDate = false;
                
            
            if(daysBeforeOrders >2){
            List<Ordermeal> selectedOrderMeal = new ArrayList<Ordermeal>();  
                utx.begin();
            for(int i=0; i<=days ; i++){
                Query orderquery = em.createNamedQuery("Orders.findAll");
                List<OrderCart> orderList = orderquery.getResultList();
                Query ordermealquery = em.createNamedQuery("OrderMeal.findAll");
                List<Ordermeal> orderMealList = ordermealquery.getResultList();
                
                int ordersize = orderList.size();
                int ordermealsize = orderMealList.size();
                int couponsize = orderList.size();
                
                String orderID = "";
                String couponCode = "";
                String ordermealid = "";
               ordermealid = "OM" + String.format("%03d", orderMealList.size()+1);
                 couponCode = "C" + String.format("%03d", orderMealList.size()+1);
                  orderID = "OR" + String.format("%03d", orderMealList.size()+1);
                c.setTime(startDate);
                c.add(Calendar.DATE,i);
                startDate = c.getTime();
                
                for(int j=0 ; j<orderList.size() ; j++){
                    OrderCart orders = orderList.get(j);
                    if(orders.getOrderdate().compareTo(startDate) == 0 && orders.getStudentStudid().getStudid().equals(studid) && 
                        orders.getOrdermealList().get(0).getMealMealid().getMealcategory().equals(mealcategory)){
                        sameDate = true;
                        orderquery = em.createNamedQuery("Orders.findAll");
                        orderList = orderquery.getResultList();
                        session.setAttribute("orderList", orderList);
                        if(orders.getOrdermealList().get(0).getMealMealid().getMealcategory().equals("Breakfast")){
                            response.sendRedirect("Menu.jsp" + orders.getOrderdate());
                        }
                        else
                            response.sendRedirect("Menu.jsp");
                    }
                }
                
                
                if(orderList.size() == 0){
                    orderID = "OD" + String.format("%02d",ordersize + 1);
                    couponCode = "CP" + String.format("%02d",ordersize + 1);
                    ordermealid = "OM" + String.format("%02d",ordermealsize + 1);
                }
                else{
                    orderID = "OD" + String.format("%02d",ordersize + 1);
                    couponCode = "CP" + String.format("%02d",ordersize + 1);
                    boolean duplicateID;
                    int newID = 1;
                    
                    String newFormatOrdernum = orderID.substring(2,4);  //02
                    
                    do{
                        duplicateID = false;
                        for(int j=0 ; j<orderList.size() ; j++){
                            OrderCart orderlist = orderList.get(j);
                            String formatOrdernum = orderlist.getOrderid().substring(2,4);  //02
                            
                    
                            
                            if(newFormatOrdernum.equals(formatOrdernum)){
                                duplicateID = true;
                                newFormatOrdernum = String.format("%02d",newID);//01
                            }
                        }
                        ++newID;
                        if(duplicateID == false){
                            orderID = "OD" + newFormatOrdernum;
                            couponCode = "CP" + newFormatOrdernum;
                            ordermealid = "OM" + newFormatOrdernum;
                        }
                    }while(duplicateID == true);
                }
                
                c.setTime(startDate);
                OrderCart orders = new OrderCart();
                orders.setOrderid(orderID);
                orders.setOrderdate(startDate);
                orders.setCouponcode(couponCode);
                orders.setOrderstatus("Ordered");
                orders.setStudentStudid(stud);
                
                
                Ordermeal ordermeal = new Ordermeal(ordermealid,meal,orders);
                selectedOrderMeal.add(ordermeal);
                
                
                orders.setOrdermealList(selectedOrderMeal);
                
                em.persist(orders);
            }
            
            if(sameDate == false){
                utx.commit();
            }
            
                Query orderquery = em.createNamedQuery("Orders.findAll");
                List<OrderCart> orderList = orderquery.getResultList();
                session.setAttribute("orderList", orderList);
                
                if(mealcategory.equals("Breakfast"))
                    response.sendRedirect("Menu.jsp");
                else
                    response.sendRedirect("Menu.jsp");
            }
            else{
                if(mealcategory.equals("Lunch"))
                    response.sendRedirect("Menu.jsp");
                else
                    response.sendRedirect("Menu.jsp");
            }
        }
        catch(Exception ex){
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
