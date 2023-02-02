package com.ty.spring2.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.spring2.dto.Employee;
import com.ty.spring2.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService serv;
	
	@RequestMapping("login")
	public ModelAndView get()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("employee", new Employee());
		modelAndView.setViewName("login.jsp");
		return modelAndView;
		
	}
	@RequestMapping("signup")
	public ModelAndView signup()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("signup.jsp");
		modelAndView.addObject("emp", new Employee());
		return modelAndView;
		
	}
	@RequestMapping("saveemployee")
	public ModelAndView save(@ModelAttribute Employee emp)
	{
		serv.save(emp);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("login.jsp");
		return modelAndView;
	}
	@RequestMapping("loginemployee")
	public ModelAndView login(@ModelAttribute Employee employee)
	{
		Employee emp=serv.login(employee);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("employee", new Employee());
		if(emp!=null)
		{
			modelAndView.addObject("slist", serv.getAll(emp));
			modelAndView.setViewName("view.jsp");
		}
		else
		{
			modelAndView.setViewName("login.jsp");
		}
		return modelAndView;
	}
	@RequestMapping("view")
	public ModelAndView view (@ModelAttribute Employee employee)
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("employee", new Employee());
		modelAndView.addObject("slist", serv.getAll(employee));
		modelAndView.setViewName("view.jsp");
		return modelAndView;
	}
	
	@RequestMapping("delete")
	public ModelAndView delete(@RequestParam int id)
	{
		serv.Delete(id);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("view");
		return modelAndView;
	}
	
	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam int id)
	{
		Employee employee=serv.findbyId(id);
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("emp",employee);
		modelAndView.setViewName("update.jsp");
		return modelAndView;
		}
	@RequestMapping("updateemployee")
	public void update(@ModelAttribute Employee employee, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		serv.update(employee);
		req.getRequestDispatcher("view").forward(req, res);
	}

}
 