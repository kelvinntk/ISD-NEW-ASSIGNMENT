<%-- 
    Document   : Menu
    Created on : Mar 16, 2019, 3:52:55 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Enity.*, java.util.*" %>
<% List<Meal> mealList = (List<Meal>) session.getAttribute("mealList");%>
<% List<Ordermeal> orderMealList = (List<Ordermeal>) session.getAttribute("orderMealList");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
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
        <link rel="stylesheet" href="css/rangebar.css">
        <link rel="stylesheet" href="css/buttonstyle.css">
    
    </head>
    <body>
         <%
            // get session attributes
            Student student = (Student) session.getAttribute("student");
            // redirect if not logged in
            if (session.getAttribute("student") == null) {response.sendRedirect("login.jsp");}
            // start of else
            else { // containing the following statements in if-else prevents NullPointerException when logged out
        %>
        <nav class="navbar navbar-expand-lg navbar-dark site_navbar bg-dark site-navbar-light" id="site-navbar">
      <div class="container">
        <a class="navbar-brand">DeliciousFood</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#site-nav" aria-controls="site-nav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="oi oi-menu"></span> Menu
        </button>

       <div class="collapse navbar-collapse" id="site-nav">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active"><a href="studenthome.jsp" class="nav-link">Home</a></li>
            <li class="nav-item active"><a href="" class="nav-link">Credit point: <%=student.getCredpoint()%></a></li>
            <li class="nav-item active"><a class="nav-link"><% if (request.getSession(false).getAttribute("student") != null) { %> ${student.studname} <% } else { %> Student <% } %></a></li>
          </ul>
        </div>
      
    </nav>
        <section class="site-cover" style="background:black;height: 400px;" id="section-home">
           
            <h1  style="padding-top:200px; text-align:center; visibility:hidden;"class="site-heading site-animate mb-3"><p style="color:#b8b8b8;">Menu</p></h1>
            <h2 style="text-align:center;"class="h5 site-subheading mb-5 site-animate"><p style="color:#b8b8b8;">Our menu include breakfast &amp; lunch.</p></h2>    
         
        </section>
        
       <div class="container">
        <div class="row align-items-center justify-content-center text-center site-vh-100">
          <div class="col-md-12">
            <br /><br />
            <div class="container-fluid">
            
            <ul class="list-unstyled multi-steps">
              <li class="is-active">Choose Meal</li>
              <li>Your Order</li>
  
              <li>Payment</li>
            </ul>
          </div>
              
            <div class="col-md-12 text-center">
            <ul class="nav site-tab-nav nav-pills mb-5" id="pills-tab" role="tablist">
              <li class="nav-item site-animate" >
                  <a href="#pills-breakfast"  class="nav-link active" id="pills-breakfast-tab" data-toggle="pill" role="tab" aria-controls="pills-breakfast" aria-selected="true">Breakfast</a>       
              </li>
              <li class="nav-item site-animate">
                  <a href="#pills-lunch"  class="nav-link" id="pills-lunch-tab" data-toggle="pill" role="tab" aria-controls="pills-lunch" aria-selected="false">Lunch</a>             
              </li>
            </ul>       
            </div>
                
               
            
            <div class="tab-content text-left">
              <div class="tab-pane fade show active" id="pills-breakfast" role="tabpanel" aria-labelledby="pills-breakfast-tab">
                <div class="row">
                   <%   
                       for(int i=0; i<mealList.size(); i++){
                       Meal meal = mealList.get(i);
                        if(meal.getMealcategory().equals("Breakfast")){
                    %>
                  <div class="col-md-6 site-animate">
                      
                    <div class="media menu-item">
                      <img class="mr-3" src="<%= meal.getMealimage()%>" class="img-fluid" >
                      <div class="media-body">
                        <h5 class="mt-0"><%= meal.getMealname() %></h5>
                        <p><%= meal.getMealdesc() %></p>
                        <h6 class="text-primary menu-price"><%= meal.getMealprice() + " credit points"%></h6>
                        <form action="StudentOrderMeal?id=<%= student.getStudid()%>&mealid=<%= meal.getMealid()%>&mealcategory=<%= meal.getMealcategory()%>" method="POST">
                        <label>Starting Date</label>
                        
                        <input type="date" name="startdate" required="required">
                        <label>End Date</label>
                        <input type="date" name="enddate" required="required">
                        <input type="submit" class="button" value="Order Now">
                        </form>
                      </div>
                    </div>
                         
                  </div>
                       <% }} %>
                        
                    
                </div>
                   <a href="OrderCart.jsp"><button style="margin-left:45%;" class="button">Order Cart</button></a>
              </div>
             
              <div class="tab-pane fade" id="pills-lunch" role="tabpanel" aria-labelledby="pills-lunch-tab">
                    <div class="row">
                        <% 
                     for(int i=0; i<mealList.size(); i++){
                    Meal meal = mealList.get(i);
                    if(meal.getMealcategory().equals("Lunch")){
                 %>
                  <div class="col-md-6 site-animate">
                 
                    <div class="media menu-item">
                      <img class="mr-3" src="<%= meal.getMealimage()%>" class="img-fluid" >
                      <div class="media-body">
                        <h5 class="mt-0"><%= meal.getMealname() %></h5>
                        <p><%= meal.getMealdesc() %></p>
                        <h6 class="text-primary menu-price"><%= meal.getMealprice() + " credit points"%></h6>
                        <form action="StudentOrderMeal?id=<%= student.getStudid()%>&mealid=<%= meal.getMealid()%>&mealcategory=<%= meal.getMealcategory()%>" method="POST">
                            <label>Starting Date</label>
                            <input type="date" name="startdate" required="required">
                            <label>End Date</label>
                            <input type="date" name="enddate" required="required">
                            <input type="submit" class="button" value="Order Now">
                        </form>
                      </div>
                    </div>
                        
                  </div>
                            <a href="OrderCart.jsp?id=<%= student.getStudid()%>&mealid=<%= meal.getMealid()%>&mealcategory=<%= meal.getMealcategory()%><button style="margin-left:45%;" class="button">Order Cart</button></a>
                         <% }} %>
                    </div>
                 
              </div>
                   
            </div>
                  
          </div>
        </div>
                   
       </div>
                 
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
