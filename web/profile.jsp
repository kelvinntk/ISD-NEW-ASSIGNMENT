<%-- 
    Document   : profile
    Created on : Apr 8, 2019, 3:49:16 PM
    Author     : Kelvin Ng Tiong Kiat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <title>User Profile</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
      
	<link rel="stylesheet" type="text/css" href="css/profilecss.css">
  </head>
  <body style="background-image: url('images/foodbg3.jpg'); background-size: cover">
   <div id="container">
     <form class="login100-form">
        <h2 style="font-size:30px;">Your Profile</h2>
        <div class="wrap-input100">
            <span class="label-input100">Your ID</span>
            <input class="input100" type="text" name="id">
            <span class="focus-input100"></span>
        </div>
        <div class="wrap-input100">
            <span class="label-input100">Full name</span>
            <input class="input100" type="text" name="name">
            <span class="focus-input100"></span>
        </div>
        <div class="wrap-input100">
            <span class="label-input100">Email</span>
            <input class="input100" type="email" name="email">
            <span class="focus-input100"></span>
        </div>
        <div class="wrap-input100">
            <span class="label-input100">Password</span>
            <input class="input100" type="password" name="pass">
            <span class="focus-input100"></span>
        </div>
        <div class="wrap-input100">
            <span class="label-input100">Repeat Password</span>
            <input class="input100" type="password" name="rePass">
            <span class="focus-input100"></span>
        </div>
        <div class="wrap-input100">
            <span class="label-input100">Phone</span>
            <input class="input100" type="text" name="phone">
            <span class="focus-input100"></span>
        </div>
        <div>
            <button class="button">Save</button>
        </div>
    </form>
   </div>
  </body>
</html>
