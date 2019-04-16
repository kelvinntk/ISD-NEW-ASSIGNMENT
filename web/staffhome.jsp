<%-- 
    Document   : staffhome
    Created on : Apr 8, 2019, 3:53:42 PM
    Author     : Kelvin Ng Tiong Kiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>Staff Home page</title>
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
    <link rel="stylesheet" href="css/staffhomecss.css">
      
  </head>
          
  <body data-spy="scroll" data-target="#site-navbar" data-offset="200">
    
    <nav class="navbar navbar-expand-lg navbar-dark site_navbar bg-dark site-navbar-light" id="site-navbar">
      <div class="container">
        <a class="navbar-brand" href="">DelicousFood</a>
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
    <!-- END nav -->

    <section class="site-cover" style="background-image: url(images/bg_3.jpg);" id="section-home">
      <div class="container">
        <div class="row align-items-center justify-content-center text-center site-vh-100">
          <div class="col-md-12">
            <h1 class="site-heading site-animate mb-3">Hello ${staff.staffname}</h1>
            <h2 class="h5 site-subheading mb-5 site-animate">Button below will lead you to the process</h2>  
                <div class="profile">
                    <p><a href="staffprofile.jsp" class="btn btn-outline-white btn-lg site-animate">Profile</a></p>
                </div>
                <div class="profileH">
                    Here you can view or edit your profile
                </div>  
                <div class="order">
                    <p><a href="orderList.jsp" class="btn btn-outline-white btn-lg site-animate">Order Lists</a></p>
                </div>
                <div class="orderH">
                    The total pre-order that made from Student
                </div>
                <div class="coupon">
                    <p><a href="coupon.jsp" class="btn btn-outline-white btn-lg site-animate">Coupon</a></p>
                </div>
                <div class="couponH">
                    Insert coupon code to redeem their food
                </div>
                <div class="topup">
                    <p><a href="topUp.jsp" class="btn btn-outline-white btn-lg site-animate">Top up</a></p>
                </div>
                <div class="topupH">
                    Insert student credit point
                </div>
                    <p><a href="logoutServlet" class="btn btn-outline-white btn-lg site-animate">Log out</a></p>
          </div>
        </div>
      </div>
    </section>
    <!-- END section -->

    <!-- loader -->
    <div id="site-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>


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
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
    <script src="js/google-map.js"></script>
    <script src="js/main.js"></script>
  </body>
</html>
