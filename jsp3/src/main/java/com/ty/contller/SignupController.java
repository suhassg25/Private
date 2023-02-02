package com.ty.contller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dao.Userdao;
import com.ty.dto.User;



@WebServlet("/signup")
public class SignupController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User user = new User();	
		user.setName(req.getParameter("name"));
		user.setEmail(req.getParameter("email"));
		user.setCompany(req.getParameter("company"));
		user.setPassword(req.getParameter("password"));
		user.setRole(req.getParameter("role"));
		user.setPhone(Long.parseLong(req.getParameter("number")));
		
		Userdao userdao=new Userdao();
		userdao.saveUser(user);
		
		req.setAttribute("msg", "Signed up SUCCESFULLY");
		RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp"); //new, cloning, class.forname.instance, newinstance of construcor, serialiser
		dispatcher.forward(req, resp);
		
	}
		

}
