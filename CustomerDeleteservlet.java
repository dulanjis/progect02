package com.Customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.promotionandoffers.PromoDButil;

/**
 * Servlet implementation class CustomerDeleteservlet
 */
@WebServlet("/CustomerDeleteservlet")
public class CustomerDeleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		String id=request.getParameter("id");
		
		boolean istrue;
		istrue=customerDButil.deletecustomer(id);
		
		if(istrue==true)
		{

		
			RequestDispatcher dis=request.getRequestDispatcher("Home.jsp");
			dis.forward(request,response);
		}
		else
		{
			RequestDispatcher dis2=request.getRequestDispatcher("Customerprofile.jsp");
			dis2.forward(request,response);
			
		}
	}

}
