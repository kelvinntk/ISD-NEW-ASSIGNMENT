<%-- 
    Document   : cart
    Created on : Apr 2, 2019, 2:05:32 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Enity.*, java.util.*" %>
<% List<Meal> mealList = (List<Meal>) session.getAttribute("mealList");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Meal</title>
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
        <%
            // get session attributes
            Manager manager = (Manager) session.getAttribute("manager");
            // redirect if not logged in
            if (session.getAttribute("manager") == null) {response.sendRedirect("login.jsp");}
            // start of else
            else { // containing the following statements in if-else prevents NullPointerException when logged out
        %>
    <%
        String status = request.getParameter("status");
    %>
    <%
        if(status != null){
            if(status.equals("success")){
    %>
      <script>alert(" *Successful edit meal* ");</script>
    <%}}%>
 
        <nav class="navbar navbar-expand-lg navbar-dark site_navbar bg-dark site-navbar-light" id="site-navbar">
      <div class="container">
        <a class="navbar-brand" href="index_1.html">DeliciousFood</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#site-nav" aria-controls="site-nav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="oi oi-menu"></span> Menu
        </button>

        <div class="collapse navbar-collapse" id="site-nav">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active"><a href="managerhome.jsp" class="nav-link">Home</a></li>
            <li class="nav-item"><a href="About.jsp" class="nav-link">About</a></li>
            <li class="nav-item"><a href="#section-offer" class="nav-link">Offer</a></li>
            <li class="nav-item"><a href="Menu.jsp" class="nav-link">Menu</a></li>
        
          </ul>
        </div>
      </div>
    </nav>
        <section class="site-cover" style="background:black;height: 400px;" id="section-home">
           
            <h1  style="padding-top:200px;text-align:center; visibility:hidden;"class="site-heading site-animate mb-3"><p style="color:#b8b8b8;">Edit Meal</p></h1>
            
         
        </section>
        
    <form action="ManagerEditMeals" method="post">
        <% 
        String mealid = request.getParameter("mealid");
        for(int i=0; i<mealList.size(); i++){
            Meal meal = mealList.get(i);
            if(meal.getMealid().equals(mealid)){
          %>
        <div class="mealname" style="padding-top:150px;margin-left: 35%;">
          
            <p> <label style="color:black;clear: both;text-align: left;">Meal ID</label>
                <input type="text" style="margin-left:38px;" value="<%= meal.getMealid() %>" name="mealid" readonly="readonly"></p>
     
            <p> <label style="color:black;clear: both;text-align: left;">Meal Name</label>
               <input type="text" style="margin-left:38px;" value="<%= meal.getMealname() %>" name="mealname" required="required"></p>
          <p><label style="color:black;clear: both;text-align: left;">Meal Description</label>
              <input type="text" style="margin-left:62px;" value="<%= meal.getMealdesc() %>"name="mealdesc" required="required"></p>
          
          <p><label style="color:black;clear: both;text-align: left;">Meal Price</label>
              <input type="number" style="margin-left:105px;" value="<%= meal.getMealprice() %>" name="mealprice" required="required"></p>
          
          <p><label style="color:black;clear: both;text-align: left;">Meal Image</label>
              <input type="text" style="margin-left:97px;" value="<%= meal.getMealimage() %>"name="mealimage" required="required"></p>
             
            <label style="color:black;clear: both;text-align: left;">Meal Category</label>
            <select name="mealcategory" style="margin-left:76px;">
                <option value="Breakfast">Breakfast</option>
                <option value="Lunch">Lunch</option>
            </select>
      </div>
      <% }} %>
    
      
        <div style="margin-right:550px; margin-bottom:150px;padding-top:100px">
            <input type="submit" value="Edit Meal" class="backorder">
            <a href="managermenu.jsp"><button class="backorder">Back To Meal Menu</button></a>
        </div>
      </form>  
         <% } %>
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
