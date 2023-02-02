package com.ty.springmvc_prc.controller;

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

import com.ty.springmvc_prc.dto.Student;
import com.ty.springmvc_prc.service.StudentService;
 
@Controller
public class StudentController {
	@Autowired
	StudentService service;
	
@RequestMapping("login")
	public ModelAndView get()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("abc.jsp");
		modelAndView.addObject("student",new Student());
		return modelAndView;
	}

@RequestMapping("signup")
public ModelAndView signup()
{
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("signup.jsp");
	modelAndView.addObject("student",new Student());
	return modelAndView;
}
@RequestMapping("savestudent")
public ModelAndView saveStudent(@ModelAttribute Student student)
{
	service.save(student);
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.setViewName("abc.jsp");
	return modelAndView;
	
}
@RequestMapping("loginstudent")
public ModelAndView loginStudent(@ModelAttribute Student student)
{
	Student s=service.log(student);
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.addObject("student",new Student());
	if(s!=null)
	{
		modelAndView.addObject("name",s.getName());
		modelAndView.addObject("slist", service.getAll(student));
		modelAndView.setViewName("view.jsp");
	}
	else
	{
		modelAndView.setViewName("abc.jsp");
	}
	return modelAndView;
	
}

@RequestMapping("view")
public ModelAndView view(@ModelAttribute Student student)
{
	ModelAndView modelAndView=new ModelAndView();
	modelAndView.addObject("student",new Student());
			modelAndView.addObject("slist", service.getAll(student));
		modelAndView.setViewName("view.jsp");
		return modelAndView;
}

@RequestMapping("delete")
public void delete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
{
	service.DeletebyId(Integer.parseInt(req.getParameter("id")));
	req.getRequestDispatcher("view").forward(req, res);
}

@RequestMapping("edit")
public ModelAndView edit(@RequestParam int id)
{
	Student student=service.findByid(id);
	ModelAndView modelAndView= new ModelAndView();
	modelAndView.addObject("student",student);
	modelAndView.setViewName("edit.jsp");
	return modelAndView;
}

@RequestMapping("updatestudent")
public void edit(@ModelAttribute Student student, HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
{
	
	service.update(student);
	req.getRequestDispatcher("view").forward(req, res);	
}


}
