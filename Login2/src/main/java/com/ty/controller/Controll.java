package com.ty.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Controll extends HttpServlet{
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String name=req.getParameter("email");
			String pwd=req.getParameter("password");
			
//			Cookie cookie=new Cookie(name,pwd);
//			resp.addCookie(cookie);
//			Cookie [] cs=req.getCookies();
//			for(Cookie c : cs)
//			{
//				resp.getWriter().println(c.getValue());
//				
//			}
			
			HttpSession httpSession=req.getSession();
			httpSession.setAttribute("email", name);
			httpSession.setAttribute("password", pwd);
			RequestDispatcher dispatcher=req.getRequestDispatcher("/product");
			dispatcher.forward(req, resp);
		}

	}


