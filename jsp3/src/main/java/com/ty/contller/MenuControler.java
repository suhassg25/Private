package com.ty.contller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dao.Menudao;
import com.ty.dao.Userdao;
import com.ty.dto.Menu;
import com.ty.dto.User;

@WebServlet("/createmenu")
public class MenuControler extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Menudao menudao = new Menudao();
		Menu menu=new Menu();
		menu.setName(req.getParameter("createmenu"));
		menudao.saveMenu(menu);
		
		
		
	}
}
