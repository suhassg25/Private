package com.ty.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ty.dao.Student;
import com.ty.dto.StudentDao;

@WebServlet("/view")
public class ViewController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession();
		httpSession.getAttribute("email");
		String email=req.getParameter("email");
		if(email!=null)
		{
			int id = Integer.parseInt(req.getParameter("id"));
		
			StudentDao dao = new StudentDao();
			
			Student std = dao.getByID(id);
			req.setAttribute("id", std);

			

			RequestDispatcher dispatcher = req.getRequestDispatcher("view.jsp");
			dispatcher.forward(req, resp);
		}
		else
		{
			req.setAttribute("invalid", "ACCESS DENIED");

		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

}
