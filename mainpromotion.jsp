<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>promotions and offers</title>
<link rel="stylesheet" href="web/css/promotion.css">
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;600;700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
	<link rel="stylesheet" href="web/css/styless.css">
</head>
<body>


	<div class="box-area">
		<header>
			<div class="wrapper">
				<div class="content">
						<img class="img" src="web/images/logo.png" alt="logo image">
					</div>
				<nav>
					<a href="Home.jsp">Home</a>
				<a href="mainpromotion.jsp">Promotions & Offers</a>
			
			

				</nav>
			</div>
		</header>
		<div class="bannerarea">

		</div>

		<div class="content-area">
			<div class="wrapper">
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>


<!--Open Content Area-->
		
		
		
		
		<center>

<div class="topic">
					<h1>Promotions & Offers</h1>	
				</div>	
<table class="center"><br>




<tr>
     <th>Promotion ID</th>
     <th>Promotion Details</th>
     <th>Percentage(%)</th>
	 <th>Start Date</th>
	 <th>End Date</th>
	 <th>Update</th>
	 <th>Delete</th>
	
	
	
</tr>	




	
<% 
 try {
	 Class.forName("com.mysql.jdbc.Driver").newInstance();
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/automart","root","200d80*#");
	 String sql="Select * from promotion" ;
	 Statement st=con.createStatement();
	 ResultSet rs=st.executeQuery(sql);
	 while(rs.next()){
		
		 
		 %>
		 <tr>
		 <td name="id"><%=rs.getInt(1)%></td>
		 <td name="details"><%=rs.getString(2)%></td>
		 <td name="precentage"><%=rs.getString(3)%></td>
		 <td name="time" class="td"><%=rs.getString(4)%></td>
		 <td name="time2" class="td"><%=rs.getString(5)%></td>
		 <td><a href='updatepromotion.jsp?id=<%=rs.getInt(1) %>' class="update1">Update</a></td>
		 <td><a href='deletepromotion.jsp?id=<%=rs.getInt(1) %>' class="delete1">Delete</a></td>
		 
		 </tr>
		 <%
	 }
		
					
				
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
%>
	
   
</table>
<br><br><br>
<a href='DiscountMain.jsp' >

<input class="submit"  type="button" name="select customers" value="Select Customers ">

</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp


<a href='PromotionReport.jsp' >
<button type="submit"   name="submit"  class="submit" ><i class="fa fa-download"></i> Genarate Report</button>


</a>



		

  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br><br>		
		
		
       


  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br><br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>


			<footer class="footer">
				 <div class="container">
					<div class="row">
						<div class="footer-col">
							<h4>company</h4>
							<ul>
								<li><a href="#">about us</a></li>
								<li><a href="#">our services</a></li>
								<li><a href="#">privacy policy</a></li>
								<li><a href="#">affiliate program</a></li>
							</ul>
						</div>
						<div class="footer-col">
							<h4>Contact Us</h4>
							<ul>
								<li><a href="#">0112345672</a></li>
								<li><a href="#">0811234567</a></li>
								<li><a href="#">automart@gmail.com</a></li>

							</ul>
						</div>
						<div class="footer-col">
							<h4>online shop</h4>
							<ul>
								<li><a href="#">Inventory</a></li>

							</ul>
						</div>
						<div class="footer-col">
							<h4>follow us</h4>
							<div class="social-links">
								<a href="#"><i class="fab fa-facebook-f"></i></a>
								<a href="#"><i class="fab fa-twitter"></i></a>
								<a href="#"><i class="fab fa-instagram"></i></a>
								<a href="#"><i class="fab fa-linkedin-in"></i></a>
							</div>
						</div>
					</div>
				 </div>
			</footer>

		</div>
	</div>

			
</body>
</html>



    