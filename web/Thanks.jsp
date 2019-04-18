<%-- 
    Document   : cart
    Created on : Apr 2, 2019, 2:05:32 PM
    Author     : User
--%>
<jsp:useBean id="student" scope="session" class="Enity.Student" />
<%@page import="Enity.*"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payment</title>
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
        
        <%
            String totalStr = request.getParameter("total");
            int total = Integer.parseInt(totalStr);
            System.out.println(total);
        %>

       <div class="collapse navbar-collapse" id="site-nav">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item active"><a href="" class="nav-link">Home</a></li>
            <li class="nav-item active"><a href="" class="nav-link">Credit point: <%=student.getCredpoint()%></a></li>
            <li class="nav-item active"><a href="" class="nav-link"><% if (request.getSession(false).getAttribute("student") != null) { %> ${student.studname} <% } else { %> Student <% } %></a></li>
          </ul>
        </div>
      </div>
    </nav>
        <section class="site-cover" style="background:black;height: 400px;" id="section-home">
           
            <h1  style="padding-top:200px;text-align:center; visibility:hidden;"class="site-heading site-animate mb-3"><p style="color:#b8b8b8;">Your Payment</p></h1>
            
         
        </section>
        
     
            
            <div class="container-fluid">
  <br /><br />
  <ul class="list-unstyled multi-steps">
    <li>Choose Meal</li>
    <li>Your Order</li>
    <li>Order Confirmation</li>
    <li>Payment</li>
  </ul>
</div>


      
    <div class="totals-item" style="margin-top:120px;float: center; clear: both;width: 100%;
    margin-right: 20%;">
        <form action="paymentServlet?total=<%=total%>&student=<%=student.getStudid()%>" method="post">    
            <label style="clear: both;width: 100%;text-align: center;"><font size="6"><b>Total deducted balance will be: <%= total%> Credit point</b></font></label> 
            <label style="clear: both;width: 100%;text-align: center;"><font size="3"><b>Proceed to payment? Are you sure?</b></font></label> 
           <div class="buttongroup1" style="margin-bottom:50px;padding-top:100px;">  
               <input type="submit" style="float:none; margin-top:10px;margin-left:51%;"class="backorder" value="Confirm Payment?">
                <a href="OrderCart.jsp"style="float:none; margin-top:10px;margin-left:51%;"class="backorder">Back</a>      
          </div>
        </form>
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
