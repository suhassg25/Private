package com.ty.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.ty.dao.Logindao;
import com.ty.dto.Student;

public class LoginController extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String name=req.getParameter("email");
		String password=req.getParameter("password");
		Logindao logindao=new Logindao();
		Student student=logindao.getStudent(name);
		if(student.getPassword().equals(password))
		{	
			RequestDispatcher dispatcher=req.getRequestDispatcher("Dummy.html");
			dispatcher.forward(req, res);
		}
		else
		{
			res.getWriter().print("<html> <body> Invalid password </body> </html>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
					dispatcher.include(req, res);
			
		}
		
	}
	
	

}
