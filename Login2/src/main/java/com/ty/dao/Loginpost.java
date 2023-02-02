package com.ty.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Loginpost extends HttpServlet
/*{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email=req.getParameter("email");	
	String pwd=req.getParameter("password");
	
	ServletContext context=getServletContext();
	ServletConfig config=getServletConfig();
	
	String gst=context.getInitParameter("GST");
	String rtax	=config.getInitParameter("kar");
	
	resp.getWriter().print("<html> <body> <h2> Email is "+ email+ "<br> Password is "+ pwd+ "<br> GST : "+ gst+ " ROAD TAX "+ rtax+ " </h2> </body> </html>");

	}
	*/
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email=req.getParameter("email");	
		String pwd=req.getParameter("password");
		
		
		
	}

}
