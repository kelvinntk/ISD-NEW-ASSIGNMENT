<%-- 
    Document   : History
    Created on : Apr 2, 2019, 2:05:32 PM
    Author     : User
--%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Enity.*, java.util.*"%>
<% List<Meal> mealList = (List<Meal>) session.getAttribute("mealList");%>
<% List<OrderCart> orderList = (List<OrderCart>) session.getAttribute("orderList");%>
  <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>

    <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Order History</title>
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
       <link rel="stylesheet" href="css/reportcss.css">
    </head>

    <body>
        <%
            // get session attributes
            Staff staff = (Staff) session.getAttribute("staff");
            // redirect if not logged in
            if (session.getAttribute("staff") == null) {response.sendRedirect("login.jsp");}
            // start of else
            else { // containing the following statements in if-else prevents NullPointerException when logged out
        %>
      <nav class="navbar navbar-expand-lg navbar-dark site_navbar bg-dark site-navbar-light" id="site-navbar">
        <div class="container">
          <a class="navbar-brand" href="index_1.html">DeliciousFood</a>
          <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#site-nav" aria-controls="site-nav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="oi oi-menu"></span> Menu
          </button>
          <div class="collapse navbar-collapse" id="site-nav">
            <ul class="navbar-nav ml-auto">
              <li class="nav-item active"><a href="staffhome.jsp" class="nav-link">Home</a></li>
              <li class="nav-item active"><a class="nav-link"><% if (request.getSession(false).getAttribute("staff") != null) { %> ${staff.staffname} <% } else { %> Staff <% } %></a></li>
            </ul>
          </div>
        </div>
      </nav>
        
      <section class="site-cover" style="background:black;height: 400px;" id="section-home">
        <h1 style="padding-top:200px; text-align:center; visibility:hidden;" class="site-heading site-animate mb-3">
          <p style="color:#b8b8b8;">Order History</p>
        </h1>
      </section>
            
            <br /><br />
                
        <table class="fold-table">
        <thead>
          <tr>
            <th>Order ID</th><th>Order Date</th><th>Order Status</th><th>Coupon Code</th>
          </tr>
        </thead>
        <%
                    for (int i = 0; i < orderList.size(); i++) {
                        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
                        String orderDate = sm.format(orderList.get(i).getOrderdate());
                        

                       
                  %> 
        <tbody>
            
               
          <tr class="view">
            <td><%= orderList.get(i).getOrderid()%></td>
            <td><%= orderDate %></td>
            <td><%= orderList.get(i).getOrderstatus()%></td>
            <td><%= orderList.get(i).getCouponcode() %></td>
           
          </tr>
          
          
               
        </tbody>
        <%}%>   
      </table>
          
                
                
            <div class="buttongroup1">
             
             
                <a href="staffhome.jsp"class="backorder"style="margin-right:36%;">Back</a>
             
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
