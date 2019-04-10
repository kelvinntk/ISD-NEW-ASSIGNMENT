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
        <title>Cart</title>
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
                  <li>Order Confirmation</li>
                  <li>Payment</li>
                </ul>
          </div>
<div class="shopping-cart">

  <div class="column-labels">
    <label class="product-image">Image</label>
    <label class="product-details">Product</label>
    <label class="product-quantity">Quantity</label>
    <label class="product-price">Credit Points</label>
    <label class="product-removal">Remove</label>
    
  </div>

  <div class="product">
    <div class="product-image">
      <img src="images/TuaranMee.jpg">
    </div>
    <div class="product-details">
      <div class="product-title">Tuaran Mee</div>
      <p class="product-description">Noodle that has tuaran style fry with vegetable, char siu and pork egg roll.</p>
    </div>
    
    <div class="product-quantity">
      <input type="number" value="2" min="1">
    </div>
    <div class="product-price">45.99</div>
    <div class="product-removal">
      <button class="remove-product" >
        Remove
      </button>
    </div>
 
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
      <input style="width:40px;"type="number" value="1" min="1">
    </div>
    <div class="product-price">45.99</div>
    <div class="product-removal">
      <button class="remove-product">
        Remove
      </button>
    </div>
    
  </div>

  <div class="totals">
    <div class="totals-item" style="float: right; clear: both;width: 100%;
    margin-bottom: 10px;margin-right: 20%;">
      <label style="float: left;clear: both;width: 79%;text-align: right;">Total</label>
      <div class="totals-value" style="text-align: right;margin-right: 40px;">71.97</div>
    </div>
    
    </div>
  </div>
  <div class="buttongroup1">
      <form action="OrderConfirmation.jsp" method="post">
        <button class="checkout">Proceed Order</button>
      </form>
     
      <button class="update">Update</button>
      <form action="Menu.jsp" method="post">
        <button class="backorder">Back To Order</button>
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
