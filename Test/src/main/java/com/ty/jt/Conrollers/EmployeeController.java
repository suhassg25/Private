package com.ty.jt.Conrollers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ty.jt.Dto.Employee;
import com.ty.jt.Service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping("/signup")
	public ModelAndView signup()
	{
		ModelAndView andView=new ModelAndView();
		andView.addObject("emp", new Employee());
		andView.setViewName("signup.jsp");
		return andView;
	}
	
	
	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute Employee emp)
	{
		service.saveEmp(emp);
		ModelAndView andView=new ModelAndView();
		andView.addObject("emp", new Employee());
		andView.setViewName("login.jsp");
		return andView;
	}
	
	@RequestMapping("/login")
	public ModelAndView logging()
	{
		ModelAndView andView=new ModelAndView();
		andView.setViewName("login.jsp");
		return andView;
	}
	
	@RequestMapping("/log")
	public ModelAndView login(@ModelAttribute Employee emp, HttpServletRequest req, HttpServletResponse res)
	{	
		
		ModelAndView andView=new ModelAndView();
		andView.addObject("emp", new Employee());
		if(service.loginEmp(req.getParameter("email"))!=null)
		{ andView.setViewName("logged.jsp");
			return andView;
		}
		else
		{
			return null;
		}
	}
}

