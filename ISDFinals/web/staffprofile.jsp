<%-- 
    Document   : profile
    Created on : Apr 8, 2019, 3:49:16 PM
    Author     : Kelvin Ng Tiong Kiat
--%>
<%@page import="Enity.*"%>
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
     <form class="login100-form" action="staffServlet" method="post">
          <%
            // get session attributes
            Staff staff = (Staff) session.getAttribute("staff");
            // redirect if not logged in
            if (session.getAttribute("staff") == null) {response.sendRedirect("login.jsp");}
            // start of else
            else { // containing the following statements in if-else prevents NullPointerException when logged out
        %>
        <h2 style="font-size:30px;">Your Profile</h2>
        <div class="wrap-input100">
            <span class="label-input100">Your ID</span>
            <input class="input100" type="text" name="id" value="<%=staff.getStaffid()%>" style="color:red;" disabled>
            <span class="focus-input100"></span>
        </div>
        <div class="wrap-input100">
            <span class="label-input100">Full name</span>
            <input class="input100" type="text" name="name" value="<%=staff.getStaffname()%>" >
            <span class="focus-input100"></span>
        </div>
        <div class="wrap-input100">
            <span class="label-input100">Email</span>
            <input class="input100" type="email" name="email" value="<%=staff.getStaffemail()%>">
            <span class="focus-input100"></span>
        </div>
        <div class="wrap-input100">
            <span class="label-input100">Password</span>
            <input class="input100" type="password" name="pass" value="<%=staff.getStaffpass()%>">
            <span class="focus-input100"></span>
        </div>
        
        <div>
            <button href="staffhome.jsp" class="button" style="color: red;">Back</button>
        </div>    
        
        <div>
            <input class="button" type="Submit" value="Save">
        </div>
            
         
        <%
            } // end of else
        %>
    </form>
   </div>
  </body>
</html>
