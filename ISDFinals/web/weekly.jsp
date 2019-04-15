<%-- 
    Document   : weekly
    Created on : Apr 8, 2019, 3:46:50 PM
    Author     : Kelvin Ng Tiong Kiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>History</title>
    <link rel="stylesheet" href="css/weeklycss.css">
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


    <nav class="navbar navbar-expand-lg navbar-dark site_navbar bg-dark site-navbar-light" id="site-navbar">
      <div class="container">
        <a class="navbar-brand" href="home.html">DeliciousFood</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#site-nav" aria-controls="site-nav" aria-expanded="false" aria-label="Toggle navigation">
          <span class="oi oi-menu"></span> Menu
        </button>

        <div class="collapse navbar-collapse" id="site-nav">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active"><a href="#section-home" class="nav-link">Home</a></li>
            <li class="nav-item active"><a onclick="myFunction()" href="" class="nav-link">Credit point</a></li>
            <li class="nav-item active"><a href="../login.html" class="nav-link">Student</a></li>
          </ul>
        </div>
      </div>
    </nav>
      
    <section class="site-cover" style="background:black;height: 400px;" id="section-home">
      <h1 style="padding-top:200px; text-align:center; visibility:hidden;" class="site-heading site-animate mb-3">
        <p style="color:#b8b8b8;">Weekly Food Intake</p>
      </h1>
    </section>

    <div class="container">
      <div class="row align-items-center justify-content-center text-center site-vh-100" style="margin-left: 10%;">
        <div class="col-md-12">
          <div class="shopping-cart">
            <div class="column-labels">
              <label class="product-date">Date</label>
              <label class="product-image">Image</label>
              <label class="product-meal">Meal</label>
              <label class="product-Calories">Calories</label>
              <label class="product-price">Credit Points</label>
            </div>

            <div class="product">
             <div></div>
              <div class="product-date">25 May</div>
              <div class="product-image">
                <img src="images/TuaranMee.jpg">
              </div>
              <div class="product-meal">
                <div class="product-title">Tuaran Mee</div>
              </div>

              <div class="product-Calories">
                2
              </div>
              <div class="product-price">RM 12</div>
            </div>
              
            <div class="product">
              <div class="product-date">26 May</div>
              <div class="product-image">
                <img src="https://s.cdpn.io/3/large-NutroNaturalChoiceAdultLambMealandRiceDryDogFood.png">
              </div>
              <div class="product-meal">
                <div class="product-title">Nutro™ Adult Lamb and Rice Dog Food</div>
              </div>

              <div class="product-Calories">
                1
              </div>
              <div class="product-price">RM 10</div>
            </div>
              
          </div>
          <div class="buttongroup1">
            <form action="studenthome.html" method="post">
              <button class="backorder">Back To Home</button>
            </form>
          </div>
        </div>
      </div>
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

