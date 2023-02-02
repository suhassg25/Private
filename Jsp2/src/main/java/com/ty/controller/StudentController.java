package com.ty.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dao.Student;
import com.ty.dto.StudentDao;
@WebServlet("/signup")
public class StudentController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Student student=new Student();
		student.setName(req.getParameter("name"));
		student.setEmail(req.getParameter("email"));
		student.setPassword(req.getParameter("password"));
		student.setPhonenumber(Long.parseLong((req.getParameter("number"))));
		
		StudentDao dao=new StudentDao();
		dao.saveStudent(student);
		
		req.setAttribute("message", "Succesfully Signed up");
		RequestDispatcher dispatcher=req.getRequestDispatcher("signup.jsp");
		dispatcher.forward(req, resp);
		
		
		
	}
}
