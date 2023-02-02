package com.ty.controller;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ty.dao.Student;
import com.ty.dto.StudentDao;
@WebServlet("/login")
public class StudentLoginCon extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Scanner scanner=new Scanner(System.in);
		String email=req.getParameter("email");
		
		String password=req.getParameter("password");
		
		
		StudentDao dao=new StudentDao();
		Student student=dao.findStudentByEmail(email);
		
		if(student.getPassword().equals(password))
					{
			
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("email", email);
			List<Student> list=dao.getAll();
	
			req.setAttribute("student", list);
			RequestDispatcher dispatcher=req.getRequestDispatcher("home.jsp"); 
			
			dispatcher.forward(req, resp);
			
			
				
			}
		
		else
		{	req.setAttribute("Invalid", "Invalid Password");
		
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.include(req, resp);
//			<% String str=(String)request.getAttribute("Invalid"); 
//			if(str!=null){ %> 
//			 <%=str %> <% }
//			%>
		}
		
	}
	
}
