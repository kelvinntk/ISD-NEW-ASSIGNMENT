<%-- 
    Document   : Register
    Created on : Apr 8, 2019, 4:04:25 PM
    Author     : User
--%>
<%@page import="Enity.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

  <head>
    <title>Register</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="images/icons/favicon.ico" />
    <link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">

    <link rel="stylesheet" type="text/css" href="fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
    <link rel="stylesheet" type="text/css" href="fonts/iconic/css/material-design-iconic-font.min.css">
    <link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
    <link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">

    <link rel="stylesheet" type="text/css" href="vendor/animsition/css/animsition.min.css">
    <link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
    <link rel="stylesheet" type="text/css" href="vendor/daterangepicker/daterangepicker.css">

    <link rel="stylesheet" type="text/css" href="css/registerutil.css">
    <link rel="stylesheet" type="text/css" href="css/registercss.css">
  </head>

  <body style="background-color: #999999;">
      
      
    <div class="limiter">
      <div class="container-login100">
        <div class="login100-more" style="background-image: url('images/foodbg1.jpg');">
            <a href="home.jsp" class="dis-block txt3 hov1 p-r-30 p-t-10 p-b-10 p-l-30" style="font-size: 20px;">Back</a>
        </div>
        <div class="wrap-login100 p-l-50 p-r-50 p-t-72 p-b-50">
            
          <form class="login100-form validate-form" action="registerServlet" method="post">
            <span class="login100-form-title p-b-59">
            Sign Up
            </span>
            ${errorMsg}
            <div class="wrap-input100 validate-input" data-validate="User ID is required">
              <span class="label-input100">Your ID</span>
              <input class="input100" type="text" name="id" placeholder="EG0001...">
              <span class="focus-input100"></span>
            </div>

            <div class="wrap-input100 validate-input" data-validate="Name is required">
              <span class="label-input100">Full name</span>
              <input class="input100" type="text" name="name" placeholder="Name...">
              <span class="focus-input100"></span>
            </div>

            <div class="wrap-input100 validate-input" data-validate="Valid email is required: ex@abc.xyz">
              <span class="label-input100">Email</span>
              <input class="input100" type="text" name="email" placeholder="example@abc.xyz">
              <span class="focus-input100"></span>
            </div>

            <div class="wrap-input100 validate-input" data-validate="Password is required">
              <span class="label-input100">Password</span>
              <input class="input100" type="password" name="pass" placeholder="*************">
              <span class="focus-input100"></span>
            </div>

            <div class="wrap-input100 validate-input" data-validate="Repeat Password is required">
              <span class="label-input100">Confirm Password</span>
              <input class="input100" type="password" name="rePass" placeholder="*************">
              <span class="focus-input100"></span>
            </div>

            <div class="wrap-input100 validate-input" data-validate="Phone number is required">
              <span class="label-input100">Phone number</span>
              <input class="input100" type="text" name="phone" placeholder="012*******">
              <span class="focus-input100"></span>
            </div>


            <div class="container-login100-form-btn">
              <div class="wrap-login100-form-btn">
                <div class="login100-form-bgbtn"></div>
                <input class="login100-form-btn" type="submit" value="Sign up" style="background-color: #F7DC6F; ">
              </div>

              <a href="login.jsp" class="dis-block txt3 hov1 p-r-30 p-t-10 p-b-10 p-l-30">
	Sign in
                    <i class="fa fa-long-arrow-right m-l-5"></i>
              </a>
            </div>
          </form>
        </div>
      </div>
    </div>

    <script src="vendor/jquery/jquery-3.2.1.min.js"></script>
    <script src="vendor/animsition/js/animsition.min.js"></script>
    <script src="vendor/bootstrap/js/popper.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="vendor/select2/select2.min.js"></script>
    <script src="vendor/daterangepicker/moment.min.js"></script>
    <script src="vendor/daterangepicker/daterangepicker.js"></script>
    <script src="vendor/countdowntime/countdowntime.js"></script>
    <script src="js/register.js"></script>

  </body>

</html>

