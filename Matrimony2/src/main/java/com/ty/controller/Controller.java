package com.ty.controller;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.net.http.HttpRequest;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dao.FemaleDao;
import com.ty.dao.MaleDao;
import com.ty.dto.FemaleDto;
import com.ty.dto.MaleDto;

@WebServlet("/signup")
public class Controller extends HttpServlet {
	MaleDao dao = new MaleDao();
	FemaleDao dao2 = new FemaleDao();
	MaleDto dto = new MaleDto();
	FemaleDto dto2 = new FemaleDto();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String gen = (String) req.getParameter("gender");
		String name = req.getParameter("name").toLowerCase();

		if (gen.equalsIgnoreCase("male")) {

			dto.setName(req.getParameter("name").toLowerCase());
			dto.setAddress(req.getParameter("address"));
			dto.setAge(Integer.parseInt(req.getParameter("age")));
			dto.setDisabilities(req.getParameter("disabilities"));
			dto.setEmail(req.getParameter("email"));
			dto.setHeight(Double.parseDouble(req.getParameter("height")));
			dto.setPassword(req.getParameter("password"));
			dto.setPhone(Long.parseLong(req.getParameter("phone")));
			dto.setQualification(req.getParameter("qualification"));
			dao.saveMale(dto);
			req.getRequestDispatcher("index.jsp").forward(req, resp);

		} else {
			dto2.setName(req.getParameter("name").toLowerCase());
			dto2.setAddress(req.getParameter("address"));
			dto2.setAge(Integer.parseInt(req.getParameter("age")));
			dto2.setDisabilities(req.getParameter("disabilities"));
			dto2.setEmail(req.getParameter("email"));
			dto2.setHeight(Double.parseDouble(req.getParameter("height")));
			dto2.setPassword(req.getParameter("password"));
			dto2.setPhone(Long.parseLong(req.getParameter("phone")));
			dto2.setQualification(req.getParameter("qualification"));
			dao2.saveFeale(dto2);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}

	}

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String gen = req.getParameter("gender");

//		if (gen.equalsIgnoreCase("male")) {
			if (dao.getByName(name) == null) {
				req.setAttribute("msg", "Signup first");
				req.getRequestDispatcher("signup.jsp").forward(req, resp);

			}
//		}
	else if (dao.getByName(name) != null) {
			if (dao.getByName(name).getPassword().equals(req.getParameter("password"))) {

				req.setAttribute("msg", "Login Success");
				req.getRequestDispatcher("view.jsp").forward(req, resp);
			} else {
				req.setAttribute("msg", "INVALID CREDENTIALS");
				req.getRequestDispatcher("login.jsp").forward(req, resp);
			}
		}
	}

}
