<%-- 
    Document   : cart
    Created on : Apr 2, 2019, 2:05:32 PM
    Author     : User
--%>


<%@page import="Enity.Food, java.util.*" %>
<% List<Food> foodList = (List<Food>) session.getAttribute("foodList");%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Food</title>
                <link rel="stylesheet" href="css/ordercart.css">
         <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
    <link rel="stylesheet" href="css/animate.css">
    
    <link rel="stylesheet" href="css/owl.carousel.min.css">
    <link rel="stylesheet" href="css/owl.theme.default.min.css">
    <link rel="stylesheet" href="css/magnific-popup.css">

    <link rel="stylesheet" href="css/bootstrap-datepicker.css">
    <link rel="stylesheet" href="css/jquery.timepicker.css">

    

    <link rel="stylesheet" href="css/icomoon.css">
    <link rel="stylesheet" href="css/style.css">
    

        
    </head>
    <body>
        
        <form action="ManagerEditFoods" method="post">
        
        <nav class="navbar navbar-expand-lg navbar-dark site_navbar bg-dark site-navbar-light" id="site-navbar">
      <div class="container">
        <a class="navbar-brand">DeliciousFood</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#site-nav" aria-controls="site-nav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="oi oi-menu"></span> Menu
        </button>

        <div class="collapse navbar-collapse" id="site-nav">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active"><a href="managerhome.jsp" class="nav-link">Home</a></li>
            <li class="nav-item"><a href="Menu.jsp" class="nav-link"><% if (request.getSession(false).getAttribute("manager") != null) { %> ${manager.managername} <% } else { %> Manager <% } %></a></li>
          </ul>
        </div>
      </div>
    </nav>
        <section class="site-cover" style="background:black;height: 400px;" id="section-home">
           
            <h1  style="padding-top:200px;text-align:center; visibility:hidden;"class="site-heading site-animate mb-3"><p style="color:#b8b8b8;">Edit Food</p></h1>
            
         
        </section>
        
    <% 
        String foodid = request.getParameter("foodid");
        for(int i=0; i<foodList.size(); i++){
        Food food = foodList.get(i);
        if(food.getFoodid().equals(foodid)){
    %>
    
      <div class="mealname" style="padding-top:150px;margin-left: 35%;">
  
            <p> <label style="color:black;clear: both;text-align: left;">Food ID</label>
                <input type="text" style="margin-left:65px;" value="<%= food.getFoodid() %>" name="foodid" readonly="readonly"></p>
     
            <p> <label style="color:black;clear: both;text-align: left;">Food Name</label>
               <input type="text" style="margin-left:38px;" value="<%= food.getFoodname() %>" name="foodname" required="required"></p>
        
            <p><label style="color:black;clear: both;text-align: left;">Calories</label>
               <input type="number" style="margin-left:62px;" value="<%= food.getCalories() %>" name="calories" required="required"></p>      
      
     <% }} %>
    <div style="margin-right:550px; margin-bottom:150px;padding-top:100px">
        <input type="submit" class="backorder" value="Edit Food">
        <a href="FoodMenu.jsp" class="backorder">Back To Food Menu</a>
  
     </form>     
    
      </div>
    <script src="js/jquery.min.js"></script>
    

    <script src="js/jquery.waypoints.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>

    <script src="js/main.js"></script>

    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.easing.1.3.js"></script>
   
   
    <script src="js/jquery.magnific-popup.min.js"></script>

   
    <script src="js/jquery.animateNumber.min.js"></script>
    
    </body>
</html>
