package com.ty.demo.springboot_prc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ty.demo.springboot_prc.dto.Student;

@RestController
public class StudentController {
	
	@GetMapping("print")
	public void print()
	{

		System.out.println("print url was hit");

	}
	
	@PostMapping("save")
	public void save()
	{
		System.out.println("save Student url was hit");
	}
	
	@PostMapping("student")
	public void get(@RequestBody Student student)
	{
		System.out.println(student);
	}
	@PutMapping("get") //http://localhost:8080/get?id=10
	public void get(@RequestParam int id) {
		System.out.println(id);
	}
	
	@PostMapping("delete/{id}")  ////http://localhost:8080/delete/100
	public void pathvar(@PathVariable int id)
	{
		System.out.println(id);
	}

}
