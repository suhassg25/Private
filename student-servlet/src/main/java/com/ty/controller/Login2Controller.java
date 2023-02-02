package com.ty.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dao.Logindao;
import com.ty.dto.Student;

public class Login2Controller extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
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
		super.doPost(req, res);
	}
		
		
		
	}
	

