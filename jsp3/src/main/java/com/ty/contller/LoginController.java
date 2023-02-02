package com.ty.contller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ty.dao.Userdao;
import com.ty.dto.User;
@WebServlet("/login")
public class LoginController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession=req.getSession();
		
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		req.setAttribute("email", email);
		
		Userdao userdao=new Userdao();
		User u= userdao.findUserByEmail(email);
		if(u!=null)
		{
			if(u.getPassword().equals(password))
			{
				if(u.getRole().equals("Manager")) {
				req.setAttribute("log", "Login Succesfull as Manager"); 
				req.getRequestDispatcher("menuopt.jsp").include(req, resp); ///menu items
				}
				else
				{
					req.setAttribute("log", "Login Succesfull as Staff");
					req.getRequestDispatcher("login.jsp").include(req, resp); ///products items
					
				}
			}
		}
				
		
		
	}

}
