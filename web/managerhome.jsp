<%-- 
    Document   : Manager home
    Created on : Apr 8, 2019, 3:54:46 PM
    Author     : User
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Enity.*, java.util.*" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Manager's Home</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,400i,700|Raleway" rel="stylesheet">
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
    <link rel="stylesheet" href="css/managerhome.css">
      
  </head>
          
  <body data-spy="scroll" data-target="#site-navbar" data-offset="200">
    
    <nav class="navbar navbar-expand-lg navbar-dark site_navbar bg-dark site-navbar-light" id="site-navbar">
      <div class="container">
        <a class="navbar-brand">DelicousFood</a>
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
    <!-- END nav -->


    <section class="site-cover" style="background-image: url(images/bg_3.jpg);" id="section-home">
      <div class="container">
        <div class="row align-items-center justify-content-center text-center site-vh-100">
          <div class="col-md-12">
            <h1 class="site-heading site-animate mb-3">Hello Manager ${manager.managername}</h1>
            <h2 class="h5 site-subheading mb-5 site-animate">Welcome to DeliciousFood</h2> 
            
                <div class="addfood">
                    <p><a href="AddFood.jsp" class="btn btn-outline-white btn-lg site-animate">Add Food</a></p>    
                </div>
                <div class="addfoodH">
                    Add more food details.
                </div>
                <div class="addmeal">
                    <p><a href="AddMeal.jsp" class="btn btn-outline-white btn-lg site-animate">Add Meal</a></p>   
                </div> 
                <div class="addmealH">
                    Add more meal details.
                </div>    
            <div class="report">  
            <p><a href="report.jsp" class="btn btn-outline-white btn-lg site-animate">Report</a></p>
            </div> 
            <div class="reportH">
                Here can view monthly report.
            </div>
            <div class="mealmenu">
                <p><a href="managermenu.jsp" class="btn btn-outline-white btn-lg site-animate">Meal Menu</a></p>
            </div>
            <div class="mealmenuH">
                Here can edit the Meal Menu.
            </div>   
            <div class="menu">
                <p><a href="FoodMenu.jsp" class="btn btn-outline-white btn-lg site-animate">Food Menu</a></p>
            </div>
            <div class="menuH">
                Here can edit the Food Menu.
            </div>    
            <p><a href="logoutServlet" class="btn btn-outline-white btn-lg site-animate">Log out</a></p> <!-- Display alert msg then back to HOME page-->
          </div>
        </div>
      </div>
    </section>
    <!-- END section -->
    <script src="js/jquery.min.js"></script>
    <script src="js/popper.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.easing.1.3.js"></script>
    <script src="js/jquery.waypoints.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.magnific-popup.min.js"></script>
    <script src="js/bootstrap-datepicker.js"></script>
    <script src="js/jquery.timepicker.min.js"></script>
    <script src="js/jquery.animateNumber.min.js"></script>
    <script src="js/main.js"></script>
    
  </body>
</html>