<%-- 
    Document   : Menu
    Created on : Mar 16, 2019, 3:52:55 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Enity.*, java.util.*" %>
<% List<Food> foodList = (List<Food>) session.getAttribute("foodList");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Food Menu</title>
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
            Manager manager = (Manager) session.getAttribute("manager");
            // redirect if not logged in
            if (session.getAttribute("manager") == null) {response.sendRedirect("login.jsp");}
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
            <li class="nav-item active"><a href="managerhome.jsp" class="nav-link">Home</a></li>
            <li class="nav-item active"><a class="nav-link"><% if (request.getSession(false).getAttribute("manager") != null) { %> ${manager.managername} <% } else { %> Manager <% } %></a></li>
          </ul>
        </div>
      </div>
    </nav>
        <section class="site-cover" style="background:black;height: 400px;" id="section-home">
           
            <h1  style="padding-top:200px; text-align:center; visibility:hidden;"class="site-heading site-animate mb-3"><p style="color:#b8b8b8;">Food Menu</p></h1>
        </section>
        <br /><br />
       <div class="container">
        <div class="row align-items-center justify-content-center text-center site-vh-100">
          <div class="col-md-12">
           
              <div class="tab-content text-left">
              <div class="tab-pane fade show active" id="pills-breakfast" role="tabpanel" aria-labelledby="pills-breakfast-tab">
                
                  <div class="row">
                   <% for(int i=0; i<foodList.size(); i++){
                       Food food = foodList.get(i);
                       
                   %>
                  <div class="col-md-6 site-animate">
                   
                      <div class="media menu-item">
                      
                      <div class="media-body">
                        <h5 class="mt-0"><%= food.getFoodname() %></h5>
                        <h6 class="text-primary menu-price"><%= food.getCalories() + " calories"%></h6>
                            
                            <a href="EditFood.jsp?foodid=<%= food.getFoodid()%>"><button class="button" style="margin-right:200px;float:right;">Edit</button></a>

                      </div>
                    </div>
                
                  </div>
                  <%}%>
                
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
