<%-- 
    Document   : Menu
    Created on : Mar 16, 2019, 3:52:55 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
           
            <h1  style="padding-top:200px; text-align:center; visibility:hidden;"class="site-heading site-animate mb-3"><p style="color:#b8b8b8;">Menu</p></h1>
            <h2 style="text-align:center;"class="h5 site-subheading mb-5 site-animate"><p style="color:#b8b8b8;">Our menu include breakfast &amp; lunch.</p></h2>    
         
        </section>
        
       <div class="container">
        <div class="row align-items-center justify-content-center text-center site-vh-100">
          <div class="col-md-12">
            
            <div class="container-fluid">
            <br /><br />
            <ul class="list-unstyled multi-steps">
              <li class="is-active">Choose Meal</li>
              <li>Your Order</li>
              <li>Order Confirmation</li>
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
                  <div class="col-md-6 site-animate">
                    <div class="media menu-item">
                      <img class="mr-3" src="images/dim-sum.jpg" class="img-fluid" >
                      <div class="media-body">
                        <h5 class="mt-0">Chinese Dumplings</h5>
                        <p>Chinese cuisine made with chicken meat.</p>
                        <h6 class="text-primary menu-price">9 credit points</h6>
                        <button class="button">Order Now</button>
                      </div>
                    </div>
                  </div>
                        <div class="col-md-6 site-animate">
                    <div class="media menu-item">
                      <img class="mr-3" src="images/har gao.jpeg" class="img-fluid" >
                      <div class="media-body">
                        <h5 class="mt-0">Prawn Dumplings</h5>
                        <p>Chinese cuisine made with prawn and few slices of vegetables.</p>
                        <h6 class="text-primary menu-price">8 credit points</h6>
                        <button class="button">Order Now</button>
                      </div>
                    </div>
                        </div>
                    <div class="col-md-6 site-animate">
                    <div class="media menu-item">
                      <img class="mr-3" src="images/siumai.jpg" class="img-fluid">
                      <div class="media-body">
                        <h5 class="mt-0">Siu Mai</h5>
                        <p>Chinese cuisine made with pork.</p>
                        <h6 class="text-primary menu-price">5 credit points</h6>
                        <button class="button">Order Now</button>
                      </div>
                    </div>

                  </div>
                  <div class="col-md-6 site-animate">
                    <div class="media menu-item">
                      <img class="mr-3" src="images/CantoneeseDumpling.jpg" class="img-fluid">
                      <div class="media-body">
                        <h5 class="mt-0">Cantoneese Dumplings</h5>
                        <p>Chinese cuisine fried with chicken meat and crunch taste.</p>
                        <h6 class="text-primary menu-price">7 credit points</h6>
                        <button class="button">Order Now</button>
                      </div>
                    </div>
                  </div>
                      <div class="col-md-6 site-animate">
                    <div class="media menu-item">
                      <img class="mr-3" src="images/liushabao.png" class="img-fluid">
                      <div class="media-body">
                        <h5 class="mt-0">Liu Sha Bao</h5>
                        <p>Chinese cuisine bun steamed with custard sauce.</p>
                        <h6 class="text-primary menu-price">6 credit points</h6>
                        <button class="button">Order Now</button>
                      </div>
                    </div>
                      </div>
                      <div class="col-md-6 site-animate">
                    <div class="media menu-item">
                      <img class="mr-3" src="images/steamedporkbuns.jpg" class="img-fluid">
                      <div class="media-body">
                        <h5 class="mt-0">Steamed Pork Buns</h5>
                        <p>Chinese cuisine buns steamed with pork.</p>
                        <h6 class="text-primary menu-price">8 credit points</h6>
                        <button class="button">Order Now</button>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
              <div class="tab-pane fade" id="pills-lunch" role="tabpanel" aria-labelledby="pills-lunch-tab">
                <div class="row">
                  <div class="col-md-6 site-animate">

                    <div class="media menu-item">
                      <img class="mr-3" src="images/LunchHainaneseChickenRice.jpg" class="img-fluid">
                      <div class="media-body">
                        <h5 class="mt-0">Hainanese Chicken Rice</h5>
                        <p>Chicken Rice with some hainan flavour chicken.</p>
                        <h6 class="text-primary menu-price">8 credit points</h6>
                        <button class="button">Order Now</button>
                      </div>
                    </div>
                  </div>
                    <div class="col-md-6 site-animate">
                    <div class="media menu-item">
                      <img class="mr-3" src="images/PanMee.jpg" class="img-fluid">
                      <div class="media-body">
                        <h5 class="mt-0">Pan Mee</h5>
                        <p>Pan Mee cook with porks and few vegetable slices.</p>
                        <h6 class="text-primary menu-price">6 credit points</h6>
                        <button class="button">Order Now</button>
                      </div>
                    </div>
                    </div>
                    <div class="col-md-6 site-animate">
                    <div class="media menu-item">
                      <img class="mr-3" src="images/SangNyukMian.jpg" class="img-fluid" >
                      <div class="media-body">
                        <h5 class="mt-0">Sang Nyuk Mee</h5>
                        <p>Noodle that cook with porks and few vegetable slices.</p>
                        <h6 class="text-primary menu-price">8 credit points</h6>
                        <button class="button">Order Now</button>
                      </div>
                    </div>
                  </div>
                  <div class="col-md-6 site-animate">
                    <div class="media menu-item">
                      <img class="mr-3" src="images/TuaranMee.jpg" class="img-fluid" >
                      <div class="media-body">
                        <h5 class="mt-0">Tuaran Mee</h5>
                        <p>Noodle that has tuaran style fry with vegetable, char siu and pork egg roll.</p>
                        <h6 class="text-primary menu-price">8 credit points</h6>
                        <button class="button">Order Now</button>
                      </div>
                    </div>
                  </div>
                    <div class="col-md-6 site-animate">
                    <div class="media menu-item">
                      <img class="mr-3" src="images/fishsauce.jpg" class="img-fluid">
                      <div class="media-body">
                        <h5 class="mt-0">Fish Sauce MeeHoon</h5>
                        <p>Mee Hoon fry with fish sauce, fish meat and vegetables.</p>
                        <h6 class="text-primary menu-price">9 credit points</h6>
                        <button class="button">Order Now</button>
                      </div>
                    </div>
                    </div>
                    <div class="col-md-6 site-animate">
                    <div class="media menu-item">
                      <img class="mr-3" src="images/sweet.JPG" class="img-fluid">
                      <div class="media-body">
                        <h5 class="mt-0">Sweet And Sour Fish Rice</h5>
                        <p>Rice with sweet and sour flavour on fresh fish meat.</p>
                        <h6 class="text-primary menu-price">10 credit points</h6>
                        <button class="button">Order Now</button>
                      </div>
                    </div>

                    
                  </div>
                </div>
              </div>
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
