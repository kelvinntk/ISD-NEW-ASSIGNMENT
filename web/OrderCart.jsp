<%-- 
    Document   : cart
    Created on : Apr 2, 2019, 2:05:32 PM
    Author     : User
--%>
<%@page import="java.text.SimpleDateFormat"%>

<%@page import="Enity.*, java.util.*"%>
<%@page import="javax.servlet.http.HttpSession"%>
<% List<OrderCart> orderList = (List<OrderCart>) session.getAttribute("orderList");%>
<% List<Ordermeal> orderMealList = (List<Ordermeal>) session.getAttribute("orderMealList");%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Cart</title>
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
    <link rel="stylesheet" href="css/rangebar.css">
        
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
            <li class="nav-item active"><a href="" class="nav-link"><% if (request.getSession(false).getAttribute("student") != null) { %> ${student.studname} <% } else { %> Student <% } %></a></li>
          </ul>
        </div>
      </div>
    </nav>
        <section class="site-cover" style="background:black;height: 400px;" id="section-home">
           
            <h1  style="padding-top:200px; text-align:center; visibility:hidden;"class="site-heading site-animate mb-3"><p style="color:#b8b8b8;">Your Order</p></h1>
            
         
        </section>
        
       <div class="container">
        <div class="row align-items-center justify-content-center text-center site-vh-100">
          <div class="col-md-12">
            
            <div class="container-fluid">
            <br /><br />
                <ul class="list-unstyled multi-steps">
                  <li>Choose Meal</li>
                  <li class="is-active">Your Order</li>
                  
                  <li>Payment</li>
                </ul>
          </div>
<div class="shopping-cart">

  <div class="column-labels">
    <label class="product-image">Image</label>
    <label class="product-details">Product</label>
    <label class="product-price">Credit Points</label>
  
    
  </div>
    <%
    for (int i = 0; i < orderMealList.size(); i++) {
        
    
  %>
        <div class="product">
    <div class="product-image">
        <img src="<%= orderMealList.get(i).getMealMealid().getMealimage()%>">
    </div>
    <div class="product-details">
        <div class="product-title"><%= orderMealList.get(i).getMealMealid().getMealname() %></div>
      <p class="product-description"><%= orderMealList.get(i).getMealMealid().getMealdesc() %></p>
    </div>
    
   
    <div class="product-price"><%= orderMealList.get(i).getMealMealid().getMealprice() %></div>
    <div class="product-removal">
        <form action="removeOrderServlet" method="post">
            
            <input type="hidden" value="<%= orderMealList.get(i).getMealMealid().getMealid()%>" name="ordermealid"/>
        </form>
    </div>
 
  </div>
<% } %>

<div class="totals" style="margin-left: 17%">
    <div class="totals-item" style="float: right; clear: both;width: 100%;
    margin-bottom: 10px;margin-right: 20%;">
      <label style="float: left;margin-right:100px;clear: both;width: 79%;text-align: right;">Total:</label>
         <%
             int total = 0;
             %>
         <%
          for (int i = 0; i < orderMealList.size(); i++) {
              int credpoints=0;
               credpoints = orderMealList.get(i).getMealMealid().getMealprice();
               total += credpoints;
        %>
      <%}%>
      
      <div class="totals-value" style="text-align: right;margin-right: 40px;"><%= total %></div>
    </div>
    
    </div>
  </div>
  <div style="margin-top:50px;float:right; margin-right:300px;">
   
      <a href="Payment.jsp?total=<%=total%>"> <button class="checkout">Proceed To payment</button></a>
      <a href="Menu.jsp"> <button class="backorder">Back To Order</button></a>
    
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
