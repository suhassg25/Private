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
@WebServlet("/delete")
public class DeleteController extends  HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StudentDao dao=new StudentDao();
		int id=Integer.parseInt(req.getParameter("id"));
		Student del=dao.delete(id);
		req.setAttribute("del", del);
		RequestDispatcher dispatcher=req.getRequestDispatcher("delete.jsp");
		dispatcher.forward(req, resp);
	}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
doPost(req, resp);
}
}
