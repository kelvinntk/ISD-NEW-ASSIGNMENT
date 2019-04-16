<%-- 
    Document   : report
    Created on : Apr 15, 2019, 9:09:44 PM
    Author     : Kelvin Ng Tiong Kiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Top up</title>
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
        <nav class="navbar navbar-expand-lg navbar-dark site_navbar bg-dark site-navbar-light" id="site-navbar">
        <div class="container">
          <a class="navbar-brand" href="index_1.html">DeliciousFood</a>
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
        <h1 style="padding-top:200px;text-align:center; visibility:hidden;" class="site-heading site-animate mb-3">
          <p style="color:#b8b8b8;">Report</p>
        </h1>
      </section>
            
        <table class="fold-table">
        <thead>
          <tr>
            <th>Order ID</th><th>Student name</th><th>Meal set</th><th>Quantity</th><th>Price (RM)</th>
          </tr>
        </thead>
        <tbody>
          <tr class="view">
            <td>OR0001</td>
            <td>Kelvin</td>
            <td>Breakfast</td>
            <td>1</td>
            <td class="per">6.00</td>
          </tr>
           <tr class="view">
            <td>OR0002</td>
            <td>Jackson</td>
            <td>Lunch</td>
            <td>2</td>
            <td class="per">14.00</td>
          </tr>
           <tr class="view">
            <td>OR0003</td>
            <td>So kian hwa</td>
            <td>Lunch</td>
            <td>2</td>
            <td class="per">12.00</td>
          </tr>
          <tr class="view">
            <td>OR0004</td>
            <td>Irfan</td>
            <td>Breakfast</td>
            <td>1</td>
            <td class="per">6.00</td>
          </tr>
        </tbody>
      </table>
            
      <script src="js/reportjs.js"></script>      
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
