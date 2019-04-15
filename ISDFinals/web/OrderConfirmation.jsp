<%-- 
    Document   : cart
    Created on : Apr 2, 2019, 2:05:32 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Confirmation</title>
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
        
        <nav class="navbar navbar-expand-lg navbar-dark site_navbar bg-dark site-navbar-light" id="site-navbar">
      <div class="container">
        <a class="navbar-brand" href="index_1.html">DeliciousFood</a>
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
           
            <h1  style="padding-top:200px; text-align:center; visibility:hidden;"class="site-heading site-animate mb-3"><p style="color:#b8b8b8;">Order Confirmation</p></h1>
            <h2 style="text-align:center;"class="h5 site-subheading mb-5 site-animate"><p style="color:#b8b8b8;"></p></h2>    
         
        </section>
        
       <div class="container">
        <div class="row align-items-center justify-content-center text-center site-vh-100">
          <div class="col-md-12">
            
            <div class="container-fluid">
  <br /><br />
  <ul class="list-unstyled multi-steps">
    <li>Choose Meal</li>
    <li>Your Order</li>
    <li class="is-active">Order Confirmation</li>
    <li>Payment</li>
  </ul>
</div>
<div class="shopping-cart">

  <div class="column-labels">
    <label class="product-image">Image</label>
    <label class="product-details">Product</label>
    <label class="product-quantity">Quantity</label>
    <label class="product-price">Credit Points</label>

    
  </div>

  <div class="product">
    <div class="product-image">
      <img src="https://s.cdpn.io/3/dingo-dog-bones.jpg">
    </div>
    <div class="product-details">
      <div class="product-title">Dingo Dog Bones</div>
      <p class="product-description">The best dog bones of all time. Holy crap. Your dog will be begging for these things! I got curious once and ate one myself. I'm a fan.</p>
    </div>
    
    <div class="product-quantity">
      3
    </div>
    <div class="product-price">45.99</div>
    
 
  </div>

  <div class="product">
    <div class="product-image">
      <img src="https://s.cdpn.io/3/large-NutroNaturalChoiceAdultLambMealandRiceDryDogFood.png">
    </div>
    <div class="product-details">
      <div class="product-title">Nutro™ Adult Lamb and Rice Dog Food</div>
      <p class="product-description">Who doesn't like lamb and rice? We've all hit the halal cart at 3am while quasi-blackout after a night of binge drinking in Manhattan. Now it's your dog's turn!</p>
    </div>
    
    <div class="product-quantity">
      2
    </div>
    <div class="product-price">45.99</div>
    
    
  </div>

  <div class="totals">
    <div class="totals-item">
      <label style="">Total</label>
      <div class="totals-value">71.97</div>
    </div>
    
    </div>
  </div>
    <div class="buttongroup1">
      <form action="Payment.jsp" method="post">
        <button class="checkout">Confirm Order</button>
      </form>
     
      <form action="cart.jsp" method="post">
        <button class="backorder">Back To Cart</button>
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
